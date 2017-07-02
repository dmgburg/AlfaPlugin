// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.dmgburg.alfa.psi.AlfaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.dmgburg.alfa.psi.*;
import com.dmgburg.alfa.utils.ParserUtilsKt;

public class AlfaNamespaceBodyImpl extends ASTWrapperPsiElement implements AlfaNamespaceBody {

  public AlfaNamespaceBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitNamespaceBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaAdviceDeclaration getAdviceDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaAdviceDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaAttributeDeclaration getAttributeDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaAttributeDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaCategoryDeclaration getCategoryDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaCategoryDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaFunctionDeclaration getFunctionDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaImportDeclaration getImportDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaImportDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaNamespaceEntry getNamespaceEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaNamespaceEntry.class);
  }

  @Override
  @Nullable
  public AlfaObligationDeclaration getObligationDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaObligationDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaOperatorDeclaration getOperatorDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaOperatorDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaPolicyCombinatorDeclaration getPolicyCombinatorDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaPolicyCombinatorDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaPolicyEntry getPolicyEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaPolicyEntry.class);
  }

  @Override
  @Nullable
  public AlfaPolicySetEntry getPolicySetEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaPolicySetEntry.class);
  }

  @Override
  @Nullable
  public AlfaRuleCombinatorDeclaration getRuleCombinatorDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaRuleCombinatorDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaRuleEntry getRuleEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaRuleEntry.class);
  }

  @Override
  @Nullable
  public AlfaTypeDeclaration getTypeDeclaration() {
    return PsiTreeUtil.getChildOfType(this, AlfaTypeDeclaration.class);
  }

}
