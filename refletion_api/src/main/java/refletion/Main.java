package refletion;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		
		Class<Televisao> tvClass = Televisao.class;
		
		Field[] fields = tvClass.getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println(field.getName() + " => " + field.getType());
		}
		
		System.out.println();
		
		Method[] methods = tvClass.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameters()));
		}
		
		System.out.println();
		//chamada de método através da refletion API
		Televisao tv1 = new Televisao();
		int canal = 25;
		Method  mudarCanal = tvClass.getDeclaredMethod("mudarCanal", int.class);
		mudarCanal.invoke(tv1, canal);
		
		// fazer outra chamada da API
		Televisao tv2 = new Televisao();
		Method ligar = tvClass.getMethod("ligar");
		ligar.invoke(tv2);
	}
}
