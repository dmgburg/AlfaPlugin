// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface AlfaAttributeRef extends PsiElement {

  @Nullable
  AlfaAttributeDesignator getAttributeDesignator();

  @NotNull
  AlfaRef getRef();

  @NotNull
  PsiReference[] getReferences();

  @Nullable
  PsiReference getReference();

}
