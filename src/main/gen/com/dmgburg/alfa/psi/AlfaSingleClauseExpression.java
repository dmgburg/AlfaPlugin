// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaSingleClauseExpression extends PsiElement {

  @NotNull
  AlfaLeftClauseOperand getLeftClauseOperand();

  @NotNull
  AlfaOperator getOperator();

  @NotNull
  AlfaRightClauseOperand getRightClauseOperand();

}
