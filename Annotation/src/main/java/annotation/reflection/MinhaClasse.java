package annotation.reflection;

public class MinhaClasse {

	@Executar(arg = "A")
	//@Executar("A") //podemos omitir o value por padrão
	public void m1(String params) {
		System.out.println("m1() : " + params);
	}

	@Executar(arg = "B")
	//@Executar("B") //podemos omitir o value por padrão
	public void m2(String params) {
		System.out.println("m2() : " + params);
	}

	public void m3(String params) {
		System.out.println("m3() : " + params);
	}
}
