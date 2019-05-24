package com.br.exe.heranca;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Pessoa{
	
	List<String> linguagensUsadas = new ArrayList<String>();
	int anosExperiencia;
	boolean gostaDeCafe;
	public Programador(String nome, String sobrenome, int idade, List<String> linguagensUsadas, int anosExperiencia,
			boolean gostaDeCafe) {
		
		super(nome, sobrenome, idade);
		this.linguagensUsadas = linguagensUsadas;
		this.anosExperiencia = anosExperiencia;
		this.gostaDeCafe = gostaDeCafe;
	}
	public List<String> getInguagensUsadas() {
		return linguagensUsadas;
	}
	public void setInguagensUsadas(List<String> inguagensUsadas) {
		this.linguagensUsadas = inguagensUsadas;
	}
	public int getAnosExperiencia() {
		return anosExperiencia;
	}
	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}
	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
	
	public String toString() {
		String modelo = "";
		
		modelo += "Nome: " + super.getNome()+ "\n";
		modelo += "Sobrenome: " + super.getSobrenome()+ "\n";
		modelo += "Idade: " + super.getIdade()+ "\n";
		modelo += "Tempo de Experiencia: " + this.anosExperiencia + "\n";
		modelo += "Gosta de café: " + this.isGostaDeCafe()+"\n";
		modelo += "Linguagem usadas: " + this.getInguagensUsadas()+ "\n";
		
		return modelo;
	}
	
}
