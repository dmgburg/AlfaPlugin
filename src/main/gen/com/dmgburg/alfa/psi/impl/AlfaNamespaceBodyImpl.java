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

public class AlfaNamespaceBodyImpl extends ASTWrapperPsiElement implements AlfaNamespaceBody {

  public AlfaNamespaceBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitNamespaceBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaNamespaceEntry getNamespaceEntry() {
    return findChildByClass(AlfaNamespaceEntry.class);
  }

  @Override
  @Nullable
  public AlfaPolicyEntry getPolicyEntry() {
    return findChildByClass(AlfaPolicyEntry.class);
  }

  @Override
  @Nullable
  public AlfaPolicySetEntry getPolicySetEntry() {
    return findChildByClass(AlfaPolicySetEntry.class);
  }

  @Override
  @Nullable
  public AlfaRuleEntry getRuleEntry() {
    return findChildByClass(AlfaRuleEntry.class);
  }

}
