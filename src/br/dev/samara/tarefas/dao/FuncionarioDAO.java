package br.dev.samara.tarefas.dao;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import br.dev.samara.tarefas.factory.FileFactory;
import br.dev.samara.tarefas.model.Funcionario;

public class FuncionarioDAO {
	
	// manipular arquivo, gravar, editar, consultar etc... 
	// essa classe já entende que o objeto é um banco de dados.

	private Funcionario funcionario;
	
	//Método construtor
	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void gravar() {
		
		FileFactory ff = new FileFactory();
		
		try {
			
			BufferedWriter bw = ff.getBufferedWriter();
			
			bw.write(funcionario.toString());
			bw.flush();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	} 
	
	//exibir Funcionarios
	public void showEmployees() {
		
		
		
		
	}
		
	
}




