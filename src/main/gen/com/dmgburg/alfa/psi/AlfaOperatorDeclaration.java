// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.dmgburg.alfa.reference.AlfaNamedElement;
import com.intellij.psi.StubBasedPsiElement;
import com.dmgburg.alfa.stubs.OperatorDeclarationStub;

public interface AlfaOperatorDeclaration extends AlfaNamedElement, StubBasedPsiElement<OperatorDeclarationStub> {

  @NotNull
  AlfaOperator getOperator();

  @NotNull
  List<AlfaOperatorDeclarationBody> getOperatorDeclarationBodyList();

  @NotNull
  List<AlfaOperatorFeature> getOperatorFeatureList();

  @Nullable
  AlfaOperatorInvrese getOperatorInvrese();

  @NotNull
  String getName();

  @NotNull
  PsiElement setName(String newName);

  @Nullable
  PsiElement getNameIdentifier();

}
