// This is a generated file. Not intended for manual editing.
package com.dmgburg.alfa.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AlfaRuleEntry extends PsiElement {

  @Nullable
  AlfaDescription getDescription();

  @Nullable
  AlfaEffect getEffect();

  @NotNull
  List<AlfaRuleBody> getRuleBodyList();

  @Nullable
  AlfaRuleName getRuleName();

}
