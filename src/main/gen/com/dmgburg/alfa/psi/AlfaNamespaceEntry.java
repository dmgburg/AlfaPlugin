// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaNamespaceEntry extends PsiElement {

  @NotNull
  List<AlfaNamespaceBody> getNamespaceBodyList();

  @NotNull
  AlfaNamespaceName getNamespaceName();

}
