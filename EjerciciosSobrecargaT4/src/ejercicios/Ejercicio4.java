package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static boolean parseToBoolean(String cadena) {
		
		boolean binario = false;
		
		if(cadena.equals("false")) {
			binario=false;
		}else if(cadena.equals("true")) {
			binario=true;
		}
		
		return binario;
	}
	
	public static boolean parseToBoolean(int num) {
		
		boolean binario = false;
		
		if(num==0) {
			binario=false;
		}else if(num==1) {
			binario=true;
		}
		
		return binario;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String cadena;
		
		System.out.println("Elija 1 o 0");
		num = sc.nextInt();
		
		System.out.println("Escriba true o false");
		cadena = sc.next();
		
		System.out.println(parseToBoolean(num));
		System.out.println(parseToBoolean(cadena));
	}

}
