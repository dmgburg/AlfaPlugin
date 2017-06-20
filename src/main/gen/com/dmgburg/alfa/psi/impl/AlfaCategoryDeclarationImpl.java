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

public class AlfaCategoryDeclarationImpl extends ASTWrapperPsiElement implements AlfaCategoryDeclaration {

  public AlfaCategoryDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitCategoryDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AlfaCategoryName getCategoryName() {
    return findNotNullChildByClass(AlfaCategoryName.class);
  }

  @Override
  @NotNull
  public AlfaXacmlDeclaration getXacmlDeclaration() {
    return findNotNullChildByClass(AlfaXacmlDeclaration.class);
  }

}
