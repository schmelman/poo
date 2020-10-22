import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;

import src.components.Field;
import src.elements.Assalariado;
import src.elements.Comissionado;
import src.elements.ComissionadoAssalariado;
import src.elements.Empregado;
import src.elements.Horista;

public class Main extends JFrame implements ActionListener, ItemListener {
  private static final long serialVersionUID = 4648172894076113183L;

  private ArrayList<Empregado> lista = new ArrayList<Empregado>();
  
  private ButtonGroup bg;
  private Field nome, departamento, campo, campo1, campo2, campo3; 
  private JButton adicionar, exibir, exibirAssalariado, exibirComissionado, exibirComissionadoAssalariado, exibirHorista;
  private JPanel painelAssalariado, painelComissionado, painelComissionadoAssalariado, painelGeral, painelHorista;
  private JRadioButton assalariado, comissionado, comissionadoAssalariado, horista;

  public Main() {
    // Título da janela
    super("FIRMA");
    
    // Layout global
    setLayout(new BorderLayout());
    
    // Painel Norte
    assalariado = new JRadioButton("Assalariado", true);
    comissionado = new JRadioButton("Comissionado", false);
    comissionadoAssalariado = new JRadioButton("Comissionado Assalariado", false);
    horista = new JRadioButton("Horista", false);
    
    assalariado.addItemListener(this);
    comissionado.addItemListener(this);
    comissionadoAssalariado.addItemListener(this);
    horista.addItemListener(this);

    bg = new ButtonGroup();
    bg.add(assalariado);
    bg.add(comissionado);
    bg.add(comissionadoAssalariado);
    bg.add(horista);

    JPanel Norte = new JPanel(new FlowLayout());
    Norte.add(assalariado);
    Norte.add(comissionado);
    Norte.add(comissionadoAssalariado);
    Norte.add(horista);
    // Fim Painel Norte

    // Criar campos gerais
    nome = new Field("Nome", 10);
    departamento = new Field("Departamento", 10);
    // Fim Criar campos gerais

    // Painel Geral
    painelGeral = new JPanel();
    painelGeral.setLayout(new BoxLayout(painelGeral, BoxLayout.Y_AXIS));
    painelGeral.add(nome);
    painelGeral.add(departamento);
    // Fim Painel Geral

    // Criar campos Assalariado
    campo = new Field("Salário", 10);
    campo1 = new Field("Desconto", 10);
    // Fim Criar campos Assalariado

    // Painel Assalariado
    painelAssalariado = new JPanel();
    painelAssalariado.setLayout(new BoxLayout(painelAssalariado, BoxLayout.Y_AXIS));
    painelAssalariado.add(campo);
    painelAssalariado.add(campo1);
    // Fim Painel Assalariado

    // Criar campos Comissionado
    campo = new Field("Total de Vendas", 10);
    campo1 = new Field("Taxa de Comissão", 10);
    campo2 = new Field("Bonus", 10);
    // Fim Criar campos Comissionado

    // Painel Comissionado
    painelComissionado = new JPanel();
    painelComissionado.setLayout(new BoxLayout(painelComissionado, BoxLayout.Y_AXIS));
    painelComissionado.add(campo);
    painelComissionado.add(campo1);
    painelComissionado.add(campo2);
    // Fim Painel Comissionado

    // Criar campos Comissionado Assalariado
    campo = new Field("Total de Vendas", 10);
    campo1 = new Field("Taxa de Comissão", 10);
    campo2 = new Field("Bonus", 10);
    campo3 = new Field("Salário Base", 10);
    // Fim Criar campos Comissionado Assalariado

    // Painel Comissionado Assalariado
    painelComissionadoAssalariado = new JPanel();
    painelComissionadoAssalariado.setLayout(new BoxLayout(painelComissionadoAssalariado, BoxLayout.Y_AXIS));
    painelComissionadoAssalariado.add(campo);
    painelComissionadoAssalariado.add(campo1);
    painelComissionadoAssalariado.add(campo2);
    painelComissionadoAssalariado.add(campo3);
    // Fim Painel Comissionado Assalariado
    
    // Criar campos Horista
    campo = new Field("Horas Trabalhadas", 10);
    campo1 = new Field("Salário/hora", 10);
    // Fim Criar campos Horista

    // Painel Horista
    painelHorista = new JPanel();
    painelHorista.setLayout(new BoxLayout(painelHorista, BoxLayout.Y_AXIS));
    painelHorista.add(campo);
    painelHorista.add(campo1);
    // Fim Painel Horista

    // Padrão de visibilidade dos Painéis
    painelGeral.setVisible(true);
    painelAssalariado.setVisible(true);
    painelComissionado.setVisible(false);
    painelComissionadoAssalariado.setVisible(false);
    painelHorista.setVisible(false);
    // Fim Padrão de visibilidade dos Painéis

    // Cria painel central
    JPanel Centro = new JPanel();
    Centro.setLayout(new BoxLayout(Centro, BoxLayout.Y_AXIS));
    Centro.add(painelGeral);
    Centro.add(painelAssalariado);
    Centro.add(painelComissionado);
    Centro.add(painelComissionadoAssalariado);
    Centro.add(painelHorista);

    Centro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    // Fim painel central

    // Botões Sul
    adicionar = new JButton("Adicionar Funcionário");
    exibir = new JButton("Exibir Todos");
    exibirAssalariado = new JButton("Exibir Assalariados");
    exibirComissionado = new JButton("Exibir Comissionados");
    exibirComissionadoAssalariado = new JButton("Exibir Comissionados Assalariados");
    exibirHorista = new JButton("Exibir Horistas");
    // Fim Botões Sul

    // Painel Sul
    JPanel Sul = new JPanel();
    Sul.setLayout(new BoxLayout(Sul, BoxLayout.Y_AXIS));

    JPanel Aux = new JPanel(new FlowLayout());
    JPanel Aux1 = new JPanel(new FlowLayout());

    Aux.add(adicionar);
    Aux.add(exibir);
    Aux.add(exibirAssalariado);

    Aux1.add(exibirComissionado);
    Aux1.add(exibirComissionadoAssalariado);
    Aux1.add(exibirHorista);

    Sul.add(Aux);
    Sul.add(Aux1);
    // Fim Painel Sul

    // Adiciona Funções aos Botões
    adicionar.addActionListener(this);
    exibir.addActionListener(this);
    exibirAssalariado.addActionListener(this);
    exibirComissionado.addActionListener(this);
    exibirComissionadoAssalariado.addActionListener(this);
    exibirHorista.addActionListener(this);
    // Fim Adiciona Funções aos Botões

    // Adiciona painéis à tela
    add(Norte, BorderLayout.NORTH);
    add(Centro, BorderLayout.CENTER);
    add(Sul, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    Main x = new Main();
    x.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    x.pack();
    x.setLocationRelativeTo(null);
    x.setVisible(true);    
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    if(e.getSource() == assalariado) {
      painelAssalariado.setVisible(true);
      painelComissionado.setVisible(false);
      painelComissionadoAssalariado.setVisible(false);
      painelHorista.setVisible(false);
    } else if(e.getSource() == comissionado) {
      painelAssalariado.setVisible(false);
      painelComissionado.setVisible(true);
      painelComissionadoAssalariado.setVisible(false);
      painelHorista.setVisible(false);
    } else if(e.getSource() == comissionadoAssalariado) {
      painelAssalariado.setVisible(false);
      painelComissionado.setVisible(false);
      painelComissionadoAssalariado.setVisible(true);
      painelHorista.setVisible(false);
    } else if(e.getSource() == horista) {
      painelAssalariado.setVisible(false);
      painelComissionado.setVisible(false);
      painelComissionadoAssalariado.setVisible(false);
      painelHorista.setVisible(true);
    }
    this.pack();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String s = "", title = "";
    if(e.getSource() == adicionar) {

    } else if(e.getSource() == exibir) {
      for(int i = 0; i < lista.size(); i++)
        s += lista.get(i).toString();
      title = "Todos os Registros";
    } else if(e.getSource() == exibirAssalariado) {
      for(int i = 0; i < lista.size(); i++)
        if(lista.get(i) instanceof Assalariado)
          s += lista.get(i).toString();
      title = "Todos os Registros (Assalariado)";
    } else if(e.getSource() == exibirComissionado) {
      for(int i = 0; i < lista.size(); i++)
        if(lista.get(i) instanceof Comissionado)
          s += lista.get(i).toString();
      title = "Todos os Registros (Comissionado)";
    } else if(e.getSource() == exibirComissionadoAssalariado) {
      for(int i = 0; i < lista.size(); i++)
        if(lista.get(i) instanceof ComissionadoAssalariado)
          s += lista.get(i).toString();
      title = "Todos os Registros (Comissionado Assalariado)";
    } else if(e.getSource() == exibirHorista) {
      for(int i = 0; i < lista.size(); i++)
        if(lista.get(i) instanceof Horista)
          s += lista.get(i).toString();
      title = "Todos os Registros (Horista)";
    }

    if(e.getSource() == exibir || e.getSource() == exibirAssalariado || e.getSource() == exibirComissionado
        || e.getSource() == exibirComissionadoAssalariado || e.getSource() == exibirHorista)
      if(lista.isEmpty())
          s = "A lista está vazia";
      JOptionPane.showMessageDialog(null, s, title, JOptionPane.PLAIN_MESSAGE);
  }
}