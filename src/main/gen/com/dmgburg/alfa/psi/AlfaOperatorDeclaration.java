// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaOperatorDeclaration extends PsiElement {

  @NotNull
  AlfaOperator getOperator();

  @NotNull
  List<AlfaOperatorDeclarationBody> getOperatorDeclarationBodyList();

  @NotNull
  List<AlfaOperatorFeature> getOperatorFeatureList();

  @Nullable
  AlfaOperatorInvrese getOperatorInvrese();

}
