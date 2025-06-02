package br.dev.samara.tarefas.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameSelecaoUsuario {
	
	private JLabel labelOpcao;
	private JButton btnTarefa;
	private JButton bntFuncionario;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setLayout(null);
		tela.setSize(100, 100);
		
		Container painel = tela.getContentPane();
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	
		
		
		tela.setVisible(true);
	}
	
	
}
