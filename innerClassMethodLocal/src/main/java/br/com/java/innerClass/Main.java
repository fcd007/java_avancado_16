package br.com.java.innerClass;

public class Main {

	public static void main(String[] args) {

		final String t2 = "Variavel do método";
		
		class Texto {
			private String texto;

			public Texto(String str) {
				this.texto = str;
			}

			public void imprimir() {
				System.out.println(texto);
			}
			
			public void imprimir2() {
				System.out.println(t2);
			}
		}

		Texto txt = new Texto("Codificar é legal!");
		txt.imprimir();
		txt.imprimir2();
		//fora do método
		//m();
	}
	
	public static void m() {
		System.out.println("Fora do método");
	}
}
