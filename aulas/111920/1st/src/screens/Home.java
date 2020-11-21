package src.screens;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JComponent;

import src.classes.Card;
import src.classes.Client;

public class Home extends JComponent {
  private static final long serialVersionUID = 7260319961893599971L;
  private List<Client> Clients = new ArrayList<Client>();
  private List<Card> Cards = new ArrayList<Card>();
  
  public Home() {
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

    TabClient TClient = new TabClient();
    
    add(TClient);
  }
}
