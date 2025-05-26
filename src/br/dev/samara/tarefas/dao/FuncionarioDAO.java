package br.dev.samara.tarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.samara.tarefas.factory.FileFactory;
import br.dev.samara.tarefas.model.Funcionario;

public class FuncionarioDAO {
	
	// manipular arquivo, gravar, editar, consultar etc... 
	// essa classe já entende que o objeto é um banco de dados.

	private Funcionario funcionario;
	private FileFactory ff = new FileFactory();
	
	//Método construtor
	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void gravar() {
		
		
		try {
			
			BufferedWriter bw = ff.getBufferedWriter();
			
			bw.write(funcionario.toString());
			bw.flush();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	} 
	
	//exibir Funcionarios
	public List<Funcionario> showEmployees() {
		
		//criar a lista de funcionarios 
		List<Funcionario> funcionarios = new ArrayList<>();
		
		try {
			BufferedReader br = ff.getBufferedReader();
			br.readLine(); //ler a primeira linha e posicionar o ponteiro pra a próxima linha
			
			String linha = br.readLine();		
		
			//criação de looping
			do {	
				linha = br.readLine();
				
				// "?:" recebe os resultados em verdadeiro ou falso ou se a condição necessita de só duas respostas
				String funcionario[] = linha != null ? linha.split(",") : null;
				
				Funcionario f = new Funcionario();
				f.setCodigo(funcionario[0]);
				f.setNome(funcionario[1]);
				f.setTelefone(funcionario[2]);
				f.setEmail(funcionario[3]);
				
				funcionarios.add(f);
			
			} while(linha != null);
			
			
			
//			String linha = br.readLine();
//			//vetor ou array / armazena informações em "gavetas"
//			String[] funcionario = linha.split(",");
//			
//			Funcionario f = new Funcionario();
//			f.setCodigo(funcionario[0]);
//			f.setNome(funcionario[1]);
//			f.setTelefone(funcionario[2]);
//			f.setEmail(funcionario[3]);
//			
//			System.out.println(funcionario.toString());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return funcionarios;
		
		
		
		
	}
		
	
}




