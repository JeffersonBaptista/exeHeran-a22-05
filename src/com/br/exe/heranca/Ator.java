package com.br.exe.heranca;

import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa{
	
	List<String> filmesParticipantes = new ArrayList<String>();
	
	boolean temOscar;
	int anoNascimento;
	String melhorFilme;
	
	public Ator(String nome, String sobrenome, int idade, List<String> filmesParticipantes, boolean temOscar,
			int anoNascimento, String melhorFilme) {
		super(nome, sobrenome, idade);
		this.filmesParticipantes = filmesParticipantes;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
		this.melhorFilme = melhorFilme;
	}
	
	public List<String> getFilmesParticipantes() {
		return filmesParticipantes;
	}
	public void setFilmesParticipantes(List<String> filmesParticipantes) {
		this.filmesParticipantes = filmesParticipantes;
	}
	public boolean isTemOscar() {
		return temOscar;
	}
	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getMelhorFilme() {
		return melhorFilme;
	}
	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}
	
	
	public String temOscar() {
		String oscar ="";
		
		if(this.isTemOscar() == true) {
			oscar = "Sim";
		}else {
			oscar = "Não";
		}
		
		
		return oscar;
	}
	
	
	public String toString() {
		
		String modelo ="";
		
		modelo += "Nome: "+super.getNome()+"\n";
		modelo += "Sobrenome: "+super.getSobrenome()+"\n";
		modelo += "Idade: "+super.getIdade()+"\n";
		modelo += "Tem Oscar: " + temOscar()+"\n";
		modelo += "Ano do nascimento: "+ this.getAnoNascimento()+"\n";
		modelo += "Filmes Participantes: "+this.getFilmesParticipantes()+"\n";
		modelo += " \nMelhor filme: " + this.getMelhorFilme() + " ****\n";
		
		return modelo;		
		
		
		
	}
	

}
