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

public class AlfaPolicyBodyImpl extends ASTWrapperPsiElement implements AlfaPolicyBody {

  public AlfaPolicyBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitPolicyBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaCombinationAlgorithmRef getCombinationAlgorithmRef() {
    return findChildByClass(AlfaCombinationAlgorithmRef.class);
  }

  @Override
  @Nullable
  public AlfaOnEffect getOnEffect() {
    return findChildByClass(AlfaOnEffect.class);
  }

  @Override
  @Nullable
  public AlfaRuleEntry getRuleEntry() {
    return findChildByClass(AlfaRuleEntry.class);
  }

  @Override
  @Nullable
  public AlfaRuleRef getRuleRef() {
    return findChildByClass(AlfaRuleRef.class);
  }

  @Override
  @Nullable
  public AlfaTargetEntry getTargetEntry() {
    return findChildByClass(AlfaTargetEntry.class);
  }

}
