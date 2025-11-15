package com.ejercicios.funciones;
import java.util.Random;
import java.util.Scanner;

public class MaquinaTragaperras {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int credito;
		char quiereJugar;
		boolean seguirJugando=true;
		
		System.out.println("¿Con cuánto crédito desea jugar?");
		credito=scanner.nextInt();
		
		while (credito>=5&&seguirJugando) {
				System.out.println("Buena suerte!");
				credito=credito-5;
				credito= sumarCredito(credito, accionTirar(random));

				System.out.println("Su crédito final es de " + credito + " puntos" );
				System.out.println("¿Desea jugar? Marque 's' para sí, o 'n' para no: ");
				quiereJugar=scanner.next().charAt(0);
				if(quiereJugar=='s') {
					seguirJugando=true;
				}else {
					System.out.println("Hasta la próxima!");
					seguirJugando=false;
				}
				
				
				
				
			}
	
	scanner.close();
	}//FINAL DEL MAIN

	public static int accionTirar(Random random) {
		char[] rueda1 = {'$', '7', 'X'};
		char[] rueda2 = {'$', '7', 'X'};
		char[] rueda3 = {'$', '7', 'X'};
		int suerte[]=new int[3];
		
		for(int i=0; i<suerte.length; i++) {
			suerte[i]=random.nextInt(suerte.length);
		}
		
		System.out.println("|"+rueda1[suerte[0]]+"|"+rueda2[suerte[1]]+"|"+rueda1[suerte[2]]+"|");
		 if(rueda1[suerte[0]]=='$'&& rueda2[suerte[1]]=='$'&& rueda3[suerte[2]]=='$') {
			return 0;
		 }else if(rueda1[suerte[0]]=='7'&& rueda2[suerte[1]]=='7'&& rueda3[suerte[2]]=='7') {
			return 1;
		 }else if(rueda1[suerte[0]]=='X'&& rueda2[suerte[1]]=='X'&& rueda3[suerte[2]]=='X') {
			return 2;
		 }else { return 3;}
	}
	
	public static int sumarCredito(int credito, int t) {
		
		if(t==0) {
			return credito+100;
		}else if(t==1) {
			return credito*2;
		}else if(t==2) {
			return 0;
		}else {
			return credito;
		}
	}
	
	
	
}
