// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import com.dmgburg.alfa.stubs.AttributeDeclarationStub;
import com.intellij.psi.StubBasedPsiElement;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.dmgburg.alfa.reference.AlfaNamedElementWithIdentifier;
import com.dmgburg.alfa.domain.Identifier;

public interface AlfaAttributeDeclaration extends AlfaNamedElementWithIdentifier, StubBasedPsiElement<AttributeDeclarationStub> {

  @Nullable
  AlfaAttributeBody getAttributeBody();

  @NotNull
  AlfaAttributeName getAttributeName();

  @NotNull
  String getName();

  @NotNull
  PsiElement setName(String newName);

  @Nullable
  PsiElement getNameIdentifier();

  @Nullable
  Identifier getIdentifier();

}
