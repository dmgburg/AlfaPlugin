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

public class AlfaRuleEntryImpl extends ASTWrapperPsiElement implements AlfaRuleEntry {

  public AlfaRuleEntryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitRuleEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaDescription getDescription() {
    return findChildByClass(AlfaDescription.class);
  }

  @Override
  @NotNull
  public AlfaEffect getEffect() {
    return findNotNullChildByClass(AlfaEffect.class);
  }

  @Override
  @NotNull
  public List<AlfaRuleBody> getRuleBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlfaRuleBody.class);
  }

  @Override
  @Nullable
  public AlfaRuleName getRuleName() {
    return findChildByClass(AlfaRuleName.class);
  }

}
