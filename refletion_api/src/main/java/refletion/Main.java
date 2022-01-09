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
		
		Method[] methods = tvClass.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName() + ", " + method.getReturnType() + Arrays.toString(method.getParameters()));
		}
	}
}
