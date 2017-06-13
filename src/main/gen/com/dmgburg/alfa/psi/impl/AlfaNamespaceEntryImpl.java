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

public class AlfaNamespaceEntryImpl extends ASTWrapperPsiElement implements AlfaNamespaceEntry {

  public AlfaNamespaceEntryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitNamespaceEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AlfaNamespaceBody> getNamespaceBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlfaNamespaceBody.class);
  }

  @Override
  @NotNull
  public AlfaNamespaceName getNamespaceName() {
    return findNotNullChildByClass(AlfaNamespaceName.class);
  }

}