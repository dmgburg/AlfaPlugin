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

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == SIGN) {
      result_ = Sign(builder_, 0);
    }
    else if (root_ == ADVICE_BODY) {
      result_ = adviceBody(builder_, 0);
    }
    else if (root_ == ADVICE_DECLARATION) {
      result_ = adviceDeclaration(builder_, 0);
    }
    else if (root_ == ADVICE_REF) {
      result_ = adviceRef(builder_, 0);
    }
    else if (root_ == ALGORITHM_NAME) {
      result_ = algorithmName(builder_, 0);
    }
    else if (root_ == ANY_ATOMIC_OR_BAG_TYPE) {
      result_ = anyAtomicOrBagType(builder_, 0);
    }
    else if (root_ == ANY_ATOMIC_TYPE) {
      result_ = anyAtomicType(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_ASSIGN) {
      result_ = attributeAssign(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_ASSIGN_BODY) {
      result_ = attributeAssignBody(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_BODY) {
      result_ = attributeBody(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_CATEGORY) {
      result_ = attributeCategory(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_DECLARATION) {
      result_ = attributeDeclaration(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_DESIGNATOR) {
      result_ = attributeDesignator(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_DESIGNATOR_ISSUER) {
      result_ = attributeDesignatorIssuer(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT) {
      result_ = attributeDesignatorMustBePresent(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_ID) {
      result_ = attributeId(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_NAME) {
      result_ = attributeName(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_REF) {
      result_ = attributeRef(builder_, 0);
    }
    else if (root_ == ATTRIBUTE_TYPE) {
      result_ = attributeType(builder_, 0);
    }
    else if (root_ == CATEGORY_DECLARATION) {
      result_ = categoryDeclaration(builder_, 0);
    }
    else if (root_ == CATEGORY_NAME) {
      result_ = categoryName(builder_, 0);
    }
    else if (root_ == CLAUSE_ADDIN) {
      result_ = clauseAddin(builder_, 0);
    }
    else if (root_ == CLAUSE_ENTRY) {
      result_ = clauseEntry(builder_, 0);
    }
    else if (root_ == CLAUSE_EXPRESSION) {
      result_ = clauseExpression(builder_, 0);
    }
    else if (root_ == CLAUSE_OPERAND) {
      result_ = clauseOperand(builder_, 0);
    }
    else if (root_ == CLAUSE_OPERATOR) {
      result_ = clauseOperator(builder_, 0);
    }
    else if (root_ == COMBINATION_ALGORITHM_REF) {
      result_ = combinationAlgorithmRef(builder_, 0);
    }
    else if (root_ == CONDITION_BODY) {
      result_ = conditionBody(builder_, 0);
    }
    else if (root_ == CONDITION_ENTRY) {
      result_ = conditionEntry(builder_, 0);
    }
    else if (root_ == CONSTANT) {
      result_ = constant(builder_, 0);
    }
    else if (root_ == DESCRIPTION) {
      result_ = description(builder_, 0);
    }
    else if (root_ == EFFECT) {
      result_ = effect(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = expression(builder_, 0);
    }
    else if (root_ == EXPRESSION_ADDIN) {
      result_ = expressionAddin(builder_, 0);
    }
    else if (root_ == EXPRESSIONS) {
      result_ = expressions(builder_, 0);
    }
    else if (root_ == FUNCTION_ARGUMENT) {
      result_ = functionArgument(builder_, 0);
    }
    else if (root_ == FUNCTION_BODY) {
      result_ = functionBody(builder_, 0);
    }
    else if (root_ == FUNCTION_BODY_ARGUMENT) {
      result_ = functionBodyArgument(builder_, 0);
    }
    else if (root_ == FUNCTION_BODY_RETURN) {
      result_ = functionBodyReturn(builder_, 0);
    }
    else if (root_ == FUNCTION_CLAUSE) {
      result_ = functionClause(builder_, 0);
    }
    else if (root_ == FUNCTION_CLAUSE_ARGUMENT) {
      result_ = functionClauseArgument(builder_, 0);
    }
    else if (root_ == FUNCTION_DECLARATION) {
      result_ = functionDeclaration(builder_, 0);
    }
    else if (root_ == FUNCTION_ENTRY) {
      result_ = functionEntry(builder_, 0);
    }
    else if (root_ == FUNCTION_NAME) {
      result_ = functionName(builder_, 0);
    }
    else if (root_ == FUNCTION_REF) {
      result_ = functionRef(builder_, 0);
    }
    else if (root_ == FUNCTION_REF_NAME) {
      result_ = functionRefName(builder_, 0);
    }
    else if (root_ == FUNCTION_TYPE) {
      result_ = functionType(builder_, 0);
    }
    else if (root_ == ID_DECLARATION) {
      result_ = idDeclaration(builder_, 0);
    }
    else if (root_ == IMPORT_DECLARATION) {
      result_ = importDeclaration(builder_, 0);
    }
    else if (root_ == IMPORT_EVERYTHING) {
      result_ = importEverything(builder_, 0);
    }
    else if (root_ == IMPORT_NAME) {
      result_ = importName(builder_, 0);
    }
    else if (root_ == INTEGER_LITERAL) {
      result_ = integerLiteral(builder_, 0);
    }
    else if (root_ == LEFT_CLAUSE_OPERAND) {
      result_ = leftClauseOperand(builder_, 0);
    }
    else if (root_ == NAMESPACE_BODY) {
      result_ = namespaceBody(builder_, 0);
    }
    else if (root_ == NAMESPACE_ENTRY) {
      result_ = namespaceEntry(builder_, 0);
    }
    else if (root_ == NAMESPACE_NAME) {
      result_ = namespaceName(builder_, 0);
    }
    else if (root_ == OBLIGATION_BODY) {
      result_ = obligationBody(builder_, 0);
    }
    else if (root_ == OBLIGATION_DECLARATION) {
      result_ = obligationDeclaration(builder_, 0);
    }
    else if (root_ == OBLIGATION_OR_ADVICE_BODY) {
      result_ = obligationOrAdviceBody(builder_, 0);
    }
    else if (root_ == OBLIGATION_REF) {
      result_ = obligationRef(builder_, 0);
    }
    else if (root_ == ON_EFFECT) {
      result_ = onEffect(builder_, 0);
    }
    else if (root_ == OPERAND) {
      result_ = operand(builder_, 0);
    }
    else if (root_ == OPERATOR) {
      result_ = operator(builder_, 0);
    }
    else if (root_ == OPERATOR_DECLARATION) {
      result_ = operatorDeclaration(builder_, 0);
    }
    else if (root_ == OPERATOR_DECLARATION_BODY) {
      result_ = operatorDeclarationBody(builder_, 0);
    }
    else if (root_ == OPERATOR_FEATURE) {
      result_ = operatorFeature(builder_, 0);
    }
    else if (root_ == OPERATOR_INVRESE) {
      result_ = operatorInvrese(builder_, 0);
    }
    else if (root_ == POLICY_BODY) {
      result_ = policyBody(builder_, 0);
    }
    else if (root_ == POLICY_COMBINATOR_DECLARATION) {
      result_ = policyCombinatorDeclaration(builder_, 0);
    }
    else if (root_ == POLICY_ENTRY) {
      result_ = policyEntry(builder_, 0);
    }
    else if (root_ == POLICY_NAME) {
      result_ = policyName(builder_, 0);
    }
    else if (root_ == POLICY_OR_POLICY_SET_REF) {
      result_ = policyOrPolicySetRef(builder_, 0);
    }
    else if (root_ == POLICY_SET_BODY) {
      result_ = policySetBody(builder_, 0);
    }
    else if (root_ == POLICY_SET_ENTRY) {
      result_ = policySetEntry(builder_, 0);
    }
    else if (root_ == POLICY_SET_NAME) {
      result_ = policySetName(builder_, 0);
    }
    else if (root_ == QUALIFIED_NAME) {
      result_ = qualifiedName(builder_, 0);
    }
    else if (root_ == REF) {
      result_ = ref(builder_, 0);
    }
    else if (root_ == RIGHT_CLAUSE_OPERAND) {
      result_ = rightClauseOperand(builder_, 0);
    }
    else if (root_ == RULE_BODY) {
      result_ = ruleBody(builder_, 0);
    }
    else if (root_ == RULE_COMBINATOR_DECLARATION) {
      result_ = ruleCombinatorDeclaration(builder_, 0);
    }
    else if (root_ == RULE_ENTRY) {
      result_ = ruleEntry(builder_, 0);
    }
    else if (root_ == RULE_NAME) {
      result_ = ruleName(builder_, 0);
    }
    else if (root_ == RULE_REF) {
      result_ = ruleRef(builder_, 0);
    }
    else if (root_ == SINGLE_CLAUSE_EXPRESSION) {
      result_ = singleClauseExpression(builder_, 0);
    }
    else if (root_ == TARGET_ENTRY) {
      result_ = targetEntry(builder_, 0);
    }
    else if (root_ == TYPE_BAG) {
      result_ = typeBag(builder_, 0);
    }
    else if (root_ == TYPE_DECLARATION) {
      result_ = typeDeclaration(builder_, 0);
    }
    else if (root_ == TYPE_NAME) {
      result_ = typeName(builder_, 0);
    }
    else if (root_ == TYPE_REF) {
      result_ = typeRef(builder_, 0);
    }
    else if (root_ == VARIABLE_ARGUMENTS) {
      result_ = variableArguments(builder_, 0);
    }
    else if (root_ == WRAPPED_EXPRESSIONS) {
      result_ = wrappedExpressions(builder_, 0);
    }
    else if (root_ == XACML_DECLARATION) {
      result_ = xacmlDeclaration(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return root(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '+'|'-'
  public static boolean Sign(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Sign")) return false;
    if (!nextTokenIs(builder_, "<sign>", PLUS, MUNUS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIGN, "<sign>");
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MUNUS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // advice adviceRef ('{' attributeAssignBody '}')?
  public static boolean adviceBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adviceBody")) return false;
    if (!nextTokenIs(builder_, ADVICE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ADVICE);
    result_ = result_ && adviceRef(builder_, level_ + 1);
    result_ = result_ && adviceBody_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADVICE_BODY, result_);
    return result_;
  }

  // ('{' attributeAssignBody '}')?
  private static boolean adviceBody_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adviceBody_2")) return false;
    adviceBody_2_0(builder_, level_ + 1);
    return true;
  }

  // '{' attributeAssignBody '}'
  private static boolean adviceBody_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adviceBody_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CURVE1);
    result_ = result_ && attributeAssignBody(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE2);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // advice idDeclaration
  public static boolean adviceDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adviceDeclaration")) return false;
    if (!nextTokenIs(builder_, ADVICE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ADVICE);
    result_ = result_ && idDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADVICE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref
  public static boolean adviceRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "adviceRef")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, ADVICE_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean algorithmName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "algorithmName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ALGORITHM_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // anyAtomicOrBag
  public static boolean anyAtomicOrBagType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyAtomicOrBagType")) return false;
    if (!nextTokenIs(builder_, ANYATOMICORBAG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ANYATOMICORBAG);
    exit_section_(builder_, marker_, ANY_ATOMIC_OR_BAG_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // anyAtomic
  public static boolean anyAtomicType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anyAtomicType")) return false;
    if (!nextTokenIs(builder_, ANYATOMIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ANYATOMIC);
    exit_section_(builder_, marker_, ANY_ATOMIC_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // attributeRef '=' expression
  public static boolean attributeAssign(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeAssign")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeRef(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTRIBUTE_ASSIGN, result_);
    return result_;
  }

  /* ********************************************************** */
  // attributeAssign+
  public static boolean attributeAssignBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeAssignBody")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeAssign(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!attributeAssign(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attributeAssignBody", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, ATTRIBUTE_ASSIGN_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // attributeId attributeType attributeCategory
  public static boolean attributeBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeBody")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeId(builder_, level_ + 1);
    result_ = result_ && attributeType(builder_, level_ + 1);
    result_ = result_ && attributeCategory(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTRIBUTE_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // category '=' ref
  public static boolean attributeCategory(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeCategory")) return false;
    if (!nextTokenIs(builder_, CATEGORY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CATEGORY, ASSIGN);
    result_ = result_ && ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTRIBUTE_CATEGORY, result_);
    return result_;
  }

  /* ********************************************************** */
  // attribute attributeName '{' attributeBody '}'
  public static boolean attributeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDeclaration")) return false;
    if (!nextTokenIs(builder_, ATTRIBUTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ATTRIBUTE);
    result_ = result_ && attributeName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE1);
    result_ = result_ && attributeBody(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE2);
    exit_section_(builder_, marker_, ATTRIBUTE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // '[' attributeDesignatorMustBePresent? attributeDesignatorIssuer? ']'
  public static boolean attributeDesignator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDesignator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_DESIGNATOR, "<attribute designator>");
    result_ = consumeToken(builder_, "[");
    result_ = result_ && attributeDesignator_1(builder_, level_ + 1);
    result_ = result_ && attributeDesignator_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // attributeDesignatorMustBePresent?
  private static boolean attributeDesignator_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDesignator_1")) return false;
    attributeDesignatorMustBePresent(builder_, level_ + 1);
    return true;
  }

  // attributeDesignatorIssuer?
  private static boolean attributeDesignator_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDesignator_2")) return false;
    attributeDesignatorIssuer(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // issuer '=' STRING_LITERAL
  public static boolean attributeDesignatorIssuer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDesignatorIssuer")) return false;
    if (!nextTokenIs(builder_, ISSUER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ISSUER, ASSIGN, STRING_LITERAL);
    exit_section_(builder_, marker_, ATTRIBUTE_DESIGNATOR_ISSUER, result_);
    return result_;
  }

  /* ********************************************************** */
  // musteepresent
  public static boolean attributeDesignatorMustBePresent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDesignatorMustBePresent")) return false;
    if (!nextTokenIs(builder_, MUSTEEPRESENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MUSTEEPRESENT);
    exit_section_(builder_, marker_, ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // id '=' xacmlDeclaration
  public static boolean attributeId(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeId")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, ASSIGN);
    result_ = result_ && xacmlDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTRIBUTE_ID, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean attributeName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ATTRIBUTE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref attributeDesignator?
  public static boolean attributeRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeRef")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    result_ = result_ && attributeRef_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTRIBUTE_REF, result_);
    return result_;
  }

  // attributeDesignator?
  private static boolean attributeRef_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeRef_1")) return false;
    attributeDesignator(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // type '=' ref
  public static boolean attributeType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeType")) return false;
    if (!nextTokenIs(builder_, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, TYPE, ASSIGN);
    result_ = result_ && ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, ATTRIBUTE_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // category categoryName '=' xacmlDeclaration
  public static boolean categoryDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "categoryDeclaration")) return false;
    if (!nextTokenIs(builder_, CATEGORY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CATEGORY);
    result_ = result_ && categoryName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && xacmlDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, CATEGORY_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean categoryName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "categoryName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, CATEGORY_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // clauseOperator clauseExpression
  public static boolean clauseAddin(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clauseAddin")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = clauseOperator(builder_, level_ + 1);
    result_ = result_ && clauseExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, CLAUSE_ADDIN, result_);
    return result_;
  }

  /* ********************************************************** */
  // clause clauseExpression clauseAddin*
  public static boolean clauseEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clauseEntry")) return false;
    if (!nextTokenIs(builder_, CLAUSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CLAUSE);
    result_ = result_ && clauseExpression(builder_, level_ + 1);
    result_ = result_ && clauseEntry_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, CLAUSE_ENTRY, result_);
    return result_;
  }

  // clauseAddin*
  private static boolean clauseEntry_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clauseEntry_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!clauseAddin(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "clauseEntry_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // singleClauseExpression | functionClause
  public static boolean clauseExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clauseExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLAUSE_EXPRESSION, "<clause expression>");
    result_ = singleClauseExpression(builder_, level_ + 1);
    if (!result_) result_ = functionClause(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // attributeRef | constant
  public static boolean clauseOperand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clauseOperand")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLAUSE_OPERAND, "<clause operand>");
    result_ = attributeRef(builder_, level_ + 1);
    if (!result_) result_ = constant(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean clauseOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "clauseOperator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, CLAUSE_OPERATOR, result_);
    return result_;
  }

  /* ********************************************************** */
  // apply ref
  public static boolean combinationAlgorithmRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "combinationAlgorithmRef")) return false;
    if (!nextTokenIs(builder_, APPLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, APPLY);
    result_ = result_ && ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, COMBINATION_ALGORITHM_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // wrappedExpressions | expressions
  public static boolean conditionBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditionBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONDITION_BODY, "<condition body>");
    result_ = wrappedExpressions(builder_, level_ + 1);
    if (!result_) result_ = expressions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // condition conditionBody
  public static boolean conditionEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditionEntry")) return false;
    if (!nextTokenIs(builder_, CONDITION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONDITION);
    result_ = result_ && conditionBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONDITION_ENTRY, result_);
    return result_;
  }

  /* ********************************************************** */
  // integerLiteral|
  //     STRING_LITERAL
  public static boolean constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTANT, "<constant>");
    result_ = integerLiteral(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean description(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "description")) return false;
    if (!nextTokenIs(builder_, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING_LITERAL);
    exit_section_(builder_, marker_, DESCRIPTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // permit|deny
  public static boolean effect(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "effect")) return false;
    if (!nextTokenIs(builder_, "<effect>", DENY, PERMIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EFFECT, "<effect>");
    result_ = consumeToken(builder_, PERMIT);
    if (!result_) result_ = consumeToken(builder_, DENY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // operand | wrappedExpressions
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = operand(builder_, level_ + 1);
    if (!result_) result_ = wrappedExpressions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // operator expression
  public static boolean expressionAddin(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionAddin")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_ADDIN, "<expression addin>");
    result_ = operator(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expression expressionAddin*
  public static boolean expressions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSIONS, "<expressions>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && expressions_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expressionAddin*
  private static boolean expressions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressions_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expressionAddin(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expressions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // functionRef | operand | expressions | wrappedExpressions
  public static boolean functionArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_ARGUMENT, "<function argument>");
    result_ = functionRef(builder_, level_ + 1);
    if (!result_) result_ = operand(builder_, level_ + 1);
    if (!result_) result_ = expressions(builder_, level_ + 1);
    if (!result_) result_ = wrappedExpressions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // xacmlDeclaration ':' functionBodyArgument+ variableArguments? '->' functionBodyReturn
  public static boolean functionBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionBody")) return false;
    if (!nextTokenIs(builder_, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = xacmlDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && functionBody_2(builder_, level_ + 1);
    result_ = result_ && functionBody_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "->");
    result_ = result_ && functionBodyReturn(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_BODY, result_);
    return result_;
  }

  // functionBodyArgument+
  private static boolean functionBody_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionBody_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = functionBodyArgument(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!functionBodyArgument(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionBody_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variableArguments?
  private static boolean functionBody_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionBody_3")) return false;
    variableArguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // typeRef | typeBag | anyAtomicType | anyAtomicOrBagType | functionType
  public static boolean functionBodyArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionBodyArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_BODY_ARGUMENT, "<function body argument>");
    result_ = typeRef(builder_, level_ + 1);
    if (!result_) result_ = typeBag(builder_, level_ + 1);
    if (!result_) result_ = anyAtomicType(builder_, level_ + 1);
    if (!result_) result_ = anyAtomicOrBagType(builder_, level_ + 1);
    if (!result_) result_ = functionType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // typeRef | typeBag | anyAtomicType
  public static boolean functionBodyReturn(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionBodyReturn")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_BODY_RETURN, "<function body return>");
    result_ = typeRef(builder_, level_ + 1);
    if (!result_) result_ = typeBag(builder_, level_ + 1);
    if (!result_) result_ = anyAtomicType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // functionRefName '(' functionClauseArgument (',' functionClauseArgument)* ')'
  public static boolean functionClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionClause")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = functionRefName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && functionClauseArgument(builder_, level_ + 1);
    result_ = result_ && functionClause_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, FUNCTION_CLAUSE, result_);
    return result_;
  }

  // (',' functionClauseArgument)*
  private static boolean functionClause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionClause_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!functionClause_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionClause_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' functionClauseArgument
  private static boolean functionClause_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionClause_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && functionClauseArgument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // attributeRef | constant
  public static boolean functionClauseArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionClauseArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_CLAUSE_ARGUMENT, "<function clause argument>");
    result_ = attributeRef(builder_, level_ + 1);
    if (!result_) result_ = constant(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // function functionName '=' functionBody
  public static boolean functionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration")) return false;
    if (!nextTokenIs(builder_, FUNCTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FUNCTION);
    result_ = result_ && functionName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && functionBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // functionRefName '(' functionArgument (',' functionArgument)* ')'
  public static boolean functionEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionEntry")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = functionRefName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && functionArgument(builder_, level_ + 1);
    result_ = result_ && functionEntry_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, FUNCTION_ENTRY, result_);
    return result_;
  }

  // (',' functionArgument)*
  private static boolean functionEntry_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionEntry_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!functionEntry_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionEntry_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' functionArgument
  private static boolean functionEntry_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionEntry_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && functionArgument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean functionName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, FUNCTION_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // function '[' functionRefName ']'
  public static boolean functionRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionRef")) return false;
    if (!nextTokenIs(builder_, FUNCTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FUNCTION);
    result_ = result_ && consumeToken(builder_, "[");
    result_ = result_ && functionRefName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, FUNCTION_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref
  public static boolean functionRefName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionRefName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_REF_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // function
  public static boolean functionType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionType")) return false;
    if (!nextTokenIs(builder_, FUNCTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FUNCTION);
    exit_section_(builder_, marker_, FUNCTION_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER ('=' xacmlDeclaration)?
  public static boolean idDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "idDeclaration")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && idDeclaration_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ID_DECLARATION, result_);
    return result_;
  }

  // ('=' xacmlDeclaration)?
  private static boolean idDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "idDeclaration_1")) return false;
    idDeclaration_1_0(builder_, level_ + 1);
    return true;
  }

  // '=' xacmlDeclaration
  private static boolean idDeclaration_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "idDeclaration_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && xacmlDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // import importName
  public static boolean importDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importDeclaration")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPORT);
    result_ = result_ && importName(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPORT_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // '.' '*'
  public static boolean importEverything(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importEverything")) return false;
    if (!nextTokenIs(builder_, DOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, MULTIPLY);
    exit_section_(builder_, marker_, IMPORT_EVERYTHING, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualifiedName importEverything?
  public static boolean importName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedName(builder_, level_ + 1);
    result_ = result_ && importName_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPORT_NAME, result_);
    return result_;
  }

  // importEverything?
  private static boolean importName_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importName_1")) return false;
    importEverything(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // Sign? DecimalIntegerLiteral
  public static boolean integerLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "integerLiteral")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INTEGER_LITERAL, "<integer literal>");
    result_ = integerLiteral_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DECIMALINTEGERLITERAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Sign?
  private static boolean integerLiteral_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "integerLiteral_0")) return false;
    Sign(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // clauseOperand
  public static boolean leftClauseOperand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "leftClauseOperand")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LEFT_CLAUSE_OPERAND, "<left clause operand>");
    result_ = clauseOperand(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
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
  public static boolean namespaceBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMESPACE_BODY, "<namespace body>");
    result_ = namespaceEntry(builder_, level_ + 1);
    if (!result_) result_ = policySetEntry(builder_, level_ + 1);
    if (!result_) result_ = policyEntry(builder_, level_ + 1);
    if (!result_) result_ = ruleEntry(builder_, level_ + 1);
    if (!result_) result_ = obligationDeclaration(builder_, level_ + 1);
    if (!result_) result_ = adviceDeclaration(builder_, level_ + 1);
    if (!result_) result_ = attributeDeclaration(builder_, level_ + 1);
    if (!result_) result_ = policyCombinatorDeclaration(builder_, level_ + 1);
    if (!result_) result_ = ruleCombinatorDeclaration(builder_, level_ + 1);
    if (!result_) result_ = typeDeclaration(builder_, level_ + 1);
    if (!result_) result_ = operatorDeclaration(builder_, level_ + 1);
    if (!result_) result_ = functionDeclaration(builder_, level_ + 1);
    if (!result_) result_ = importDeclaration(builder_, level_ + 1);
    if (!result_) result_ = categoryDeclaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // namespace namespaceName '{' namespaceBody* '}'
  public static boolean namespaceEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceEntry")) return false;
    if (!nextTokenIs(builder_, NAMESPACE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMESPACE_ENTRY, null);
    result_ = consumeToken(builder_, NAMESPACE);
    result_ = result_ && namespaceName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, namespaceEntry_3(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, CURVE2) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // namespaceBody*
  private static boolean namespaceEntry_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceEntry_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!namespaceBody(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespaceEntry_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean namespaceName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedName(builder_, level_ + 1);
    exit_section_(builder_, marker_, NAMESPACE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // obligation obligationRef ('{' attributeAssignBody '}')?
  public static boolean obligationBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "obligationBody")) return false;
    if (!nextTokenIs(builder_, OBLIGATION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OBLIGATION);
    result_ = result_ && obligationRef(builder_, level_ + 1);
    result_ = result_ && obligationBody_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, OBLIGATION_BODY, result_);
    return result_;
  }

  // ('{' attributeAssignBody '}')?
  private static boolean obligationBody_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "obligationBody_2")) return false;
    obligationBody_2_0(builder_, level_ + 1);
    return true;
  }

  // '{' attributeAssignBody '}'
  private static boolean obligationBody_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "obligationBody_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CURVE1);
    result_ = result_ && attributeAssignBody(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE2);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // obligation idDeclaration
  public static boolean obligationDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "obligationDeclaration")) return false;
    if (!nextTokenIs(builder_, OBLIGATION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OBLIGATION);
    result_ = result_ && idDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, OBLIGATION_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // obligationBody | adviceBody
  public static boolean obligationOrAdviceBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "obligationOrAdviceBody")) return false;
    if (!nextTokenIs(builder_, "<obligation or advice body>", ADVICE, OBLIGATION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OBLIGATION_OR_ADVICE_BODY, "<obligation or advice body>");
    result_ = obligationBody(builder_, level_ + 1);
    if (!result_) result_ = adviceBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ref
  public static boolean obligationRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "obligationRef")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, OBLIGATION_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // on effect '{' obligationOrAdviceBody+ '}'
  public static boolean onEffect(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "onEffect")) return false;
    if (!nextTokenIs(builder_, ON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ON_EFFECT, null);
    result_ = consumeToken(builder_, ON);
    result_ = result_ && effect(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, onEffect_3(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, CURVE2) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // obligationOrAdviceBody+
  private static boolean onEffect_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "onEffect_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = obligationOrAdviceBody(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!obligationOrAdviceBody(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "onEffect_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // functionEntry | attributeRef | constant | wrappedExpressions
  public static boolean operand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operand")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPERAND, "<operand>");
    result_ = functionEntry(builder_, level_ + 1);
    if (!result_) result_ = attributeRef(builder_, level_ + 1);
    if (!result_) result_ = constant(builder_, level_ + 1);
    if (!result_) result_ = wrappedExpressions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '&&' | '||' | '<=' | '>=' | '<' | '>' | '+' | '-' | '*' | '/' | '=='
  public static boolean operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPERATOR, "<operator>");
    result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, OR);
    if (!result_) result_ = consumeToken(builder_, LESSOREQUAL);
    if (!result_) result_ = consumeToken(builder_, MOREOREQUAL);
    if (!result_) result_ = consumeToken(builder_, LESS);
    if (!result_) result_ = consumeToken(builder_, MORE);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MUNUS);
    if (!result_) result_ = consumeToken(builder_, MULTIPLY);
    if (!result_) result_ = consumeToken(builder_, DIVIDE);
    if (!result_) result_ = consumeToken(builder_, EQUAL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // infix operatorFeature* '(' operator ')' '=' '{' operatorDeclarationBody+ '}' operatorInvrese?
  public static boolean operatorDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorDeclaration")) return false;
    if (!nextTokenIs(builder_, INFIX)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INFIX);
    result_ = result_ && operatorDeclaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && operator(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    result_ = result_ && consumeTokens(builder_, 0, ASSIGN, CURVE1);
    result_ = result_ && operatorDeclaration_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE2);
    result_ = result_ && operatorDeclaration_9(builder_, level_ + 1);
    exit_section_(builder_, marker_, OPERATOR_DECLARATION, result_);
    return result_;
  }

  // operatorFeature*
  private static boolean operatorDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorDeclaration_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!operatorFeature(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "operatorDeclaration_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // operatorDeclarationBody+
  private static boolean operatorDeclaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorDeclaration_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = operatorDeclarationBody(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!operatorDeclarationBody(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "operatorDeclaration_7", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // operatorInvrese?
  private static boolean operatorDeclaration_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorDeclaration_9")) return false;
    operatorInvrese(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // functionBody
  public static boolean operatorDeclarationBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorDeclarationBody")) return false;
    if (!nextTokenIs(builder_, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = functionBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, OPERATOR_DECLARATION_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // comm | allowbags
  public static boolean operatorFeature(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorFeature")) return false;
    if (!nextTokenIs(builder_, "<operator feature>", ALLOWBAGS, COMM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPERATOR_FEATURE, "<operator feature>");
    result_ = consumeToken(builder_, COMM);
    if (!result_) result_ = consumeToken(builder_, ALLOWBAGS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // inv operator
  public static boolean operatorInvrese(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorInvrese")) return false;
    if (!nextTokenIs(builder_, INV)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INV);
    result_ = result_ && operator(builder_, level_ + 1);
    exit_section_(builder_, marker_, OPERATOR_INVRESE, result_);
    return result_;
  }

  /* ********************************************************** */
  // targetEntry|
  //         combinationAlgorithmRef|
  //         onEffect|
  //         ruleRef|
  //         ruleEntry
  public static boolean policyBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POLICY_BODY, "<policy body>");
    result_ = targetEntry(builder_, level_ + 1);
    if (!result_) result_ = combinationAlgorithmRef(builder_, level_ + 1);
    if (!result_) result_ = onEffect(builder_, level_ + 1);
    if (!result_) result_ = ruleRef(builder_, level_ + 1);
    if (!result_) result_ = ruleEntry(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // policyCombinator algorithmName '=' xacmlDeclaration
  public static boolean policyCombinatorDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyCombinatorDeclaration")) return false;
    if (!nextTokenIs(builder_, POLICYCOMBINATOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, POLICYCOMBINATOR);
    result_ = result_ && algorithmName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && xacmlDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, POLICY_COMBINATOR_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // policy policyName? description? '{' policyBody* '}'
  public static boolean policyEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyEntry")) return false;
    if (!nextTokenIs(builder_, POLICY)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POLICY_ENTRY, null);
    result_ = consumeToken(builder_, POLICY);
    result_ = result_ && policyEntry_1(builder_, level_ + 1);
    result_ = result_ && policyEntry_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE1);
    pinned_ = result_; // pin = 4
    result_ = result_ && report_error_(builder_, policyEntry_4(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, CURVE2) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // policyName?
  private static boolean policyEntry_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyEntry_1")) return false;
    policyName(builder_, level_ + 1);
    return true;
  }

  // description?
  private static boolean policyEntry_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyEntry_2")) return false;
    description(builder_, level_ + 1);
    return true;
  }

  // policyBody*
  private static boolean policyEntry_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyEntry_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!policyBody(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "policyEntry_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // idDeclaration
  public static boolean policyName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = idDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, POLICY_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref
  public static boolean policyOrPolicySetRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policyOrPolicySetRef")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, POLICY_OR_POLICY_SET_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // combinationAlgorithmRef|
  //         targetEntry|
  //         onEffect|
  //         policyOrPolicySetRef|
  //         policyEntry|
  //         policySetEntry
  public static boolean policySetBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policySetBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POLICY_SET_BODY, "<policy set body>");
    result_ = combinationAlgorithmRef(builder_, level_ + 1);
    if (!result_) result_ = targetEntry(builder_, level_ + 1);
    if (!result_) result_ = onEffect(builder_, level_ + 1);
    if (!result_) result_ = policyOrPolicySetRef(builder_, level_ + 1);
    if (!result_) result_ = policyEntry(builder_, level_ + 1);
    if (!result_) result_ = policySetEntry(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // policyset policySetName? description? '{' policySetBody* '}'
  public static boolean policySetEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policySetEntry")) return false;
    if (!nextTokenIs(builder_, POLICYSET)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POLICY_SET_ENTRY, null);
    result_ = consumeToken(builder_, POLICYSET);
    result_ = result_ && policySetEntry_1(builder_, level_ + 1);
    result_ = result_ && policySetEntry_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE1);
    pinned_ = result_; // pin = 4
    result_ = result_ && report_error_(builder_, policySetEntry_4(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, CURVE2) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // policySetName?
  private static boolean policySetEntry_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policySetEntry_1")) return false;
    policySetName(builder_, level_ + 1);
    return true;
  }

  // description?
  private static boolean policySetEntry_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policySetEntry_2")) return false;
    description(builder_, level_ + 1);
    return true;
  }

  // policySetBody*
  private static boolean policySetEntry_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policySetEntry_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!policySetBody(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "policySetEntry_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean policySetName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "policySetName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedName(builder_, level_ + 1);
    exit_section_(builder_, marker_, POLICY_SET_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER ['.' IDENTIFIER]
  public static boolean qualifiedName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifiedName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && qualifiedName_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_NAME, result_);
    return result_;
  }

  // ['.' IDENTIFIER]
  private static boolean qualifiedName_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifiedName_1")) return false;
    parseTokens(builder_, 0, DOT, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // qualifiedName
  public static boolean ref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ref")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedName(builder_, level_ + 1);
    exit_section_(builder_, marker_, REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // clauseOperand
  public static boolean rightClauseOperand(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rightClauseOperand")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RIGHT_CLAUSE_OPERAND, "<right clause operand>");
    result_ = clauseOperand(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // namespaceEntry+
  static boolean root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root")) return false;
    if (!nextTokenIs(builder_, NAMESPACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespaceEntry(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!namespaceEntry(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "root", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // targetEntry | conditionEntry | onEffect
  public static boolean ruleBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RULE_BODY, "<rule body>");
    result_ = targetEntry(builder_, level_ + 1);
    if (!result_) result_ = conditionEntry(builder_, level_ + 1);
    if (!result_) result_ = onEffect(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ruleCombinator algorithmName '=' xacmlDeclaration
  public static boolean ruleCombinatorDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleCombinatorDeclaration")) return false;
    if (!nextTokenIs(builder_, RULECOMBINATOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RULECOMBINATOR);
    result_ = result_ && algorithmName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && xacmlDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, RULE_COMBINATOR_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // rule ruleName? description? '{' effect ruleBody* '}'
  public static boolean ruleEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleEntry")) return false;
    if (!nextTokenIs(builder_, RULE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RULE_ENTRY, null);
    result_ = consumeToken(builder_, RULE);
    result_ = result_ && ruleEntry_1(builder_, level_ + 1);
    result_ = result_ && ruleEntry_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURVE1);
    pinned_ = result_; // pin = 4
    result_ = result_ && report_error_(builder_, effect(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ruleEntry_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, CURVE2) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ruleName?
  private static boolean ruleEntry_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleEntry_1")) return false;
    ruleName(builder_, level_ + 1);
    return true;
  }

  // description?
  private static boolean ruleEntry_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleEntry_2")) return false;
    description(builder_, level_ + 1);
    return true;
  }

  // ruleBody*
  private static boolean ruleEntry_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleEntry_5")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ruleBody(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ruleEntry_5", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // idDeclaration
  public static boolean ruleName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = idDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, RULE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref
  public static boolean ruleRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ruleRef")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, RULE_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // leftClauseOperand operator rightClauseOperand
  public static boolean singleClauseExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "singleClauseExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SINGLE_CLAUSE_EXPRESSION, "<single clause expression>");
    result_ = leftClauseOperand(builder_, level_ + 1);
    result_ = result_ && operator(builder_, level_ + 1);
    result_ = result_ && rightClauseOperand(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // target clauseEntry+
  public static boolean targetEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "targetEntry")) return false;
    if (!nextTokenIs(builder_, TARGET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TARGET);
    result_ = result_ && targetEntry_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TARGET_ENTRY, result_);
    return result_;
  }

  // clauseEntry+
  private static boolean targetEntry_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "targetEntry_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = clauseEntry(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!clauseEntry(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "targetEntry_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // bag '[' (typeRef| anyAtomicType) ']'
  public static boolean typeBag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeBag")) return false;
    if (!nextTokenIs(builder_, BAG)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BAG);
    result_ = result_ && consumeToken(builder_, "[");
    result_ = result_ && typeBag_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, marker_, TYPE_BAG, result_);
    return result_;
  }

  // typeRef| anyAtomicType
  private static boolean typeBag_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeBag_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeRef(builder_, level_ + 1);
    if (!result_) result_ = anyAtomicType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type typeName '=' xacmlDeclaration
  public static boolean typeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration")) return false;
    if (!nextTokenIs(builder_, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPE);
    result_ = result_ && typeName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN);
    result_ = result_ && xacmlDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean typeName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeName")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, TYPE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // ref
  public static boolean typeRef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeRef")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // '*'
  public static boolean variableArguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableArguments")) return false;
    if (!nextTokenIs(builder_, MULTIPLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MULTIPLY);
    exit_section_(builder_, marker_, VARIABLE_ARGUMENTS, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' expressions ')'
  public static boolean wrappedExpressions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wrappedExpressions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WRAPPED_EXPRESSIONS, "<wrapped expressions>");
    result_ = consumeToken(builder_, "(");
    result_ = result_ && expressions(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean xacmlDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "xacmlDeclaration")) return false;
    if (!nextTokenIs(builder_, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING_LITERAL);
    exit_section_(builder_, marker_, XACML_DECLARATION, result_);
    return result_;
  }

}
