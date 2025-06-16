package br.dev.samara.tarefas.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//fabricando o objeto para poder ser utilizado em qualquer outra classe com mais facilidade.

public class FileFactory {
	
	private FileWriter fw;
	private BufferedWriter bw;
	
	private FileReader fr;
	private BufferedReader br;
	
	private String pathFuncionarios = "C:\\Users\\25132563\\Tarefa\\funcionarios.csv";
	private String pathTarefas = "C:\\Users\\25132563\\Tarefa\\tarefas.csv";
	
	
	public BufferedReader getBufferedReader() throws FileNotFoundException, IOException{
		fr = new FileReader(pathFuncionarios);
		br = new BufferedReader(fr);
		return br;
		
	}
	//pegar uma leitura de arquivo
	public BufferedWriter getBufferedWriter() throws FileNotFoundException, IOException {
			
			//append - "acrescentar". Necessario adicionar o true para o arquivo ser gravado.
			fw = new FileWriter(pathFuncionarios, true);
			bw = new BufferedWriter(fw);
			
			return bw;
			
		
		}
	
	public BufferedReader getBufferedReaderTarefas() throws FileNotFoundException, IOException{
		
		fr = new FileReader(pathTarefas);
		br = new BufferedReader(fr);
		return br;
	}
	
	public BufferedWriter getBuffedWriterTarefas() throws FileNotFoundException, IOException{
		
		fw = new FileWriter(pathTarefas, true);
		bw = new BufferedWriter(fw);
		
		return bw;
		
	}
	
		
	}
	

	


