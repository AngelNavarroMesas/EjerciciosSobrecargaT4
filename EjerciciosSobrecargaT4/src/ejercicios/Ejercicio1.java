package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static double suma(double da, double db) {
		return da+db;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double da, db;
		
		System.out.println("Introduzca dos numeros");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Introduzca otros dos numeros");
		da = sc.nextInt();
		db = sc.nextInt();
		
		System.out.println(suma(a, b));
		System.out.println(suma(da, db));
		
		
	}

}
