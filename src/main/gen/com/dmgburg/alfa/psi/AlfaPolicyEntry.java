// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.dmgburg.alfa.reference.AlfaElementWithIdentifier;
import com.intellij.psi.StubBasedPsiElement;
import com.dmgburg.alfa.stubs.PolicyEntryStub;
import com.dmgburg.alfa.domain.Identifier;

public interface AlfaPolicyEntry extends AlfaElementWithIdentifier, StubBasedPsiElement<PolicyEntryStub> {

  @Nullable
  AlfaDescription getDescription();

  @NotNull
  List<AlfaPolicyBody> getPolicyBodyList();

  @Nullable
  AlfaPolicyName getPolicyName();

  @NotNull
  String getName();

  @NotNull
  PsiElement setName(String newName);

  @Nullable
  PsiElement getNameIdentifier();

  @Nullable
  Identifier getIdentifier();

}
