package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static double media(int a,int b) {
		return (a+b)/2;
	}
	
	public static double media(int a,int b, int c) {
		return (a+b+c)/3;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Introduzca tres numeros");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println(media(a, b));
		System.out.println(media(a, b, c));
		
	}

}
