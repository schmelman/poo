package src;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Main extends JFrame {
  private static final long serialVersionUID = 4648172894076113183L;
  private ArrayList<String> lista = new ArrayList<String>();
  private ArrayList<String> lista1 = new ArrayList<String>();
  Vector<String> comboBox = new Vector<String>();

  public Main() {
    setTitle("PagNÃOSeguro - Trabalho 3");
    setLayout(new BorderLayout());
    comboBox.add("Selecione algo abaixo...");
    JTabbedPane tabs = new JTabbedPane();
    JLabel lbl = new JLabel("label");
    tabs.addTab("Tab 1", lbl);
    add(tabs);
  }
  
  public static void main(String[] args) {
    Main m = new Main();
    m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    m.pack();
    m.setMinimumSize(new Dimension(384, 100));
    m.setLocationRelativeTo(null);
    m.setVisible(true);
  }
}