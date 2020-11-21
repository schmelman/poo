package src.screens;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import src.components.Field;

public class TabCard extends JComponent {
  private static final long serialVersionUID = 1L;
  private Field FBalance, FLimit, FName;
  private JPanel ClientPanel;

  public TabCard() {
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    FBalance = new Field("Balance", 10);
    FLimit = new Field("Limit", 10);
    FName = new Field("Name", 10);

    ClientPanel = new JPanel();
    ClientPanel.setLayout(new BoxLayout(ClientPanel, BoxLayout.Y_AXIS));

    ClientPanel.add(FName);
    ClientPanel.add(FBalance);
    ClientPanel.add(FLimit);

    add(ClientPanel);
  }
}
