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

public class AlfaFunctionBodyArgumentImpl extends ASTWrapperPsiElement implements AlfaFunctionBodyArgument {

  public AlfaFunctionBodyArgumentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitFunctionBodyArgument(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaAnyAtomicOrBagType getAnyAtomicOrBagType() {
    return findChildByClass(AlfaAnyAtomicOrBagType.class);
  }

  @Override
  @Nullable
  public AlfaAnyAtomicType getAnyAtomicType() {
    return findChildByClass(AlfaAnyAtomicType.class);
  }

  @Override
  @Nullable
  public AlfaFunctionType getFunctionType() {
    return findChildByClass(AlfaFunctionType.class);
  }

  @Override
  @Nullable
  public AlfaTypeBag getTypeBag() {
    return findChildByClass(AlfaTypeBag.class);
  }

  @Override
  @Nullable
  public AlfaTypeRef getTypeRef() {
    return findChildByClass(AlfaTypeRef.class);
  }

}