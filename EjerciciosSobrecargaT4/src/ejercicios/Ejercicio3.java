package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static int sumaEnteros(int num1) {
		
		int suma=0;
		
		for(int i=0;i<num1;i++) {
			suma+=i;
		}
		
		return suma;
	}
	
	public static int sumaEnteros(int num1, int num2) {
		
		int suma=0;
		
		for(int i=num1;i<num2;i++) {
			suma+=i;
		}
		for(int i=num2;i<num1;i++) {
			suma+=i;
		}
		
		return suma;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(sumaEnteros(num1));
		System.out.println(sumaEnteros(num1, num2));
		
	}

}
