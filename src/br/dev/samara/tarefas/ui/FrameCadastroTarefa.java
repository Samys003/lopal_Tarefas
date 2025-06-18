package br.dev.samara.tarefas.ui;

import java.awt.Container;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.samara.tarefas.model.Status;

public class FrameCadastroTarefa {
	
	private JLabel lblCodigo;
	private JLabel lblTituloTarefa;
	private JLabel lblDescricaoTarefa;
	private JLabel lblDataInicio;
	private JLabel lblDataFinal;
	private JLabel lblPrazo;
	
	
	private JTextField txtCodigo;
	private JTextField txtTituloTarefa;
	private JTextField txtDescricaoTarefa;
	private JTextField txtDataInicio;
	private JTextField txtDataFinal;
	private JTextField txtPrazo;
	
	private JComboBox<Status> boxStatus;
	private JButton btnsalvar;
	private JButton btnsair;
	
	
	public FrameCadastroTarefa() {
		criarTela();
	}
		
		public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 650);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		lblCodigo = new JLabel();
		lblCodigo.setText("Codigo da tarefa: ");
		lblCodigo.setBounds(10, 5, 110, 30);
		
		txtCodigo = new JTextField();
		txtCodigo.setEnabled(false);
		txtCodigo.setBounds(10, 35, 100, 30);
		
		lblTituloTarefa = new JLabel();
		lblTituloTarefa.setText("Titulo: ");
		lblTituloTarefa.setBounds(10, 60, 100, 30);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(10, 85, 200, 30);
		
		lblDescricaoTarefa = new JLabel();
		lblDescricaoTarefa.setText("Descrição: ");
		lblDescricaoTarefa.setBounds(10, 110, 100, 50);
		
		txtDescricaoTarefa = new JTextField();
		txtDescricaoTarefa.setBounds(10, 150, 200, 80);
		
		lblDataInicio = new JLabel();
		lblDataInicio.setText("Data de Inicio: ");
		lblDataInicio.setBounds(10, 220, 100, 50);
		
		txtDataInicio = new JTextField();
		txtDataInicio.setBounds(10, 260, 200, 30);
		
		lblDataFinal = new JLabel();
		lblDataFinal.setText("Data final: ");
		lblDataFinal.setBounds(10, 280, 100, 60);
		
		txtDataFinal = new JTextField();
		txtDataFinal.setBounds(10, 325, 200, 30);
		
		boxStatus = new JComboBox<Status>();
		boxStatus.addItem(Status.NAO_INICIADA);
		boxStatus.addItem(Status.EM_ANDAMENTO);
		boxStatus.addItem(Status.FINALIZADO);		
		boxStatus.addItem(Status.EM_ATRASO);		
		boxStatus.setBounds(10, 380, 120, 30);
		
		btnsair = new JButton();
		btnsair.setText("Sair ");
		btnsair.setBounds(20, 400, 100, 10);
		
		btnsalvar = new JButton();
		
		
		Container painel = tela.getContentPane();
		
		painel.add(lblCodigo);
		painel.add(txtCodigo);
		painel.add(lblTituloTarefa);
		painel.add(txtCodigo);
		painel.add(lblDescricaoTarefa);
		painel.add(lblDataInicio);
		painel.add(txtDescricaoTarefa);
		painel.add(txtDataInicio);
		painel.add(lblDataFinal);
		painel.add(txtDataFinal);
		painel.add(boxStatus);
		painel.add(btnsair);
		
		tela.setVisible(true);
		
	}
}
