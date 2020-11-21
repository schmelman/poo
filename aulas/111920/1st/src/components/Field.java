package src.components;

import java.awt.GridLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

public class Field extends JComponent {
  private static final long serialVersionUID = 1L;
  private JLabel label;
  private JFormattedTextField textField;

  public Field(String tlabel, int tSize) {
    setLayout(new GridLayout(1, 2));
    label = new JLabel(tlabel);
    textField = new JFormattedTextField();
    add(label);
    add(textField);
  }

  public String getValue() {
    return this.textField.getText();
  }

  public void resetValue() {
    this.textField.setText("");
  }
}
