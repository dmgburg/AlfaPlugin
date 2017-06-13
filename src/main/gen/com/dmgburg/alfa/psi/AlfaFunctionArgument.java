// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaFunctionArgument extends PsiElement {

  @Nullable
  AlfaExpressions getExpressions();

  @Nullable
  AlfaFunctionRef getFunctionRef();

  @Nullable
  AlfaOperand getOperand();

  @Nullable
  AlfaWrappedExpressions getWrappedExpressions();

}
