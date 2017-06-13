// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.dmgburg.alfa.psi.AlfaTypes.*;
import static com.dmgburg.alfa.psi.parser.AlfaParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AlfaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == IDENTIFIER) {
      r = Identifier(b, 0);
    }
    else if (t == SIGN) {
      r = Sign(b, 0);
    }
    else if (t == STRING_LITERAL) {
      r = StringLiteral(b, 0);
    }
    else if (t == ATTRIBUTE_DESIGNATOR) {
      r = attributeDesignator(b, 0);
    }
    else if (t == ATTRIBUTE_DESIGNATOR_ISSUER) {
      r = attributeDesignatorIssuer(b, 0);
    }
    else if (t == ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT) {
      r = attributeDesignatorMustBePresent(b, 0);
    }
    else if (t == ATTRIBUTE_REF) {
      r = attributeRef(b, 0);
    }
    else if (t == CLAUSE_ADDIN) {
      r = clauseAddin(b, 0);
    }
    else if (t == CLAUSE_ENTRY) {
      r = clauseEntry(b, 0);
    }
    else if (t == CLAUSE_EXPRESSION) {
      r = clauseExpression(b, 0);
    }
    else if (t == CLAUSE_OPERAND) {
      r = clauseOperand(b, 0);
    }
    else if (t == CLAUSE_OPERATOR) {
      r = clauseOperator(b, 0);
    }
    else if (t == COMBINATION_ALGORITHM_REF) {
      r = combinationAlgorithmRef(b, 0);
    }
    else if (t == CONDITION_BODY) {
      r = conditionBody(b, 0);
    }
    else if (t == CONDITION_ENTRY) {
      r = conditionEntry(b, 0);
    }
    else if (t == CONSTANT) {
      r = constant(b, 0);
    }
    else if (t == DESCRIPTION) {
      r = description(b, 0);
    }
    else if (t == EFFECT) {
      r = effect(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == EXPRESSION_ADDIN) {
      r = expressionAddin(b, 0);
    }
    else if (t == EXPRESSIONS) {
      r = expressions(b, 0);
    }
    else if (t == FUNCTION_ARGUMENT) {
      r = functionArgument(b, 0);
    }
    else if (t == FUNCTION_CLAUSE) {
      r = functionClause(b, 0);
    }
    else if (t == FUNCTION_CLAUSE_ARGUMENT) {
      r = functionClauseArgument(b, 0);
    }
    else if (t == FUNCTION_ENTRY) {
      r = functionEntry(b, 0);
    }
    else if (t == FUNCTION_REF) {
      r = functionRef(b, 0);
    }
    else if (t == FUNCTION_REF_NAME) {
      r = functionRefName(b, 0);
    }
    else if (t == ID_DECLARATION) {
      r = idDeclaration(b, 0);
    }
    else if (t == INTEGER_LITERAL) {
      r = integerLiteral(b, 0);
    }
    else if (t == LEFT_CLAUSE_OPERAND) {
      r = leftClauseOperand(b, 0);
    }
    else if (t == NAMESPACE_BODY) {
      r = namespaceBody(b, 0);
    }
    else if (t == NAMESPACE_ENTRY) {
      r = namespaceEntry(b, 0);
    }
    else if (t == NAMESPACE_NAME) {
      r = namespaceName(b, 0);
    }
    else if (t == ON_EFFECT) {
      r = onEffect(b, 0);
    }
    else if (t == OPERAND) {
      r = operand(b, 0);
    }
    else if (t == OPERATOR) {
      r = operator(b, 0);
    }
    else if (t == POLICY_BODY) {
      r = policyBody(b, 0);
    }
    else if (t == POLICY_ENTRY) {
      r = policyEntry(b, 0);
    }
    else if (t == POLICY_NAME) {
      r = policyName(b, 0);
    }
    else if (t == POLICY_SET_BODY) {
      r = policySetBody(b, 0);
    }
    else if (t == POLICY_SET_ENTRY) {
      r = policySetEntry(b, 0);
    }
    else if (t == POLICY_SET_NAME) {
      r = policySetName(b, 0);
    }
    else if (t == QUALIFIED_NAME) {
      r = qualifiedName(b, 0);
    }
    else if (t == REF) {
      r = ref(b, 0);
    }
    else if (t == RIGHT_CLAUSE_OPERAND) {
      r = rightClauseOperand(b, 0);
    }
    else if (t == RULE_BODY) {
      r = ruleBody(b, 0);
    }
    else if (t == RULE_ENTRY) {
      r = ruleEntry(b, 0);
    }
    else if (t == RULE_NAME) {
      r = ruleName(b, 0);
    }
    else if (t == RULE_REF) {
      r = ruleRef(b, 0);
    }
    else if (t == SINGLE_CLAUSE_EXPRESSION) {
      r = singleClauseExpression(b, 0);
    }
    else if (t == TARGET_ENTRY) {
      r = targetEntry(b, 0);
    }
    else if (t == WRAPPED_EXPRESSIONS) {
      r = wrappedExpressions(b, 0);
    }
    else if (t == XACML_DECLARATION) {
      r = xacmlDeclaration(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // letters
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LETTERS);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // '+'|'-'
  public static boolean Sign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sign")) return false;
    if (!nextTokenIs(b, "<sign>", PLUS, MUNUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGN, "<sign>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MUNUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StringDQ |
  //     StringSQ
  public static boolean StringLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLiteral")) return false;
    if (!nextTokenIs(b, "<string literal>", STRINGDQ, STRINGSQ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = consumeToken(b, STRINGDQ);
    if (!r) r = consumeToken(b, STRINGSQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' attributeDesignatorMustBePresent? attributeDesignatorIssuer? ']'
  public static boolean attributeDesignator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDesignator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_DESIGNATOR, "<attribute designator>");
    r = consumeToken(b, "[");
    r = r && attributeDesignator_1(b, l + 1);
    r = r && attributeDesignator_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributeDesignatorMustBePresent?
  private static boolean attributeDesignator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDesignator_1")) return false;
    attributeDesignatorMustBePresent(b, l + 1);
    return true;
  }

  // attributeDesignatorIssuer?
  private static boolean attributeDesignator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDesignator_2")) return false;
    attributeDesignatorIssuer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'issuer' '=' StringLiteral
  public static boolean attributeDesignatorIssuer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDesignatorIssuer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_DESIGNATOR_ISSUER, "<attribute designator issuer>");
    r = consumeToken(b, "issuer");
    r = r && consumeToken(b, "=");
    r = r && StringLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'musteepresent'
  public static boolean attributeDesignatorMustBePresent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDesignatorMustBePresent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT, "<attribute designator must be present>");
    r = consumeToken(b, "musteepresent");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ref attributeDesignator?
  public static boolean attributeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeRef")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    r = r && attributeRef_1(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_REF, r);
    return r;
  }

  // attributeDesignator?
  private static boolean attributeRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeRef_1")) return false;
    attributeDesignator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // clauseOperator clauseExpression
  public static boolean clauseAddin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseAddin")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clauseOperator(b, l + 1);
    r = r && clauseExpression(b, l + 1);
    exit_section_(b, m, CLAUSE_ADDIN, r);
    return r;
  }

  /* ********************************************************** */
  // clause clauseExpression clauseAddin*
  public static boolean clauseEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseEntry")) return false;
    if (!nextTokenIs(b, CLAUSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLAUSE);
    r = r && clauseExpression(b, l + 1);
    r = r && clauseEntry_2(b, l + 1);
    exit_section_(b, m, CLAUSE_ENTRY, r);
    return r;
  }

  // clauseAddin*
  private static boolean clauseEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseEntry_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!clauseAddin(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clauseEntry_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // singleClauseExpression | functionClause
  public static boolean clauseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLAUSE_EXPRESSION, "<clause expression>");
    r = singleClauseExpression(b, l + 1);
    if (!r) r = functionClause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attributeRef | constant
  public static boolean clauseOperand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseOperand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLAUSE_OPERAND, "<clause operand>");
    r = attributeRef(b, l + 1);
    if (!r) r = constant(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Identifier
  public static boolean clauseOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseOperator")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    exit_section_(b, m, CLAUSE_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // apply ref
  public static boolean combinationAlgorithmRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinationAlgorithmRef")) return false;
    if (!nextTokenIs(b, APPLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, APPLY);
    r = r && ref(b, l + 1);
    exit_section_(b, m, COMBINATION_ALGORITHM_REF, r);
    return r;
  }

  /* ********************************************************** */
  // wrappedExpressions | expressions
  public static boolean conditionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION_BODY, "<condition body>");
    r = wrappedExpressions(b, l + 1);
    if (!r) r = expressions(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // condition conditionBody
  public static boolean conditionEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionEntry")) return false;
    if (!nextTokenIs(b, CONDITION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONDITION);
    r = r && conditionBody(b, l + 1);
    exit_section_(b, m, CONDITION_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // integerLiteral|
  //     StringLiteral
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = integerLiteral(b, l + 1);
    if (!r) r = StringLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StringLiteral
  public static boolean description(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "description")) return false;
    if (!nextTokenIs(b, "<description>", STRINGDQ, STRINGSQ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESCRIPTION, "<description>");
    r = StringLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // permit|deny
  public static boolean effect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "effect")) return false;
    if (!nextTokenIs(b, "<effect>", DENY, PERMIT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EFFECT, "<effect>");
    r = consumeToken(b, PERMIT);
    if (!r) r = consumeToken(b, DENY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // operand | wrappedExpressions
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = operand(b, l + 1);
    if (!r) r = wrappedExpressions(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // operator expression
  public static boolean expressionAddin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionAddin")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_ADDIN, "<expression addin>");
    r = operator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression expressionAddin*
  public static boolean expressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSIONS, "<expressions>");
    r = expression(b, l + 1);
    r = r && expressions_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expressionAddin*
  private static boolean expressions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressions_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expressionAddin(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressions_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // functionRef | operand | expressions | wrappedExpressions
  public static boolean functionArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARGUMENT, "<function argument>");
    r = functionRef(b, l + 1);
    if (!r) r = operand(b, l + 1);
    if (!r) r = expressions(b, l + 1);
    if (!r) r = wrappedExpressions(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // functionRefName '(' functionClauseArgument (',' functionClauseArgument)* ')'
  public static boolean functionClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionClause")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionRefName(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && functionClauseArgument(b, l + 1);
    r = r && functionClause_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, FUNCTION_CLAUSE, r);
    return r;
  }

  // (',' functionClauseArgument)*
  private static boolean functionClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionClause_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionClause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionClause_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' functionClauseArgument
  private static boolean functionClause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionClause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && functionClauseArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributeRef | constant
  public static boolean functionClauseArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionClauseArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_CLAUSE_ARGUMENT, "<function clause argument>");
    r = attributeRef(b, l + 1);
    if (!r) r = constant(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // functionRefName '(' functionArgument (',' functionArgument)* ')'
  public static boolean functionEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionEntry")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionRefName(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && functionArgument(b, l + 1);
    r = r && functionEntry_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, FUNCTION_ENTRY, r);
    return r;
  }

  // (',' functionArgument)*
  private static boolean functionEntry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionEntry_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionEntry_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionEntry_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' functionArgument
  private static boolean functionEntry_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionEntry_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && functionArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function '[' functionRefName ']'
  public static boolean functionRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionRef")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && consumeToken(b, "[");
    r = r && functionRefName(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, FUNCTION_REF, r);
    return r;
  }

  /* ********************************************************** */
  // ref
  public static boolean functionRefName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionRefName")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, FUNCTION_REF_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ('=' xacmlDeclaration)?
  public static boolean idDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idDeclaration")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && idDeclaration_1(b, l + 1);
    exit_section_(b, m, ID_DECLARATION, r);
    return r;
  }

  // ('=' xacmlDeclaration)?
  private static boolean idDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idDeclaration_1")) return false;
    idDeclaration_1_0(b, l + 1);
    return true;
  }

  // '=' xacmlDeclaration
  private static boolean idDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idDeclaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && xacmlDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Sign? DecimalIntegerLiteral
  public static boolean integerLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integerLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = integerLiteral_0(b, l + 1);
    r = r && consumeToken(b, DECIMALINTEGERLITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Sign?
  private static boolean integerLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integerLiteral_0")) return false;
    Sign(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // clauseOperand
  public static boolean leftClauseOperand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "leftClauseOperand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEFT_CLAUSE_OPERAND, "<left clause operand>");
    r = clauseOperand(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // namespaceEntry|
  // //    attributeDeclaration|
  // //    obligationDeclaration|
  // //    adviceDeclaration|
  // //    ruleCombinatorDeclaration|
  // //    policyCombinatorDeclaration|
  // //    categoryDeclaration|
  // //    operatorDeclaration|
  // //    functionDeclaration|
  // //    typeDeclaration|
  //     policySetEntry|
  //     policyEntry|
  //     ruleEntry
  public static boolean namespaceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_BODY, "<namespace body>");
    r = namespaceEntry(b, l + 1);
    if (!r) r = policySetEntry(b, l + 1);
    if (!r) r = policyEntry(b, l + 1);
    if (!r) r = ruleEntry(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // namespace namespaceName '{' namespaceBody* '}'
  public static boolean namespaceEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceEntry")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAMESPACE);
    r = r && namespaceName(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    r = r && namespaceEntry_3(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, NAMESPACE_ENTRY, r);
    return r;
  }

  // namespaceBody*
  private static boolean namespaceEntry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceEntry_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!namespaceBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespaceEntry_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean namespaceName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceName")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    exit_section_(b, m, NAMESPACE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // on effect '{' oblegationOrAdviceBody+ '}'
  public static boolean onEffect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "onEffect")) return false;
    if (!nextTokenIs(b, ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && effect(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    r = r && onEffect_3(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, ON_EFFECT, r);
    return r;
  }

  // oblegationOrAdviceBody+
  private static boolean onEffect_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "onEffect_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBLEGATIONORADVICEBODY);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, OBLEGATIONORADVICEBODY)) break;
      if (!empty_element_parsed_guard_(b, "onEffect_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // functionEntry | attributeRef | constant | wrappedExpressions
  public static boolean operand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERAND, "<operand>");
    r = functionEntry(b, l + 1);
    if (!r) r = attributeRef(b, l + 1);
    if (!r) r = constant(b, l + 1);
    if (!r) r = wrappedExpressions(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '&&' | '||' | '<=' | '>=' | '<' | '>' | '+' | '-' | '*' | '/' | '=='
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, LESSOREQUAL);
    if (!r) r = consumeToken(b, MOREOREQUAL);
    if (!r) r = consumeToken(b, LESS);
    if (!r) r = consumeToken(b, MORE);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MUNUS);
    if (!r) r = consumeToken(b, MULTIPLY);
    if (!r) r = consumeToken(b, DIVIDE);
    if (!r) r = consumeToken(b, EQUAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // targetEntry|
  //         combinationAlgorithmRef|
  //         onEffect|
  //         ruleRef|
  //         ruleEntry
  public static boolean policyBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POLICY_BODY, "<policy body>");
    r = targetEntry(b, l + 1);
    if (!r) r = combinationAlgorithmRef(b, l + 1);
    if (!r) r = onEffect(b, l + 1);
    if (!r) r = ruleRef(b, l + 1);
    if (!r) r = ruleEntry(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // policy policyName? description? '{' policyBody* '}'
  public static boolean policyEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyEntry")) return false;
    if (!nextTokenIs(b, POLICY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POLICY);
    r = r && policyEntry_1(b, l + 1);
    r = r && policyEntry_2(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    r = r && policyEntry_4(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, POLICY_ENTRY, r);
    return r;
  }

  // policyName?
  private static boolean policyEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyEntry_1")) return false;
    policyName(b, l + 1);
    return true;
  }

  // description?
  private static boolean policyEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyEntry_2")) return false;
    description(b, l + 1);
    return true;
  }

  // policyBody*
  private static boolean policyEntry_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyEntry_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!policyBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "policyEntry_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // idDeclaration
  public static boolean policyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyName")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = idDeclaration(b, l + 1);
    exit_section_(b, m, POLICY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // combinationAlgorithmRef|
  //         targetEntry|
  //         onEffect|
  //         ref|
  //         policyEntry|
  //         policySetEntry
  public static boolean policySetBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policySetBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POLICY_SET_BODY, "<policy set body>");
    r = combinationAlgorithmRef(b, l + 1);
    if (!r) r = targetEntry(b, l + 1);
    if (!r) r = onEffect(b, l + 1);
    if (!r) r = ref(b, l + 1);
    if (!r) r = policyEntry(b, l + 1);
    if (!r) r = policySetEntry(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // policyset policySetName? description? '{' policySetBody* '}'
  public static boolean policySetEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policySetEntry")) return false;
    if (!nextTokenIs(b, POLICYSET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POLICYSET);
    r = r && policySetEntry_1(b, l + 1);
    r = r && policySetEntry_2(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    r = r && policySetEntry_4(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, POLICY_SET_ENTRY, r);
    return r;
  }

  // policySetName?
  private static boolean policySetEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policySetEntry_1")) return false;
    policySetName(b, l + 1);
    return true;
  }

  // description?
  private static boolean policySetEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policySetEntry_2")) return false;
    description(b, l + 1);
    return true;
  }

  // policySetBody*
  private static boolean policySetEntry_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policySetEntry_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!policySetBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "policySetEntry_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean policySetName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policySetName")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    exit_section_(b, m, POLICY_SET_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier ['.' Identifier]
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // ['.' Identifier]
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    qualifiedName_1_0(b, l + 1);
    return true;
  }

  // '.' Identifier
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    exit_section_(b, m, REF, r);
    return r;
  }

  /* ********************************************************** */
  // clauseOperand
  public static boolean rightClauseOperand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rightClauseOperand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RIGHT_CLAUSE_OPERAND, "<right clause operand>");
    r = clauseOperand(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // namespaceEntry+
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespaceEntry(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!namespaceEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // target | conditionEntry | onEffect
  public static boolean ruleBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_BODY, "<rule body>");
    r = consumeToken(b, TARGET);
    if (!r) r = conditionEntry(b, l + 1);
    if (!r) r = onEffect(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // rule ruleName? description? '{' effect ruleBody* '}'
  public static boolean ruleEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleEntry")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULE);
    r = r && ruleEntry_1(b, l + 1);
    r = r && ruleEntry_2(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    r = r && effect(b, l + 1);
    r = r && ruleEntry_5(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, RULE_ENTRY, r);
    return r;
  }

  // ruleName?
  private static boolean ruleEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleEntry_1")) return false;
    ruleName(b, l + 1);
    return true;
  }

  // description?
  private static boolean ruleEntry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleEntry_2")) return false;
    description(b, l + 1);
    return true;
  }

  // ruleBody*
  private static boolean ruleEntry_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleEntry_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ruleBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ruleEntry_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // idDeclaration
  public static boolean ruleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleName")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = idDeclaration(b, l + 1);
    exit_section_(b, m, RULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ref
  public static boolean ruleRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleRef")) return false;
    if (!nextTokenIs(b, LETTERS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, RULE_REF, r);
    return r;
  }

  /* ********************************************************** */
  // leftClauseOperand operator rightClauseOperand
  public static boolean singleClauseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleClauseExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_CLAUSE_EXPRESSION, "<single clause expression>");
    r = leftClauseOperand(b, l + 1);
    r = r && operator(b, l + 1);
    r = r && rightClauseOperand(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // target clauseEntry+
  public static boolean targetEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetEntry")) return false;
    if (!nextTokenIs(b, TARGET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TARGET);
    r = r && targetEntry_1(b, l + 1);
    exit_section_(b, m, TARGET_ENTRY, r);
    return r;
  }

  // clauseEntry+
  private static boolean targetEntry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "targetEntry_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clauseEntry(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!clauseEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "targetEntry_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' expressions ')'
  public static boolean wrappedExpressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wrappedExpressions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WRAPPED_EXPRESSIONS, "<wrapped expressions>");
    r = consumeToken(b, "(");
    r = r && expressions(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // StringLiteral
  public static boolean xacmlDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xacmlDeclaration")) return false;
    if (!nextTokenIs(b, "<xacml declaration>", STRINGDQ, STRINGSQ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, XACML_DECLARATION, "<xacml declaration>");
    r = StringLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
