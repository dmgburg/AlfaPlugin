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

public class AlfaAttributeDesignatorImpl extends ASTWrapperPsiElement implements AlfaAttributeDesignator {

  public AlfaAttributeDesignatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitAttributeDesignator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaAttributeDesignatorIssuer getAttributeDesignatorIssuer() {
    return findChildByClass(AlfaAttributeDesignatorIssuer.class);
  }

  @Override
  @Nullable
  public AlfaAttributeDesignatorMustBePresent getAttributeDesignatorMustBePresent() {
    return findChildByClass(AlfaAttributeDesignatorMustBePresent.class);
  }

}
