package br.dev.samara.tarefas.factory;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//fabricando o objeto para poder ser utilizado em qualquer outra classe com mais facilidade.

public class FileFactory {
	
	private FileWriter fw;
	private BufferedWriter bw;
	
	private String pathFuncionarios = "C:\\Users\\25132563\\Tarefa\\funcionarios.csv";
	
	//pegar uma leitura de arquivo
	public BufferedWriter getBufferedWriter() throws FileNotFoundException, IOException {
			
			//append - "acrescentar". Necessario adicionar o true para o arquivo ser gravado.
			fw = new FileWriter(pathFuncionarios, true);
			bw = new BufferedWriter(fw);
			
			return bw;
			
		
		}
		
	}
	

	


