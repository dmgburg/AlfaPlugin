// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.dmgburg.alfa.reference.AlfaElementWithIdentifier;
import com.intellij.psi.StubBasedPsiElement;
import com.dmgburg.alfa.stubs.AttributeDeclarationStub;
import com.dmgburg.alfa.domain.Identifier;

public interface AlfaAttributeDeclaration extends AlfaElementWithIdentifier, StubBasedPsiElement<AttributeDeclarationStub> {

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
