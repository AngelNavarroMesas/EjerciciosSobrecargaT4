package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

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
		
		System.out.println("");
		
	}

}
