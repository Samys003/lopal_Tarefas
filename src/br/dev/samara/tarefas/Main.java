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
import br.dev.samara.tarefas.ui.FrameFuncionario;
import br.dev.samara.tarefas.ui.FrameListaFuncionario;
import br.dev.samara.tarefas.ui.FrameSelecaoUsuario;
import br.dev.samara.tarefas.utils.Utils;

public class Main {


	//determinando o caminho que será utilizado
	private static String path = "C:\\Users\\25132563\\Tarefa\\tarefas.txt";
	
	public static void main(String[] args) {
		
	
		
		//new FrameListaFuncionario();
		
		//new FrameFuncionario();
		
		new FrameSelecaoUsuario();
	
		

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
