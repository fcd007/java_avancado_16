package br.com.javacode.innerclass.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pessoas> pessoas = new ArrayList<Pessoas>();
		
		pessoas.add(new Pessoas(1L, "Claudeilton", "002.999.999-99"));
		pessoas.add(new Pessoas(2L, "Juliana", "006.999.999-99"));
		pessoas.add(new Pessoas(3L, "Paula", "009.999.999-99"));
		
		//exibindo utilizando method references
		pessoas.forEach(System.out::println);
		//removendo elementos com uso de removeif e expressão lambdas
		pessoas.removeIf(p -> p.getNome().equalsIgnoreCase("Claudeilton"));
		System.out.println("--------------------------------------------------");
		//mostrando elementos após apagar o item da lista
		pessoas.forEach(System.out::println);
	}

}
