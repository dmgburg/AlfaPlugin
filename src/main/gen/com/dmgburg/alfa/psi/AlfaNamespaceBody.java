// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaNamespaceBody extends PsiElement {

  @Nullable
  AlfaAdviceDeclaration getAdviceDeclaration();

  @Nullable
  AlfaAttributeDeclaration getAttributeDeclaration();

  @Nullable
  AlfaCategoryDeclaration getCategoryDeclaration();

  @Nullable
  AlfaFunctionDeclaration getFunctionDeclaration();

  @Nullable
  AlfaImportDeclaration getImportDeclaration();

  @Nullable
  AlfaNamespaceEntry getNamespaceEntry();

  @Nullable
  AlfaObligationDeclaration getObligationDeclaration();

  @Nullable
  AlfaOperatorDeclaration getOperatorDeclaration();

  @Nullable
  AlfaPolicyCombinatorDeclaration getPolicyCombinatorDeclaration();

  @Nullable
  AlfaPolicyEntry getPolicyEntry();

  @Nullable
  AlfaPolicySetEntry getPolicySetEntry();

  @Nullable
  AlfaRuleCombinatorDeclaration getRuleCombinatorDeclaration();

  @Nullable
  AlfaRuleEntry getRuleEntry();

  @Nullable
  AlfaTypeDeclaration getTypeDeclaration();

}
