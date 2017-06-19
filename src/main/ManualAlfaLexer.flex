package com.dmgburg.alfa.psi.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.dmgburg.alfa.psi.AlfaTypes.*;

%%

%{
  public _AlfaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _AlfaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

WHITE_SPACE=\s+
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*
Identifier = [:jletter:] [:jletterdigit:]*
STRINGDQ=\"[^\"]*\"|'[^']*'
STRINGSQ='[^']*'|'[^']*'


%state STRING

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return WHITE_SPACE; }

  "."                         { return DOT; }
  "{"                         { return CURVE1; }
  "}"                         { return CURVE2; }
  "&&"                        { return AND; }
  "||"                        { return OR; }
  "<="                        { return LESSOREQUAL; }
  ">="                        { return MOREOREQUAL; }
  "<"                         { return LESS; }
  ">"                         { return MORE; }
  "+"                         { return PLUS; }
  "-"                         { return MUNUS; }
  "*"                         { return MULTIPLY; }
  "/"                         { return DIVIDE; }
  "=="                        { return EQUAL; }
  "namespace"                 { return NAMESPACE; }
  "policyset"                 { return POLICYSET; }
  "policy"                    { return POLICY; }
  "target"                    { return TARGET; }
  "clause"                    { return CLAUSE; }
  "apply"                     { return APPLY; }
  "rule"                      { return RULE; }
  "condition"                 { return CONDITION; }
  "function"                  { return FUNCTION; }
  "permit"                    { return PERMIT; }
  "deny"                      { return DENY; }
  "on"                        { return ON; }
  "oblegationOrAdviceBody"    { return OBLEGATIONORADVICEBODY; }
  "DecimalIntegerLiteral"     { return DECIMALINTEGERLITERAL; }

  {Identifier}                { return IDENTIFIER; }

  {STRINGDQ}| {STRINGSQ}     { return STRING_LITERAL; }
}

[^] { return BAD_CHARACTER; }
