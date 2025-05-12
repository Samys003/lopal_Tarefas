package br.dev.samara.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

import br.dev.samara.tarefas.model.Funcionario;
import br.dev.samara.tarefas.model.Tarefa;

public class Main {

	//determinando o caminho que será utilizado
	private static String path = "C:\\Users\\25132563\\Tarefa\\tarefas.txt";
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		Tarefa t = new Tarefa();
		gravarArquivo();
		lerArquivo();

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
			
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	
	}
	

	private static void lerArquivo() {
		
		
		//abrir o arquivo para leitura
		FileReader file = null;
		BufferedReader buffer = null;
		try {
			
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
