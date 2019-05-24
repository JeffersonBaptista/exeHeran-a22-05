package com.br.exe.heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppExeAula {

	public static void main(String[] args) {

//		List<String> listaLinguagem = new ArrayList<String>();
//		
//		listaLinguagem.add("Java");
//		listaLinguagem.add("C#");
//		listaLinguagem.add("C++");
//		listaLinguagem.add("JavaScript");
//		
//		listaLinguagem.sort(null);
//		
//		Programador programador = new Programador("jefferspm", "Baptista", 34, listaLinguagem, 15, false);
//		
//		System.out.println(programador);

		List<String> filmesParticipantes = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do ator");
		String nome = scan.nextLine();
		

		System.out.println("Digite o sobrenome do ator");
		String sobrenome = scan.nextLine();
		

		System.out.println("Digite o ano de nascimento");
		int ano = scan.nextInt();
		

		System.out.println("Digite a idade");
		int idade = scan.nextInt();
		

		System.out.println("O ator ja ganhou um oscar? \n(S) para sim (N) para não");
		String oscar = scan.next();
		
		
		
		boolean oscar2;

		if (oscar.equalsIgnoreCase("S")) {
			oscar2 = true;
		} else {
			oscar2 = false;
		}
		


		int verificador = 1;

		while (verificador == 1) {
			Scanner scanW = new Scanner(System.in);

			System.out.println("Digite o nome do filme participante: ");
			filmesParticipantes.add(scanW.nextLine());
			System.out.println("");

			System.out.println("Deseja indicar mais um filme com este ator? \n(Enter) patra sim, (N) para não");
			String verifi = scanW.nextLine();

			if (verifi.equalsIgnoreCase("N")) {
				verificador = 0;
			} else {
				System.out.println("Vamos la");
			}

		}

		Random sorteio = new Random();

		String melhor = filmesParticipantes.get(sorteio.nextInt(filmesParticipantes.size()));

		
		System.out.println("___________________________________________" + "\n");

		Ator ator = new Ator(nome, sobrenome, idade, filmesParticipantes, oscar2, ano, melhor);

		System.out.println(ator);
		System.out.println("___________________________________________" + "\n");
		
		scan.close();
			

	}

}
