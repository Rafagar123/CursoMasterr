package com.ejercicios.funciones;

import java.util.Scanner;

public class EsEntero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entero=0;
		
		
		
		System.out.println("Introduce un entero (-1 para salir)");
		 
		while (entero!=-1) {
			try {
				entero=scanner.nextInt();
				System.out.println("era un entero");
			}catch(Exception e) {
				System.out.println("No es un entero");
				scanner.next();
			}finally {
				scanner.close();
				System.out.println("Esto ya está");
			}
		
		}
		
		System.out.println(entero);

		
		
		
		
		
		
		
	}

}
