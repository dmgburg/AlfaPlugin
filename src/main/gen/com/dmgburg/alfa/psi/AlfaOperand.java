// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaOperand extends PsiElement {

  @Nullable
  AlfaAttributeRef getAttributeRef();

  @Nullable
  AlfaConstant getConstant();

  @Nullable
  AlfaFunctionEntry getFunctionEntry();

  @Nullable
  AlfaWrappedExpressions getWrappedExpressions();

}
