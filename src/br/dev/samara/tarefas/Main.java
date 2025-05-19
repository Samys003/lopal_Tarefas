package br.dev.samara.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

import br.dev.samara.tarefas.dao.FuncionarioDAO;
import br.dev.samara.tarefas.model.Funcionario;
import br.dev.samara.tarefas.model.Tarefa;

public class Main {


	//determinando o caminho que será utilizado
	private static String path = "C:\\Users\\25132563\\Tarefa\\tarefas.txt";
	
	public static void main(String[] args) {
		
		//criação de lista 
		List<String> frutas = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();
		List<Double> numeros = new ArrayList<>();
		
		numeros.add(4.9);
		numeros.add(12.78);
		
		frutas.add("abacaxi");
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("banana");
		frutas.add("laranja");
		frutas.add("mexirica");
		frutas.add("carambola");
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCodigo(1);
		funcionario.setEmail("Juliamariadosanjos@gmail.com");
		funcionario.setMatricula("28927509");
		funcionario.setNome("Julia Maria");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCodigo(2);
		funcionario2.setEmail("matheuscarvalho@gmail.com");
		funcionario2.setMatricula("28927509");
		funcionario2.setNome("Matheus Carvalho");
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setCodigo(3);
		funcionario3.setEmail("Ceciliagatinha123@gmail.com");
		funcionario3.setMatricula("253625874");
		funcionario3.setNome("Maria cecilia");
		
		//adição de funcionarios sem necessidade do funcionario.add (um a um).
		funcionarios.addAll(List.of(funcionario, funcionario2, funcionario3));
		
		System.out.println(frutas);
		System.out.println(funcionarios);
		
		//para cada funcionario passado, guarde na variavel f
		for (Funcionario f : funcionarios) {
			System.out.println(f.getNome()+ " - " + f.getEmail());
			
		}
		
		
		//FuncionarioDAO dao = new FuncionarioDAO(funcionario);
		//dao.gravar();
		
		//System.out.println(funcionario.toString());
		

	}
	
	private static void gravarArquivo() {
		
		FileWriter arquivo = null;
		BufferedWriter escritor = null;

		try { 
			
			arquivo = new FileWriter(path, true);
			escritor = new BufferedWriter(arquivo);
				
			escritor.write("Essa é ultima linha por enquanto\n");			
			// salva o arquivo
			escritor.flush();
			// descarga para outro lugar (hd)
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	
	}
	

	private static void lerArquivo() {
		
		
		//abrir o arquivo para leitura
		FileReader file = null;
		BufferedReader buffer = null;
		try {
			
			// le o registro e posiciona para a próxima linha
			file = new FileReader(path);
			buffer = new BufferedReader(file);
			
			String linha = buffer.readLine();
			
			while (linha != null) { 
			  
				linha = buffer.readLine();
					System.out.println(linha);	
					linha = buffer.readLine();
			  
			}
			
			
		} catch (FileNotFoundException erro) {
			System.out.println("arquivo não achado!");
			System.out.println(erro.getMessage());
			
		} catch (IOException erro) {
			System.out.println("você não pode ler o arquivo");
			System.out.println(erro.getMessage());
			
		} catch (Exception erro) {
			System.out.println("Erro genérico");		
		}
	}

}
