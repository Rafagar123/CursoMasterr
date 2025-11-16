package com.ejercicios.funciones;

import java.util.Random;
import java.util.Scanner;

public class MiPokemon {
public static void main(String[] args) {
		
		//CREAR VARIABLES
		String [] pkNombres = {"Charmander", "Squirtle", "Bulbasaur"};
		String [] pkTipos = {"Fuego", "Agua", "Planta"};
		int [] pkHp = {100,100,100};
		int [] pkDmg = {12,10,5};
		final int MULTIPLICADOR = 2;
		int totalDaño = 0;
		int pokemonJugador = 0;
		int pokemonCpu = 0;
		boolean turnoJugador = true;
		Random random = new Random();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escoge tu pokemon ");
		System.out.println("0 Charmander");
		System.out.println("1 Squirtle ");
		System.out.println("2 Bulbasaur");
		
		pokemonJugador = sc.nextInt();
		pokemonCpu = random.nextInt(pkNombres.length);
		
		System.out.println( pkNombres[pokemonJugador] +" VS " + pkNombres[pokemonCpu] );
		
		while(pkHp[pokemonJugador] > 0 && pkHp[pokemonCpu] > 0) {
			//ATACAMOS NOSOTROS
			if (turnoJugador) {
				totalDaño = ataque(pkTipos, pkHp, pkDmg, totalDaño, pokemonJugador, pokemonCpu, turnoJugador);
				turnoJugador = false;
			} else {
				totalDaño = ataque(pkTipos, pkHp, pkDmg, totalDaño, pokemonCpu, pokemonJugador, turnoJugador);
				turnoJugador = true;
			}
			
			
		}
		
	
		

	}


	public static int ataque(String[] pkTipos, int[] pkHp, int[] pkDmg, int totalDaño, int pokemonJugador,
			int pokemonCpu, boolean turnoJugador) {
		if(pkHp[pokemonCpu] > 0) {
			System.out.print("El pokemon va a hacer: ");
			totalDaño = calcularDaño(pkDmg, pkTipos, pokemonJugador, pokemonCpu, totalDaño);
			System.out.println(totalDaño);
			calcularVida(pokemonCpu, totalDaño, pkHp);
			if (turnoJugador) {
				System.out.print("Al pokemon cpu le queda ");
			} else {
				System.out.print("Al pokemon jugador le queda ");
			}
			System.out.println(pkHp[pokemonCpu] + " vida");
		}
		return totalDaño;
	}
	
	
	public static void calcularVida (int pokemon, int totalDaño, int[] pkHp ) {
		pkHp[pokemon] = pkHp[pokemon] - totalDaño;
	}
	
	
	public static int calcularDaño (int[] pkDmg,String [] pkTipos, int pokemon1, 
			int pokemon2, int totalDaño) {
		
		totalDaño = pkDmg[pokemon1];
		
		if((pkTipos[pokemon1] == "Fuego" && pkTipos[pokemon2] == "Planta") || 
				(pkTipos[pokemon1] == "Planta" && pkTipos[pokemon2] == "Agua")||
				(pkTipos[pokemon1] == "Agua" && pkTipos[pokemon2] == "Fuego")) {
			
			totalDaño = pkDmg[pokemon1]*2;
		}
		return totalDaño;
	}
	
	

}
	
