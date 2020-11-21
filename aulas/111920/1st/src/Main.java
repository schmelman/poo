package src;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import src.screens.Home;

class Main extends JFrame {
  private static final long serialVersionUID = 7322163248789304821L;

  public Main() {
    setLayout(new FlowLayout());
    Home h = new Home();
    add(h);
  }

  public static void main(String[] args) {
    Main h = new Main();
    JFrame.setDefaultLookAndFeelDecorated(true);
    h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    h.pack();
    h.setLocationRelativeTo(null);
    h.setVisible(true);
  }
}