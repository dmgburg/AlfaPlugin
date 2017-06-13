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

public class AlfaClauseEntryImpl extends ASTWrapperPsiElement implements AlfaClauseEntry {

  public AlfaClauseEntryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitClauseEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AlfaClauseAddin> getClauseAddinList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlfaClauseAddin.class);
  }

  @Override
  @NotNull
  public AlfaClauseExpression getClauseExpression() {
    return findNotNullChildByClass(AlfaClauseExpression.class);
  }

}