package br.dev.samara.tarefas.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tarefa {
	
	private int codigo;
	private String titulo;
	private String descricao;
	private LocalDateTime datainicial;
	private LocalDateTime prazo;
	private LocalDateTime dataConclusao;
	//criado um enumerador para o status
	private Status status;
	private Funcionario responsavel;
	
	public Tarefa(String titulo) {
       this.titulo = titulo;
		
	}
	
	public Tarefa(String titulo, String descricao) {
		
	}
	
	public Tarefa() {}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getDatainicial() {
		return datainicial;
	}
	public void setDatainicial(LocalDateTime datainicial) {
		this.datainicial = datainicial;
	}
	public LocalDateTime getPrazo() {
		return prazo;
	}
	public void setPrazo(LocalDateTime prazo) {
		this.prazo = prazo;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	public int getCodigo() {
		return codigo;
	}
	public LocalDateTime getDataConclusao() {
		return dataConclusao;
	}
	
	

}
