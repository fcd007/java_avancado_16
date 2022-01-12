package br.com.javacode.reflection;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		//inicializar Objeto da classe Cafe e Cha
//		Cafe bebida0 = new Cafe();
//		Cha bebida1 = new Cha();
//		//chamada do método prepapar
//		bebida1.preparar();
		
		//vamos utilizar reflexao para instanciar Bebida
		//ler a classe
		String className;
		try (Scanner scanner = new Scanner(new File("class_name.txt"))){			
			className = scanner.nextLine();
		}
		
//		System.out.println(className);
		@SuppressWarnings("unchecked")
		Class<Bebida> bebidaClass = (Class<Bebida>) Class.forName(className);
		Bebida bebida = bebidaClass.getDeclaredConstructor().newInstance();
		bebida.preparar();
	}
}
