package br.dev.samara.tarefas.dao;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.samara.tarefas.factory.FileFactory;
import br.dev.samara.tarefas.model.Tarefa;

public class TarefaDAO {
	
	private Tarefa tarefa;
	private FileFactory ff = new FileFactory();
	
	public TarefaDAO(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	public void gravarTarefa(){
		
		try {
			BufferedWriter bw = ff.getBuffedWriterTarefas();
			
			bw.write(tarefa.toString());
			bw.flush();
			
		} catch (IOException e) {
		 System.out.println(e.getMessage());
			
		}
	}
	
	public List<Tarefa> showTasks(){
		
		List<Tarefa> tarefas = new ArrayList<>();
		
		try {
			BufferedReader br = ff.getBufferedReaderTarefas();
			br.readLine();
			
		String linha = br.readLine();	
			
		do {
		
		linha = br.readLine();	
		
		String tarefa[] = linha != null ? linha.split(",") : null;
		
		Tarefa t = new Tarefa();
		t.setTitulo(tarefa[0]);
			
			
		} while	(linha !=null);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
