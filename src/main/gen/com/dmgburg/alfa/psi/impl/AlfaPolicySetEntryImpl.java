// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.dmgburg.alfa.psi.AlfaTypes.*;
import com.dmgburg.alfa.reference.AlfaNamedPolicySet;
import com.dmgburg.alfa.psi.*;
import com.dmgburg.alfa.utils.ParserUtilsKt;
import com.dmgburg.alfa.domain.Identifier;
import com.dmgburg.alfa.stubs.PolicySetEntryStub;
import com.intellij.psi.stubs.IStubElementType;

public class AlfaPolicySetEntryImpl extends AlfaNamedPolicySet implements AlfaPolicySetEntry {

  public AlfaPolicySetEntryImpl(ASTNode node) {
    super(node);
  }

  public AlfaPolicySetEntryImpl(PolicySetEntryStub stub, IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitPolicySetEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaDescription getDescription() {
    return PsiTreeUtil.getChildOfType(this, AlfaDescription.class);
  }

  @Override
  @NotNull
  public List<AlfaPolicySetBody> getPolicySetBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AlfaPolicySetBody.class);
  }

  @Override
  @Nullable
  public AlfaPolicySetName getPolicySetName() {
    return PsiTreeUtil.getChildOfType(this, AlfaPolicySetName.class);
  }

  @NotNull
  public String getName() {
    return ParserUtilsKt.getName(this);
  }

  @NotNull
  public PsiElement setName(String newName) {
    return ParserUtilsKt.setName(this, newName);
  }

  @Nullable
  public PsiElement getNameIdentifier() {
    return ParserUtilsKt.getNameIdentifier(this);
  }

  @Nullable
  public Identifier getIdentifier() {
    return ParserUtilsKt.getIdentifier(this);
  }

}
