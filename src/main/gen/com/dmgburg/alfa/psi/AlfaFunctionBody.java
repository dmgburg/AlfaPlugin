// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaFunctionBody extends PsiElement {

  @NotNull
  List<AlfaFunctionBodyArgument> getFunctionBodyArgumentList();

  @NotNull
  AlfaFunctionBodyReturn getFunctionBodyReturn();

  @Nullable
  AlfaVariableArguments getVariableArguments();

  @NotNull
  AlfaXacmlDeclaration getXacmlDeclaration();

}
