// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.dmgburg.alfa.psi.impl.*;

public interface AlfaTypes {

  IElementType ATTRIBUTE_DESIGNATOR = new AlfaElementType("ATTRIBUTE_DESIGNATOR");
  IElementType ATTRIBUTE_DESIGNATOR_ISSUER = new AlfaElementType("ATTRIBUTE_DESIGNATOR_ISSUER");
  IElementType ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT = new AlfaElementType("ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT");
  IElementType ATTRIBUTE_REF = new AlfaElementType("ATTRIBUTE_REF");
  IElementType CLAUSE_ADDIN = new AlfaElementType("CLAUSE_ADDIN");
  IElementType CLAUSE_ENTRY = new AlfaElementType("CLAUSE_ENTRY");
  IElementType CLAUSE_EXPRESSION = new AlfaElementType("CLAUSE_EXPRESSION");
  IElementType CLAUSE_OPERAND = new AlfaElementType("CLAUSE_OPERAND");
  IElementType CLAUSE_OPERATOR = new AlfaElementType("CLAUSE_OPERATOR");
  IElementType COMBINATION_ALGORITHM_REF = new AlfaElementType("COMBINATION_ALGORITHM_REF");
  IElementType CONDITION_BODY = new AlfaElementType("CONDITION_BODY");
  IElementType CONDITION_ENTRY = new AlfaElementType("CONDITION_ENTRY");
  IElementType CONSTANT = new AlfaElementType("CONSTANT");
  IElementType DESCRIPTION = new AlfaElementType("DESCRIPTION");
  IElementType EFFECT = new AlfaElementType("EFFECT");
  IElementType EXPRESSION = new AlfaElementType("EXPRESSION");
  IElementType EXPRESSIONS = new AlfaElementType("EXPRESSIONS");
  IElementType EXPRESSION_ADDIN = new AlfaElementType("EXPRESSION_ADDIN");
  IElementType FUNCTION_ARGUMENT = new AlfaElementType("FUNCTION_ARGUMENT");
  IElementType FUNCTION_CLAUSE = new AlfaElementType("FUNCTION_CLAUSE");
  IElementType FUNCTION_CLAUSE_ARGUMENT = new AlfaElementType("FUNCTION_CLAUSE_ARGUMENT");
  IElementType FUNCTION_ENTRY = new AlfaElementType("FUNCTION_ENTRY");
  IElementType FUNCTION_REF = new AlfaElementType("FUNCTION_REF");
  IElementType FUNCTION_REF_NAME = new AlfaElementType("FUNCTION_REF_NAME");
  IElementType IDENTIFIER = new AlfaElementType("IDENTIFIER");
  IElementType ID_DECLARATION = new AlfaElementType("ID_DECLARATION");
  IElementType INTEGER_LITERAL = new AlfaElementType("INTEGER_LITERAL");
  IElementType LEFT_CLAUSE_OPERAND = new AlfaElementType("LEFT_CLAUSE_OPERAND");
  IElementType NAMESPACE_BODY = new AlfaElementType("NAMESPACE_BODY");
  IElementType NAMESPACE_ENTRY = new AlfaElementType("NAMESPACE_ENTRY");
  IElementType NAMESPACE_NAME = new AlfaElementType("NAMESPACE_NAME");
  IElementType ON_EFFECT = new AlfaElementType("ON_EFFECT");
  IElementType OPERAND = new AlfaElementType("OPERAND");
  IElementType OPERATOR = new AlfaElementType("OPERATOR");
  IElementType POLICY_BODY = new AlfaElementType("POLICY_BODY");
  IElementType POLICY_ENTRY = new AlfaElementType("POLICY_ENTRY");
  IElementType POLICY_NAME = new AlfaElementType("POLICY_NAME");
  IElementType POLICY_SET_BODY = new AlfaElementType("POLICY_SET_BODY");
  IElementType POLICY_SET_ENTRY = new AlfaElementType("POLICY_SET_ENTRY");
  IElementType POLICY_SET_NAME = new AlfaElementType("POLICY_SET_NAME");
  IElementType QUALIFIED_NAME = new AlfaElementType("QUALIFIED_NAME");
  IElementType REF = new AlfaElementType("REF");
  IElementType RIGHT_CLAUSE_OPERAND = new AlfaElementType("RIGHT_CLAUSE_OPERAND");
  IElementType RULE_BODY = new AlfaElementType("RULE_BODY");
  IElementType RULE_ENTRY = new AlfaElementType("RULE_ENTRY");
  IElementType RULE_NAME = new AlfaElementType("RULE_NAME");
  IElementType RULE_REF = new AlfaElementType("RULE_REF");
  IElementType SIGN = new AlfaElementType("SIGN");
  IElementType SINGLE_CLAUSE_EXPRESSION = new AlfaElementType("SINGLE_CLAUSE_EXPRESSION");
  IElementType STRING_LITERAL = new AlfaElementType("STRING_LITERAL");
  IElementType TARGET_ENTRY = new AlfaElementType("TARGET_ENTRY");
  IElementType WRAPPED_EXPRESSIONS = new AlfaElementType("WRAPPED_EXPRESSIONS");
  IElementType XACML_DECLARATION = new AlfaElementType("XACML_DECLARATION");

  IElementType AND = new AlfaTokenType("&&");
  IElementType APPLY = new AlfaTokenType("apply");
  IElementType BLOCK_COMMENT = new AlfaTokenType("block_comment");
  IElementType CLAUSE = new AlfaTokenType("clause");
  IElementType CONDITION = new AlfaTokenType("condition");
  IElementType CURVE1 = new AlfaTokenType("{");
  IElementType CURVE2 = new AlfaTokenType("}");
  IElementType DECIMALINTEGERLITERAL = new AlfaTokenType("DecimalIntegerLiteral");
  IElementType DENY = new AlfaTokenType("deny");
  IElementType DIGIT = new AlfaTokenType("digit");
  IElementType DIVIDE = new AlfaTokenType("/");
  IElementType DOT = new AlfaTokenType(".");
  IElementType EQUAL = new AlfaTokenType("==");
  IElementType FUNCTION = new AlfaTokenType("function");
  IElementType LESS = new AlfaTokenType("<");
  IElementType LESSOREQUAL = new AlfaTokenType("<=");
  IElementType LETTERS = new AlfaTokenType("letters");
  IElementType LINE_COMMENT = new AlfaTokenType("line_comment");
  IElementType MORE = new AlfaTokenType(">");
  IElementType MOREOREQUAL = new AlfaTokenType(">=");
  IElementType MULTIPLY = new AlfaTokenType("*");
  IElementType MUNUS = new AlfaTokenType("-");
  IElementType NAMESPACE = new AlfaTokenType("namespace");
  IElementType OBLEGATIONORADVICEBODY = new AlfaTokenType("oblegationOrAdviceBody");
  IElementType ON = new AlfaTokenType("on");
  IElementType OR = new AlfaTokenType("||");
  IElementType PERMIT = new AlfaTokenType("permit");
  IElementType PLUS = new AlfaTokenType("+");
  IElementType POLICY = new AlfaTokenType("policy");
  IElementType POLICYSET = new AlfaTokenType("policyset");
  IElementType RULE = new AlfaTokenType("rule");
  IElementType STRINGDQ = new AlfaTokenType("StringDQ");
  IElementType STRINGSQ = new AlfaTokenType("StringSQ");
  IElementType TARGET = new AlfaTokenType("target");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ATTRIBUTE_DESIGNATOR) {
        return new AlfaAttributeDesignatorImpl(node);
      }
      else if (type == ATTRIBUTE_DESIGNATOR_ISSUER) {
        return new AlfaAttributeDesignatorIssuerImpl(node);
      }
      else if (type == ATTRIBUTE_DESIGNATOR_MUST_BE_PRESENT) {
        return new AlfaAttributeDesignatorMustBePresentImpl(node);
      }
      else if (type == ATTRIBUTE_REF) {
        return new AlfaAttributeRefImpl(node);
      }
      else if (type == CLAUSE_ADDIN) {
        return new AlfaClauseAddinImpl(node);
      }
      else if (type == CLAUSE_ENTRY) {
        return new AlfaClauseEntryImpl(node);
      }
      else if (type == CLAUSE_EXPRESSION) {
        return new AlfaClauseExpressionImpl(node);
      }
      else if (type == CLAUSE_OPERAND) {
        return new AlfaClauseOperandImpl(node);
      }
      else if (type == CLAUSE_OPERATOR) {
        return new AlfaClauseOperatorImpl(node);
      }
      else if (type == COMBINATION_ALGORITHM_REF) {
        return new AlfaCombinationAlgorithmRefImpl(node);
      }
      else if (type == CONDITION_BODY) {
        return new AlfaConditionBodyImpl(node);
      }
      else if (type == CONDITION_ENTRY) {
        return new AlfaConditionEntryImpl(node);
      }
      else if (type == CONSTANT) {
        return new AlfaConstantImpl(node);
      }
      else if (type == DESCRIPTION) {
        return new AlfaDescriptionImpl(node);
      }
      else if (type == EFFECT) {
        return new AlfaEffectImpl(node);
      }
      else if (type == EXPRESSION) {
        return new AlfaExpressionImpl(node);
      }
      else if (type == EXPRESSIONS) {
        return new AlfaExpressionsImpl(node);
      }
      else if (type == EXPRESSION_ADDIN) {
        return new AlfaExpressionAddinImpl(node);
      }
      else if (type == FUNCTION_ARGUMENT) {
        return new AlfaFunctionArgumentImpl(node);
      }
      else if (type == FUNCTION_CLAUSE) {
        return new AlfaFunctionClauseImpl(node);
      }
      else if (type == FUNCTION_CLAUSE_ARGUMENT) {
        return new AlfaFunctionClauseArgumentImpl(node);
      }
      else if (type == FUNCTION_ENTRY) {
        return new AlfaFunctionEntryImpl(node);
      }
      else if (type == FUNCTION_REF) {
        return new AlfaFunctionRefImpl(node);
      }
      else if (type == FUNCTION_REF_NAME) {
        return new AlfaFunctionRefNameImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new AlfaIdentifierImpl(node);
      }
      else if (type == ID_DECLARATION) {
        return new AlfaIdDeclarationImpl(node);
      }
      else if (type == INTEGER_LITERAL) {
        return new AlfaIntegerLiteralImpl(node);
      }
      else if (type == LEFT_CLAUSE_OPERAND) {
        return new AlfaLeftClauseOperandImpl(node);
      }
      else if (type == NAMESPACE_BODY) {
        return new AlfaNamespaceBodyImpl(node);
      }
      else if (type == NAMESPACE_ENTRY) {
        return new AlfaNamespaceEntryImpl(node);
      }
      else if (type == NAMESPACE_NAME) {
        return new AlfaNamespaceNameImpl(node);
      }
      else if (type == ON_EFFECT) {
        return new AlfaOnEffectImpl(node);
      }
      else if (type == OPERAND) {
        return new AlfaOperandImpl(node);
      }
      else if (type == OPERATOR) {
        return new AlfaOperatorImpl(node);
      }
      else if (type == POLICY_BODY) {
        return new AlfaPolicyBodyImpl(node);
      }
      else if (type == POLICY_ENTRY) {
        return new AlfaPolicyEntryImpl(node);
      }
      else if (type == POLICY_NAME) {
        return new AlfaPolicyNameImpl(node);
      }
      else if (type == POLICY_SET_BODY) {
        return new AlfaPolicySetBodyImpl(node);
      }
      else if (type == POLICY_SET_ENTRY) {
        return new AlfaPolicySetEntryImpl(node);
      }
      else if (type == POLICY_SET_NAME) {
        return new AlfaPolicySetNameImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new AlfaQualifiedNameImpl(node);
      }
      else if (type == REF) {
        return new AlfaRefImpl(node);
      }
      else if (type == RIGHT_CLAUSE_OPERAND) {
        return new AlfaRightClauseOperandImpl(node);
      }
      else if (type == RULE_BODY) {
        return new AlfaRuleBodyImpl(node);
      }
      else if (type == RULE_ENTRY) {
        return new AlfaRuleEntryImpl(node);
      }
      else if (type == RULE_NAME) {
        return new AlfaRuleNameImpl(node);
      }
      else if (type == RULE_REF) {
        return new AlfaRuleRefImpl(node);
      }
      else if (type == SIGN) {
        return new AlfaSignImpl(node);
      }
      else if (type == SINGLE_CLAUSE_EXPRESSION) {
        return new AlfaSingleClauseExpressionImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new AlfaStringLiteralImpl(node);
      }
      else if (type == TARGET_ENTRY) {
        return new AlfaTargetEntryImpl(node);
      }
      else if (type == WRAPPED_EXPRESSIONS) {
        return new AlfaWrappedExpressionsImpl(node);
      }
      else if (type == XACML_DECLARATION) {
        return new AlfaXacmlDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
