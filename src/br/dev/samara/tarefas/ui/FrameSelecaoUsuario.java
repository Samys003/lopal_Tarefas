package br.dev.samara.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameSelecaoUsuario {
	
	private JLabel lblOpcao;
	private JButton btnTarefa;
	private JButton bntFuncionario;
	
	
	public FrameSelecaoUsuario() {
		criarTela();
		
	}
		private void criarTela(){
		JFrame tela = new JFrame();
		tela.setLayout(null);
		tela.setSize(400, 250);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblOpcao = new JLabel();
		lblOpcao.setText("Selecione a opção desejada: ");
		lblOpcao.setBounds(100, 50, 200, 20);
		
		JButton btnTarefa = new JButton();
		btnTarefa.setText("Tarefa");
		btnTarefa.setBounds(30, 90, 150, 40);
		
		JButton btnFuncionario = new JButton();
		btnFuncionario.setText("Funcionario");
		btnFuncionario.setBounds(200, 90, 150, 40);
		
		btnFuncionario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			new FrameListaFuncionario();
				
			}
		});
		
		btnTarefa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			new FrameCadastroTarefa();
				
			}
		});
		
		Container painel = tela.getContentPane();
		
		painel.add(lblOpcao);
		painel.add(btnTarefa);
		painel.add(btnFuncionario);
		
		
		tela.setVisible(true);
	}
	
	
}
