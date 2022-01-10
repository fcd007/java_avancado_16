package annotation.reflection;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception{
		MinhaClasse mc = new MinhaClasse();
		
		executar(mc);
	}
	
	private static void executar(MinhaClasse mc) throws Exception{
		@SuppressWarnings("unchecked")
		Class<MinhaClasse> c = (Class<MinhaClasse>) mc.getClass();
		
		Method[] methods = c.getDeclaredMethods();
		
		for (Method method : methods) {
			Executar annotation= method.getDeclaredAnnotation(Executar.class);
			
			if(annotation != null) {
				String argumento = annotation.arg();
				method.invoke(mc, argumento);
			}
		}
	}
}
