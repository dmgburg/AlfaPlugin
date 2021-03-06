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

IDENTIFIER=[a-zA-Z_0-9]+
WHITE_SPACE=[ \t\n\x0B\f\r]+
STRING_LITERAL=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*?\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return WHITE_SPACE; }

  "."                        { return DOT; }
  "{"                        { return CURVE1; }
  "}"                        { return CURVE2; }
  "&&"                       { return AND; }
  "||"                       { return OR; }
  "<="                       { return LESSOREQUAL; }
  ">="                       { return MOREOREQUAL; }
  "<"                        { return LESS; }
  ">"                        { return MORE; }
  "+"                        { return PLUS; }
  "-"                        { return MUNUS; }
  "*"                        { return MULTIPLY; }
  "/"                        { return DIVIDE; }
  "=="                       { return EQUAL; }
  "="                        { return ASSIGN; }
  ":"                        { return COLON; }
  "namespace"                { return NAMESPACE; }
  "policyset"                { return POLICYSET; }
  "policy"                   { return POLICY; }
  "target"                   { return TARGET; }
  "clause"                   { return CLAUSE; }
  "musteepresent"            { return MUSTEEPRESENT; }
  "issuer"                   { return ISSUER; }
  "apply"                    { return APPLY; }
  "rule"                     { return RULE; }
  "condition"                { return CONDITION; }
  "function"                 { return FUNCTION; }
  "permit"                   { return PERMIT; }
  "deny"                     { return DENY; }
  "on"                       { return ON; }
  "obligation"               { return OBLIGATION; }
  "advice"                   { return ADVICE; }
  "attribute"                { return ATTRIBUTE; }
  "id"                       { return ID; }
  "type"                     { return TYPE; }
  "category"                 { return CATEGORY; }
  "ruleCombinator"           { return RULECOMBINATOR; }
  "policyCombinator"         { return POLICYCOMBINATOR; }
  "bag"                      { return BAG; }
  "anyAtomic"                { return ANYATOMIC; }
  "anyAtomicOrBag"           { return ANYATOMICORBAG; }
  "infix"                    { return INFIX; }
  "comm"                     { return COMM; }
  "allowbags"                { return ALLOWBAGS; }
  "inv"                      { return INV; }
  "import"                   { return IMPORT; }
  "DecimalIntegerLiteral"    { return DECIMALINTEGERLITERAL; }
  "true"                     { return TRUE; }
  "false"                    { return FALSE; }

  {IDENTIFIER}               { return IDENTIFIER; }
  {WHITE_SPACE}              { return WHITE_SPACE; }
  {STRING_LITERAL}           { return STRING_LITERAL; }
  {LINE_COMMENT}             { return LINE_COMMENT; }
  {BLOCK_COMMENT}            { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
