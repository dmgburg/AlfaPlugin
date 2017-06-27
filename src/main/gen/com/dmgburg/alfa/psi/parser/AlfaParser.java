// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.dmgburg.alfa.psi.AlfaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
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
    if (t == SIGN) {
      r = Sign(b, 0);
    }
    else if (t == ADVICE_BODY) {
      r = adviceBody(b, 0);
    }
    else if (t == ADVICE_DECLARATION) {
      r = adviceDeclaration(b, 0);
    }
    else if (t == ADVICE_REF) {
      r = adviceRef(b, 0);
    }
    else if (t == ALGORITHM_NAME) {
      r = algorithmName(b, 0);
    }
    else if (t == ANY_ATOMIC_OR_BAG_TYPE) {
      r = anyAtomicOrBagType(b, 0);
    }
    else if (t == ANY_ATOMIC_TYPE) {
      r = anyAtomicType(b, 0);
    }
    else if (t == ATTRIBUTE_ASSIGN) {
      r = attributeAssign(b, 0);
    }
    else if (t == ATTRIBUTE_ASSIGN_BODY) {
      r = attributeAssignBody(b, 0);
    }
    else if (t == ATTRIBUTE_BODY) {
      r = attributeBody(b, 0);
    }
    else if (t == ATTRIBUTE_CATEGORY) {
      r = attributeCategory(b, 0);
    }
    else if (t == ATTRIBUTE_DECLARATION) {
      r = attributeDeclaration(b, 0);
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
    else if (t == ATTRIBUTE_ID) {
      r = attributeId(b, 0);
    }
    else if (t == ATTRIBUTE_NAME) {
      r = attributeName(b, 0);
    }
    else if (t == ATTRIBUTE_REF) {
      r = attributeRef(b, 0);
    }
    else if (t == ATTRIBUTE_TYPE) {
      r = attributeType(b, 0);
    }
    else if (t == CATEGORY_DECLARATION) {
      r = categoryDeclaration(b, 0);
    }
    else if (t == CATEGORY_NAME) {
      r = categoryName(b, 0);
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
    else if (t == FUNCTION_BODY) {
      r = functionBody(b, 0);
    }
    else if (t == FUNCTION_BODY_ARGUMENT) {
      r = functionBodyArgument(b, 0);
    }
    else if (t == FUNCTION_BODY_RETURN) {
      r = functionBodyReturn(b, 0);
    }
    else if (t == FUNCTION_CLAUSE) {
      r = functionClause(b, 0);
    }
    else if (t == FUNCTION_CLAUSE_ARGUMENT) {
      r = functionClauseArgument(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = functionDeclaration(b, 0);
    }
    else if (t == FUNCTION_ENTRY) {
      r = functionEntry(b, 0);
    }
    else if (t == FUNCTION_NAME) {
      r = functionName(b, 0);
    }
    else if (t == FUNCTION_REF) {
      r = functionRef(b, 0);
    }
    else if (t == FUNCTION_REF_NAME) {
      r = functionRefName(b, 0);
    }
    else if (t == FUNCTION_TYPE) {
      r = functionType(b, 0);
    }
    else if (t == ID_DECLARATION) {
      r = idDeclaration(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = importDeclaration(b, 0);
    }
    else if (t == IMPORT_EVERYTHING) {
      r = importEverything(b, 0);
    }
    else if (t == IMPORT_NAME) {
      r = importName(b, 0);
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
    else if (t == OBLIGATION_BODY) {
      r = obligationBody(b, 0);
    }
    else if (t == OBLIGATION_DECLARATION) {
      r = obligationDeclaration(b, 0);
    }
    else if (t == OBLIGATION_OR_ADVICE_BODY) {
      r = obligationOrAdviceBody(b, 0);
    }
    else if (t == OBLIGATION_REF) {
      r = obligationRef(b, 0);
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
    else if (t == OPERATOR_DECLARATION) {
      r = operatorDeclaration(b, 0);
    }
    else if (t == OPERATOR_DECLARATION_BODY) {
      r = operatorDeclarationBody(b, 0);
    }
    else if (t == OPERATOR_FEATURE) {
      r = operatorFeature(b, 0);
    }
    else if (t == OPERATOR_INVRESE) {
      r = operatorInvrese(b, 0);
    }
    else if (t == POLICY_BODY) {
      r = policyBody(b, 0);
    }
    else if (t == POLICY_COMBINATOR_DECLARATION) {
      r = policyCombinatorDeclaration(b, 0);
    }
    else if (t == POLICY_ENTRY) {
      r = policyEntry(b, 0);
    }
    else if (t == POLICY_NAME) {
      r = policyName(b, 0);
    }
    else if (t == POLICY_OR_POLICY_SET_REF) {
      r = policyOrPolicySetRef(b, 0);
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
    else if (t == RULE_BODY_ELEMENT) {
      r = ruleBodyElement(b, 0);
    }
    else if (t == RULE_COMBINATOR_DECLARATION) {
      r = ruleCombinatorDeclaration(b, 0);
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
    else if (t == TYPE_BAG) {
      r = typeBag(b, 0);
    }
    else if (t == TYPE_DECLARATION) {
      r = typeDeclaration(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = typeName(b, 0);
    }
    else if (t == TYPE_REF) {
      r = typeRef(b, 0);
    }
    else if (t == VARIABLE_ARGUMENTS) {
      r = variableArguments(b, 0);
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
    return alfaFile(b, l + 1);
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
  // advice adviceRef ('{' attributeAssignBody '}')?
  public static boolean adviceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adviceBody")) return false;
    if (!nextTokenIs(b, ADVICE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADVICE);
    r = r && adviceRef(b, l + 1);
    r = r && adviceBody_2(b, l + 1);
    exit_section_(b, m, ADVICE_BODY, r);
    return r;
  }

  // ('{' attributeAssignBody '}')?
  private static boolean adviceBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adviceBody_2")) return false;
    adviceBody_2_0(b, l + 1);
    return true;
  }

  // '{' attributeAssignBody '}'
  private static boolean adviceBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adviceBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURVE1);
    r = r && attributeAssignBody(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // advice idDeclaration
  public static boolean adviceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adviceDeclaration")) return false;
    if (!nextTokenIs(b, ADVICE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADVICE);
    r = r && idDeclaration(b, l + 1);
    exit_section_(b, m, ADVICE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // ref
  public static boolean adviceRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adviceRef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, ADVICE_REF, r);
    return r;
  }

  /* ********************************************************** */
  // namespaceEntry+
  static boolean alfaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alfaFile")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespaceEntry(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!namespaceEntry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "alfaFile", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean algorithmName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "algorithmName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ALGORITHM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // anyAtomicOrBag
  public static boolean anyAtomicOrBagType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyAtomicOrBagType")) return false;
    if (!nextTokenIs(b, ANYATOMICORBAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANYATOMICORBAG);
    exit_section_(b, m, ANY_ATOMIC_OR_BAG_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // anyAtomic
  public static boolean anyAtomicType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anyAtomicType")) return false;
    if (!nextTokenIs(b, ANYATOMIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANYATOMIC);
    exit_section_(b, m, ANY_ATOMIC_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // attributeRef '=' expression
  public static boolean attributeAssign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeAssign")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributeRef(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_ASSIGN, r);
    return r;
  }

  /* ********************************************************** */
  // attributeAssign+
  public static boolean attributeAssignBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeAssignBody")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributeAssign(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!attributeAssign(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attributeAssignBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, ATTRIBUTE_ASSIGN_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // attributeId attributeType attributeCategory
  public static boolean attributeBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeBody")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributeId(b, l + 1);
    r = r && attributeType(b, l + 1);
    r = r && attributeCategory(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // category '=' ref
  public static boolean attributeCategory(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeCategory")) return false;
    if (!nextTokenIs(b, CATEGORY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CATEGORY, ASSIGN);
    r = r && ref(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_CATEGORY, r);
    return r;
  }

  /* ********************************************************** */
  // attribute attributeName '{' attributeBody '}'
  public static boolean attributeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDeclaration")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE);
    r = r && attributeName(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    r = r && attributeBody(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, ATTRIBUTE_DECLARATION, r);
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
  // issuer '=' STRING_LITERAL
  public static boolean attributeDesignatorIssuer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDesignatorIssuer")) return false;
    if (!nextTokenIs(b, ISSUER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ISSUER, ASSIGN, STRING_LITERAL);
    exit_section_(b, m, ATTRIBUTE_DESIGNATOR_ISSUER, r);
    return r;
  }

  /* ********************************************************** */
  // musteepresent
  public static boolean attributeDesignatorMustBePresent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDesignatorMustBePresent")) return false;
    if (!nextTokenIs(b, MUSTEEPRESENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUSTEEPRESENT);
    exit_section_(b, m, ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT, r);
    return r;
  }

  /* ********************************************************** */
  // id '=' xacmlDeclaration
  public static boolean attributeId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeId")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, ASSIGN);
    r = r && xacmlDeclaration(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_ID, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean attributeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ATTRIBUTE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ref attributeDesignator?
  public static boolean attributeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeRef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
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
  // type '=' ref
  public static boolean attributeType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeType")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, ASSIGN);
    r = r && ref(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // category categoryName '=' xacmlDeclaration
  public static boolean categoryDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "categoryDeclaration")) return false;
    if (!nextTokenIs(b, CATEGORY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CATEGORY);
    r = r && categoryName(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && xacmlDeclaration(b, l + 1);
    exit_section_(b, m, CATEGORY_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean categoryName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "categoryName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CATEGORY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // clauseOperator clauseExpression
  public static boolean clauseAddin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseAddin")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
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
  // IDENTIFIER
  public static boolean clauseOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clauseOperator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
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
  //     STRING_LITERAL
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = integerLiteral(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean description(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "description")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, DESCRIPTION, r);
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
  // xacmlDeclaration ':' functionBodyArgument+ variableArguments? '->' functionBodyReturn
  public static boolean functionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xacmlDeclaration(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && functionBody_2(b, l + 1);
    r = r && functionBody_3(b, l + 1);
    r = r && consumeToken(b, "->");
    r = r && functionBodyReturn(b, l + 1);
    exit_section_(b, m, FUNCTION_BODY, r);
    return r;
  }

  // functionBodyArgument+
  private static boolean functionBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBodyArgument(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!functionBodyArgument(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionBody_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // variableArguments?
  private static boolean functionBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_3")) return false;
    variableArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // typeRef | typeBag | anyAtomicType | anyAtomicOrBagType | functionType
  public static boolean functionBodyArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBodyArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY_ARGUMENT, "<function body argument>");
    r = typeRef(b, l + 1);
    if (!r) r = typeBag(b, l + 1);
    if (!r) r = anyAtomicType(b, l + 1);
    if (!r) r = anyAtomicOrBagType(b, l + 1);
    if (!r) r = functionType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeRef | typeBag | anyAtomicType
  public static boolean functionBodyReturn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBodyReturn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY_RETURN, "<function body return>");
    r = typeRef(b, l + 1);
    if (!r) r = typeBag(b, l + 1);
    if (!r) r = anyAtomicType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // functionRefName '(' functionClauseArgument (',' functionClauseArgument)* ')'
  public static boolean functionClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionClause")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
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
  // function functionName '=' functionBody
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && functionName(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, FUNCTION_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // functionRefName '(' functionArgument (',' functionArgument)* ')'
  public static boolean functionEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionEntry")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
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
  // IDENTIFIER
  public static boolean functionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FUNCTION_NAME, r);
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
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, FUNCTION_REF_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // function
  public static boolean functionType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionType")) return false;
    if (!nextTokenIs(b, FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    exit_section_(b, m, FUNCTION_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ('=' xacmlDeclaration)?
  public static boolean idDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
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
    r = consumeToken(b, ASSIGN);
    r = r && xacmlDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // import importName
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && importName(b, l + 1);
    exit_section_(b, m, IMPORT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // '.' '*'
  public static boolean importEverything(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importEverything")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, MULTIPLY);
    exit_section_(b, m, IMPORT_EVERYTHING, r);
    return r;
  }

  /* ********************************************************** */
  // qualifiedName importEverything?
  public static boolean importName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    r = r && importName_1(b, l + 1);
    exit_section_(b, m, IMPORT_NAME, r);
    return r;
  }

  // importEverything?
  private static boolean importName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importName_1")) return false;
    importEverything(b, l + 1);
    return true;
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
  //     policySetEntry|
  //     policyEntry|
  //     ruleEntry|
  //     obligationDeclaration|
  //     adviceDeclaration|
  //     attributeDeclaration|
  //     policyCombinatorDeclaration|
  //     ruleCombinatorDeclaration|
  //     typeDeclaration|
  //     operatorDeclaration|
  //     functionDeclaration|
  //     importDeclaration|
  //     categoryDeclaration
  public static boolean namespaceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_BODY, "<namespace body>");
    r = namespaceEntry(b, l + 1);
    if (!r) r = policySetEntry(b, l + 1);
    if (!r) r = policyEntry(b, l + 1);
    if (!r) r = ruleEntry(b, l + 1);
    if (!r) r = obligationDeclaration(b, l + 1);
    if (!r) r = adviceDeclaration(b, l + 1);
    if (!r) r = attributeDeclaration(b, l + 1);
    if (!r) r = policyCombinatorDeclaration(b, l + 1);
    if (!r) r = ruleCombinatorDeclaration(b, l + 1);
    if (!r) r = typeDeclaration(b, l + 1);
    if (!r) r = operatorDeclaration(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = importDeclaration(b, l + 1);
    if (!r) r = categoryDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // namespace namespaceName '{' namespaceBody* '}'
  public static boolean namespaceEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceEntry")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_ENTRY, null);
    r = consumeToken(b, NAMESPACE);
    r = r && namespaceName(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    p = r; // pin = 3
    r = r && report_error_(b, namespaceEntry_3(b, l + 1));
    r = p && consumeToken(b, CURVE2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    exit_section_(b, m, NAMESPACE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // obligation obligationRef ('{' attributeAssignBody '}')?
  public static boolean obligationBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obligationBody")) return false;
    if (!nextTokenIs(b, OBLIGATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBLIGATION);
    r = r && obligationRef(b, l + 1);
    r = r && obligationBody_2(b, l + 1);
    exit_section_(b, m, OBLIGATION_BODY, r);
    return r;
  }

  // ('{' attributeAssignBody '}')?
  private static boolean obligationBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obligationBody_2")) return false;
    obligationBody_2_0(b, l + 1);
    return true;
  }

  // '{' attributeAssignBody '}'
  private static boolean obligationBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obligationBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURVE1);
    r = r && attributeAssignBody(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // obligation idDeclaration
  public static boolean obligationDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obligationDeclaration")) return false;
    if (!nextTokenIs(b, OBLIGATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBLIGATION);
    r = r && idDeclaration(b, l + 1);
    exit_section_(b, m, OBLIGATION_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // obligationBody | adviceBody
  public static boolean obligationOrAdviceBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obligationOrAdviceBody")) return false;
    if (!nextTokenIs(b, "<obligation or advice body>", ADVICE, OBLIGATION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBLIGATION_OR_ADVICE_BODY, "<obligation or advice body>");
    r = obligationBody(b, l + 1);
    if (!r) r = adviceBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ref
  public static boolean obligationRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obligationRef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, OBLIGATION_REF, r);
    return r;
  }

  /* ********************************************************** */
  // on effect '{' obligationOrAdviceBody+ '}'
  public static boolean onEffect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "onEffect")) return false;
    if (!nextTokenIs(b, ON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ON_EFFECT, null);
    r = consumeToken(b, ON);
    r = r && effect(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    p = r; // pin = 3
    r = r && report_error_(b, onEffect_3(b, l + 1));
    r = p && consumeToken(b, CURVE2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // obligationOrAdviceBody+
  private static boolean onEffect_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "onEffect_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = obligationOrAdviceBody(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!obligationOrAdviceBody(b, l + 1)) break;
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
  // infix operatorFeature* '(' operator ')' '=' '{' operatorDeclarationBody+ '}' operatorInvrese?
  public static boolean operatorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operatorDeclaration")) return false;
    if (!nextTokenIs(b, INFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INFIX);
    r = r && operatorDeclaration_1(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && operator(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeTokens(b, 0, ASSIGN, CURVE1);
    r = r && operatorDeclaration_7(b, l + 1);
    r = r && consumeToken(b, CURVE2);
    r = r && operatorDeclaration_9(b, l + 1);
    exit_section_(b, m, OPERATOR_DECLARATION, r);
    return r;
  }

  // operatorFeature*
  private static boolean operatorDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operatorDeclaration_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!operatorFeature(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operatorDeclaration_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // operatorDeclarationBody+
  private static boolean operatorDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operatorDeclaration_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = operatorDeclarationBody(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!operatorDeclarationBody(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operatorDeclaration_7", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // operatorInvrese?
  private static boolean operatorDeclaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operatorDeclaration_9")) return false;
    operatorInvrese(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // functionBody
  public static boolean operatorDeclarationBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operatorDeclarationBody")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBody(b, l + 1);
    exit_section_(b, m, OPERATOR_DECLARATION_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // comm | allowbags
  public static boolean operatorFeature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operatorFeature")) return false;
    if (!nextTokenIs(b, "<operator feature>", ALLOWBAGS, COMM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_FEATURE, "<operator feature>");
    r = consumeToken(b, COMM);
    if (!r) r = consumeToken(b, ALLOWBAGS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // inv operator
  public static boolean operatorInvrese(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operatorInvrese")) return false;
    if (!nextTokenIs(b, INV)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INV);
    r = r && operator(b, l + 1);
    exit_section_(b, m, OPERATOR_INVRESE, r);
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
  // policyCombinator algorithmName '=' xacmlDeclaration
  public static boolean policyCombinatorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyCombinatorDeclaration")) return false;
    if (!nextTokenIs(b, POLICYCOMBINATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, POLICYCOMBINATOR);
    r = r && algorithmName(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && xacmlDeclaration(b, l + 1);
    exit_section_(b, m, POLICY_COMBINATOR_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // policy policyName? description? '{' policyBody* '}'
  public static boolean policyEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyEntry")) return false;
    if (!nextTokenIs(b, POLICY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, POLICY_ENTRY, null);
    r = consumeToken(b, POLICY);
    r = r && policyEntry_1(b, l + 1);
    r = r && policyEntry_2(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    p = r; // pin = 4
    r = r && report_error_(b, policyEntry_4(b, l + 1));
    r = p && consumeToken(b, CURVE2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = idDeclaration(b, l + 1);
    exit_section_(b, m, POLICY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ref
  public static boolean policyOrPolicySetRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policyOrPolicySetRef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, POLICY_OR_POLICY_SET_REF, r);
    return r;
  }

  /* ********************************************************** */
  // combinationAlgorithmRef|
  //         targetEntry|
  //         onEffect|
  //         policyOrPolicySetRef|
  //         policyEntry|
  //         policySetEntry
  public static boolean policySetBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "policySetBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POLICY_SET_BODY, "<policy set body>");
    r = combinationAlgorithmRef(b, l + 1);
    if (!r) r = targetEntry(b, l + 1);
    if (!r) r = onEffect(b, l + 1);
    if (!r) r = policyOrPolicySetRef(b, l + 1);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, POLICY_SET_ENTRY, null);
    r = consumeToken(b, POLICYSET);
    r = r && policySetEntry_1(b, l + 1);
    r = r && policySetEntry_2(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    p = r; // pin = 4
    r = r && report_error_(b, policySetEntry_4(b, l + 1));
    r = p && consumeToken(b, CURVE2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    exit_section_(b, m, POLICY_SET_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ('.' IDENTIFIER)*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // ('.' IDENTIFIER)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' IDENTIFIER
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
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
  // effect ruleBodyElement*
  public static boolean ruleBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleBody")) return false;
    if (!nextTokenIs(b, "<rule body>", DENY, PERMIT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_BODY, "<rule body>");
    r = effect(b, l + 1);
    r = r && ruleBody_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ruleBodyElement*
  private static boolean ruleBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ruleBodyElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ruleBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // targetEntry | conditionEntry | onEffect
  public static boolean ruleBodyElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleBodyElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_BODY_ELEMENT, "<rule body element>");
    r = targetEntry(b, l + 1);
    if (!r) r = conditionEntry(b, l + 1);
    if (!r) r = onEffect(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ruleCombinator algorithmName '=' xacmlDeclaration
  public static boolean ruleCombinatorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleCombinatorDeclaration")) return false;
    if (!nextTokenIs(b, RULECOMBINATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULECOMBINATOR);
    r = r && algorithmName(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && xacmlDeclaration(b, l + 1);
    exit_section_(b, m, RULE_COMBINATOR_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // rule ruleName? description? '{' ruleBody '}'
  public static boolean ruleEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleEntry")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RULE_ENTRY, null);
    r = consumeToken(b, RULE);
    r = r && ruleEntry_1(b, l + 1);
    r = r && ruleEntry_2(b, l + 1);
    r = r && consumeToken(b, CURVE1);
    p = r; // pin = 4
    r = r && report_error_(b, ruleBody(b, l + 1));
    r = p && consumeToken(b, CURVE2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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

  /* ********************************************************** */
  // idDeclaration
  public static boolean ruleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ruleName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
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
    if (!nextTokenIs(b, IDENTIFIER)) return false;
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
  // bag '[' (typeRef| anyAtomicType) ']'
  public static boolean typeBag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBag")) return false;
    if (!nextTokenIs(b, BAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BAG);
    r = r && consumeToken(b, "[");
    r = r && typeBag_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, TYPE_BAG, r);
    return r;
  }

  // typeRef| anyAtomicType
  private static boolean typeBag_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeBag_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeRef(b, l + 1);
    if (!r) r = anyAtomicType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type typeName '=' xacmlDeclaration
  public static boolean typeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && typeName(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && xacmlDeclaration(b, l + 1);
    exit_section_(b, m, TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean typeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ref
  public static boolean typeRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeRef")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ref(b, l + 1);
    exit_section_(b, m, TYPE_REF, r);
    return r;
  }

  /* ********************************************************** */
  // '*'
  public static boolean variableArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableArguments")) return false;
    if (!nextTokenIs(b, MULTIPLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULTIPLY);
    exit_section_(b, m, VARIABLE_ARGUMENTS, r);
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
  // STRING_LITERAL
  public static boolean xacmlDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xacmlDeclaration")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, XACML_DECLARATION, r);
    return r;
  }

}
