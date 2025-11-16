package com.ejercicios.funciones;


import java.util.Scanner;

public class MiTresEnRaya {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char [][] matriz = new char [3][3];
		final char fichax='X';
		final char fichao='O';
		boolean pasaTurno=true;
		boolean seJuega=true;
		boolean sePuede=false;
		int fila=0;
		int columna=0;
		
		
	while(seJuega) {
	
	if(pasaTurno) { 
		System.out.println("___Turno de las X___");
		
		while(!sePuede) {
				System.out.println("Introduce la fila: ");
				fila=scanner.nextInt();
				System.out.println("Introduce la columna: ");
				columna=scanner.nextInt();
				sePuede=compruebaPosicion(matriz, fila, columna, sePuede);
				
		}
			
		introduceFicha(matriz, fila, columna, fichax);
		seJuega=compruebaTablero(matriz, seJuega, fichax);
		pasaTurno=false;
		
	}else {
		System.out.println("___Turno de las O___");
		
		while(!sePuede) {
			System.out.println("Introduce la fila: ");
			fila=scanner.nextInt();
			System.out.println("Introduce la columna: ");
			columna=scanner.nextInt();
			sePuede=compruebaPosicion(matriz, fila, columna, sePuede);
		}
	
		
		introduceFicha(matriz, fila, columna, fichao);
		seJuega=compruebaTablero(matriz, seJuega, fichao);
		pasaTurno=true;
	}
	sePuede=false;
	}
	
	scanner.close();
	
	}//ACABA MAIN
	
	//FUNCIONES
	
public static void imprimeMatriz(char[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
				System.out.print("|"+ matriz[i][j] + "|");
			}
			System.out.println();	
		}	
}

	
public static boolean compruebaPosicion(char[][] matriz, int fila, int columna, boolean sePuede) {
		if(fila<3&&fila>=0&&columna<3&&columna>=0&&matriz[fila][columna]!='X'&& matriz[fila][columna]!='O') {
			return sePuede=true;
			
		}else {
			System.out.println("No se puede poner una ficha en esta posición. Pruebe otra vez");
			return sePuede=false;
		}
}
	

public static void introduceFicha(char[][] matriz, int fila, int columna, char ficha) {
		matriz[fila][columna] = ficha;
		imprimeMatriz(matriz);
}
	
public static boolean compruebaTablero(char[][]matriz, boolean seJuega, char ficha){
		int espacioLibre=0;
		seJuega=true; 
		
		for(int i=0;i<matriz.length;i++) {
			if (matriz[i][0]==matriz[i][1]&&matriz[i][1]==matriz[i][2]&&matriz[i][2]==ficha) {
				System.out.println("Hay línea horizontal!");
				System.out.println("Has ganado jugador "+ficha+"!");
				seJuega=false;
			}	
		}
		
		for(int j=0;j<matriz.length;j++) {
			if (matriz[0][j]==matriz[1][j]&&matriz[1][j]==matriz[2][j]&&matriz[2][j]==ficha) {
				System.out.println("Hay línea vertical");
				System.out.println("Has ganado jugador "+ficha+"!");
				seJuega=false;
			}	
		}
		
		if((matriz[0][0]==matriz[1][1]&&matriz[1][1]==matriz[2][2]&&matriz[2][2]==ficha)||(matriz[2][0]==matriz[1][1]&&matriz[1][1]==matriz[0][2]&&matriz[0][2]==ficha)) {
			System.out.println("Hay línea vertical");
			System.out.println("Has ganado jugador "+ficha+"!");
			seJuega=false;
		}
		
		
		for(int i=0;i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
				if (matriz[i][j]!='X'&& matriz[i][j]!='O') {
					espacioLibre++;
				}
			}	
		}
		
		if(espacioLibre==0) {
			System.out.println("Se ha llegado a un empate");
			seJuega=false;
		}
		
		return seJuega;
	
}
	
	
	
	
	
	
	
	//ACABA FUNCIONES
}
