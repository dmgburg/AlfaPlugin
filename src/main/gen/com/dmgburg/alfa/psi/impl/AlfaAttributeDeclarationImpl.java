// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi.impl;

import com.dmgburg.alfa.domain.Identifier;
import com.dmgburg.alfa.psi.AlfaAttributeBody;
import com.dmgburg.alfa.psi.AlfaAttributeDeclaration;
import com.dmgburg.alfa.psi.AlfaAttributeName;
import com.dmgburg.alfa.psi.AlfaVisitor;
import com.dmgburg.alfa.reference.AlfaNamedAttribute;
import com.dmgburg.alfa.stubs.AttributeDeclarationStub;
import com.dmgburg.alfa.utils.ParserUtilsKt;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AlfaAttributeDeclarationImpl extends AlfaNamedAttribute implements AlfaAttributeDeclaration {

  public AlfaAttributeDeclarationImpl(ASTNode node) {
    super(node);
  }

  public AlfaAttributeDeclarationImpl(AttributeDeclarationStub stub, IStubElementType type) {
    super(stub, type);
  }

  public void accept(@NotNull AlfaVisitor visitor) {
    visitor.visitAttributeDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AlfaVisitor) accept((AlfaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AlfaAttributeBody getAttributeBody() {
    return findChildByClass(AlfaAttributeBody.class);
  }

  @Override
  @NotNull
  public AlfaAttributeName getAttributeName() {
    return findNotNullChildByClass(AlfaAttributeName.class);
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
