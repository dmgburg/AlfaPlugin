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

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
LETTERS=[a-zA-Z]+
STRINGDQ=\"[^\"]*\"|'[^']*'
STRINGSQ='[^']*'|'[^']*'
DIGIT=[0-9]
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*[\s\S]*?\*"/"

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

  {SPACE}                     { return SPACE; }
  {LETTERS}                   { return LETTERS; }
  {STRINGDQ}                  { return STRINGDQ; }
  {STRINGSQ}                  { return STRINGSQ; }
  {DIGIT}                     { return DIGIT; }
  {LINE_COMMENT}              { return LINE_COMMENT; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
