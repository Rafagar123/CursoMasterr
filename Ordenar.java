package com.ejercicios.funciones;

public class Ordenar {
	
	
	static void ordenar(int array[]) {
		int min;
		
		for (int i=0;i<array.length;i++) {

			for (int j=0; j<array.length; j++) {
				if (array[i]>array[j]) {
					min=array[j];
					array[j]=array[i];
					array[i]=min;
				}
			}		
		}
		
			
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
