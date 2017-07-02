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

public class AlfaRuleBodyElementImpl extends ASTWrapperPsiElement implements AlfaRuleBodyElement {

  public AlfaRuleBodyElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitRuleBodyElement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaConditionEntry getConditionEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaConditionEntry.class);
  }

  @Override
  @Nullable
  public AlfaOnEffect getOnEffect() {
    return PsiTreeUtil.getChildOfType(this, AlfaOnEffect.class);
  }

  @Override
  @Nullable
  public AlfaTargetEntry getTargetEntry() {
    return PsiTreeUtil.getChildOfType(this, AlfaTargetEntry.class);
  }

}
