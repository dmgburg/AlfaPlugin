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

public class AlfaFunctionBodyImpl extends ASTWrapperPsiElement implements AlfaFunctionBody {

  public AlfaFunctionBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitFunctionBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AlfaFunctionBodyArgument> getFunctionBodyArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlfaFunctionBodyArgument.class);
  }

  @Override
  @NotNull
  public AlfaFunctionBodyReturn getFunctionBodyReturn() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, AlfaFunctionBodyReturn.class));
  }

  @Override
  @Nullable
  public AlfaVariableArguments getVariableArguments() {
    return PsiTreeUtil.getChildOfType(this, AlfaVariableArguments.class);
  }

  @Override
  @NotNull
  public AlfaXacmlDeclaration getXacmlDeclaration() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, AlfaXacmlDeclaration.class));
  }

}
