package innerClassRegular;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.setValor1(30);
		calc.setValor2(70);
		int resultado = calc.somar();
		
		System.out.println(resultado);
	}

}
