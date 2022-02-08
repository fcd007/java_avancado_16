package br.com.javacode.innerclass.main;

public class Main {

	public static void main(String[] args) {
		
		Bebida b1 = new Cha();
		
		Bebida b2 = new Bebida() {
			
			@Override
			public void preprarar() {
				System.out.println("Preparando bebida não identificada");
				
			}
		};
		
		b1.preprarar();
		b2.preprarar();
		
//		List<Pessoas> pessoas = new ArrayList<Pessoas>();
//		
//		pessoas.add(new Pessoas(1L, "Claudeilton", "002.999.999-99"));
//		pessoas.add(new Pessoas(2L, "Juliana", "006.999.999-99"));
//		pessoas.add(new Pessoas(3L, "Paula", "009.999.999-99"));
//		
//		//exibindo utilizando method references
//		pessoas.forEach(System.out::println);
//		//removendo elementos com uso de removeif e expressão lambdas
//		pessoas.removeIf(p -> p.getNome().equalsIgnoreCase("Claudeilton"));
//		System.out.println("--------------------------------------------------");
//		//mostrando elementos após apagar o item da lista
//		pessoas.forEach(System.out::println);
	}

}
