package com.ejercicios.funciones;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		leeArray(llenaArray(creaArray(tamanoArray(scanner), scanner), scanner));
			
	}
	

	public static int tamanoArray(Scanner scanner) {
		int num;
		System.out.println("Dime el tamaño: ");
		num=scanner.nextInt();
		return num;
	}

	public static int [] creaArray (int longitud, Scanner scanner) {
		int[] array= new int [longitud];
		return array;
	}
		
	public static int [] llenaArray(int [] array, Scanner scanner) {	
		for (int i=0;i<array.length;i++) {
			System.out.println("Indique el elemento: ");
			array[i]=scanner.nextInt();
		}
		scanner.close();
		return array;	
	}
		
	public static void leeArray(int [] array) {
		System.out.println("TE LEO EL ARRAY: ");
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

	


}
