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

public class AlfaOperandImpl extends ASTWrapperPsiElement implements AlfaOperand {

  public AlfaOperandImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitOperand(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaAttributeRef getAttributeRef() {
    return findChildByClass(AlfaAttributeRef.class);
  }

  @Override
  @Nullable
  public AlfaConstant getConstant() {
    return findChildByClass(AlfaConstant.class);
  }

  @Override
  @Nullable
  public AlfaFunctionEntry getFunctionEntry() {
    return findChildByClass(AlfaFunctionEntry.class);
  }

  @Override
  @Nullable
  public AlfaWrappedExpressions getWrappedExpressions() {
    return findChildByClass(AlfaWrappedExpressions.class);
  }

}
