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

public class AlfaPolicySetBodyImpl extends ASTWrapperPsiElement implements AlfaPolicySetBody {

  public AlfaPolicySetBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitPolicySetBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaCombinationAlgorithmRef getCombinationAlgorithmRef() {
    return PsiTreeUtil.getChildOfType(this, AlfaCombinationAlgorithmRef.class);
  }

  @Override
  @Nullable
  public AlfaOnEffect getOnEffect() {
    return PsiTreeUtil.getChildOfType(this, AlfaOnEffect.class);
  }

  @Override
  @Nullable
  public AlfaPolicyEntry getPolicyEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaPolicyEntry.class);
  }

  @Override
  @Nullable
  public AlfaPolicyOrPolicySetRef getPolicyOrPolicySetRef() {
    return PsiTreeUtil.getChildOfType(this, AlfaPolicyOrPolicySetRef.class);
  }

  @Override
  @Nullable
  public AlfaPolicySetEntry getPolicySetEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaPolicySetEntry.class);
  }

  @Override
  @Nullable
  public AlfaTargetEntry getTargetEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaTargetEntry.class);
  }

}
