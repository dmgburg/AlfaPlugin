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

public class AlfaExpressionAddinImpl extends ASTWrapperPsiElement implements AlfaExpressionAddin {

  public AlfaExpressionAddinImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitExpressionAddin(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AlfaExpression getExpression() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, AlfaExpression.class));
  }

  @Override
  @NotNull
  public AlfaOperator getOperator() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, AlfaOperator.class));
  }

}
