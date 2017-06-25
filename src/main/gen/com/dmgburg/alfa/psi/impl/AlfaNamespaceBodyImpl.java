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
    return findChildByClass(AlfaAdviceDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaAttributeDeclaration getAttributeDeclaration() {
    return findChildByClass(AlfaAttributeDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaCategoryDeclaration getCategoryDeclaration() {
    return findChildByClass(AlfaCategoryDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(AlfaFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaImportDeclaration getImportDeclaration() {
    return findChildByClass(AlfaImportDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaNamespaceEntry getNamespaceEntry() {
    return findChildByClass(AlfaNamespaceEntry.class);
  }

  @Override
  @Nullable
  public AlfaObligationDeclaration getObligationDeclaration() {
    return findChildByClass(AlfaObligationDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaOperatorDeclaration getOperatorDeclaration() {
    return findChildByClass(AlfaOperatorDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaPolicyCombinatorDeclaration getPolicyCombinatorDeclaration() {
    return findChildByClass(AlfaPolicyCombinatorDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaPolicyEntry getPolicyEntry() {
    return findChildByClass(AlfaPolicyEntry.class);
  }

  @Override
  @Nullable
  public AlfaPolicySetEntry getPolicySetEntry() {
    return findChildByClass(AlfaPolicySetEntry.class);
  }

  @Override
  @Nullable
  public AlfaRuleCombinatorDeclaration getRuleCombinatorDeclaration() {
    return findChildByClass(AlfaRuleCombinatorDeclaration.class);
  }

  @Override
  @Nullable
  public AlfaRuleEntry getRuleEntry() {
    return findChildByClass(AlfaRuleEntry.class);
  }

  @Override
  @Nullable
  public AlfaTypeDeclaration getTypeDeclaration() {
    return findChildByClass(AlfaTypeDeclaration.class);
  }

}
