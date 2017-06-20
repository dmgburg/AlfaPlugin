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

public class AlfaAttributeBodyImpl extends ASTWrapperPsiElement implements AlfaAttributeBody {

  public AlfaAttributeBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitAttributeBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AlfaAttributeCategory getAttributeCategory() {
    return findNotNullChildByClass(AlfaAttributeCategory.class);
  }

  @Override
  @NotNull
  public AlfaAttributeId getAttributeId() {
    return findNotNullChildByClass(AlfaAttributeId.class);
  }

  @Override
  @NotNull
  public AlfaAttributeType getAttributeType() {
    return findNotNullChildByClass(AlfaAttributeType.class);
  }

}