package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void numerosAleatorios(int num1) {
		
		double numA=0;
		
		for(int i=0;i<num1;i++) {
			numA=Math.random();
			System.out.println(numA);
		}
	}
	
	public static void numerosAleatorios(int num1, int num2) {
		
		int numA=0;
		
		for(int i=0;i<num1;i++) {
			numA=(int) (Math.random()*num2+1);
			System.out.println(numA);
		}
	}
	
	public static void numerosAleatorios(int num1, int num2, int num3) {
		
		int numA=0;
		
		for(int i=0;i<num1;i++) {
			do
			numA=(int) (Math.random()*num3+1);
			while(numA<num2);
			System.out.println(numA);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Introduzca tres numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println(num1+" numeros aleatorios entre 0 y 1");
		numerosAleatorios(num1);
		System.out.println(num1+" numeros comprendidos entre 0 y "+num2);
		numerosAleatorios(num1, num2);
		System.out.println(num1+" numeros comprendidos entre "+num2+" y "+num3);
		numerosAleatorios(num1, num2, num3);
	}

}
