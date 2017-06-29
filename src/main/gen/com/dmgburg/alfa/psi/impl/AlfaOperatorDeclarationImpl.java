// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi.impl;

import java.util.List;

import com.dmgburg.alfa.reference.AlfaNamedOperator;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.dmgburg.alfa.psi.AlfaTypes.*;
import com.dmgburg.alfa.reference.AlfaNamedPolicy;
import com.dmgburg.alfa.psi.*;
import com.dmgburg.alfa.utils.ParserUtilsKt;

public class AlfaOperatorDeclarationImpl extends AlfaNamedOperator implements AlfaOperatorDeclaration {

  public AlfaOperatorDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitOperatorDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AlfaOperator getOperator() {
    return findNotNullChildByClass(AlfaOperator.class);
  }

  @Override
  @NotNull
  public List<AlfaOperatorDeclarationBody> getOperatorDeclarationBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlfaOperatorDeclarationBody.class);
  }

  @Override
  @NotNull
  public List<AlfaOperatorFeature> getOperatorFeatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlfaOperatorFeature.class);
  }

  @Override
  @Nullable
  public AlfaOperatorInvrese getOperatorInvrese() {
    return findChildByClass(AlfaOperatorInvrese.class);
  }

  @NotNull
  public String getName() {
    return ParserUtilsKt.getName(this);
  }

  @NotNull
  public PsiElement setName(String newName) {
    return ParserUtilsKt.setName(this, newName);
  }

  @Nullable
  public PsiElement getNameIdentifier() {
    return ParserUtilsKt.getNameIdentifier(this);
  }

}
