// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.dmgburg.alfa.reference.AlfaNamedElementWithIdentifier;
import com.dmgburg.alfa.domain.Identifier;

public interface AlfaRuleEntry extends AlfaNamedElementWithIdentifier {

  @Nullable
  AlfaDescription getDescription();

  @Nullable
  AlfaRuleBody getRuleBody();

  @Nullable
  AlfaRuleName getRuleName();

  @NotNull
  String getName();

  @NotNull
  PsiElement setName(String newName);

  @Nullable
  PsiElement getNameIdentifier();

  @Nullable
  Identifier getIdentifier();

}
