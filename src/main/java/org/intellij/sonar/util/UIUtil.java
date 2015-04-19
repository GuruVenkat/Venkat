package org.intellij.sonar.util;

import javax.swing.*;

import com.google.common.base.Optional;

public final class UIUtil {

  private UIUtil() {
  }

  public static Object makeObj(final String item) {
    return new Object() {
      public String toString() {
        return item;
      }
    };
  }

  public static void selectComboBoxItem(JComboBox jComboBox,String name) {
    Optional itemToSelect = Optional.absent();
    for (int i = 0;i < jComboBox.getItemCount();i++) {
      final Object item = jComboBox.getItemAt(i);
      if (name.equals(item.toString())) {
        itemToSelect = Optional.of(item);
      }
    }
    if (itemToSelect.isPresent())
      jComboBox.setSelectedItem(itemToSelect.get());
  }
}
