package com.ejercicios.funciones;

import java.util.Scanner;

public class CrearTablero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int filas, columnas;
		
		System.out.println("Introduzca el número de filas: ");
		filas =pideNumero(scanner);
		System.out.println("Introduzca el número de columnas: ");
		columnas=pideNumero(scanner);
		scanner.close();
		
		imprimeTablero(creaTablero(filas, columnas));
		
		
		
		
	}
	
	
public static int pideNumero(Scanner scanner) {
	int num=0;
	boolean numcorrecto=true;
	
	do {
		try {
			num=scanner.nextInt();
			numcorrecto=true;
		}catch(Exception e) {
			System.out.println("Valor introducido incorrecto. Vuelva a probar: ");
			numcorrecto=false;
			scanner.next();
		}	
	}while(!numcorrecto);
	
	return num;
}
	

public static char[][] creaTablero(int fila, int columna){
	char[][] tablero=new char[fila][columna];
	for (int i=0; i<tablero.length; i++) {
		for(int j=0; j<tablero[i].length; j++) {
			if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0) {
				tablero[i][j]='X';
			}else if(i%2==0 && j%2!=0 || i%2!=0 && j%2==0) {
				tablero[i][j]='O';
			}
				
		}	
	}
	
	return tablero;
	}

public static void imprimeTablero(char[][] tablero) {
	for (int i=0;i<tablero.length;i++) {
		for(int j=0; j<tablero[i].length;j++) {
			System.out.print(tablero[i][j] + " | ");
		}
		System.out.println();
	}
	







}
	
	
	
	
	

}
