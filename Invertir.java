package com.ejercicios.funciones;

public class Invertir {

	static void invertirArray(double [] array) {
		
		
		double[] array2=new double[(array.length)];
		
		for (int i=0;i<array.length;i++) {
			array2[(array2.length-1-i)]=array[i];
			
		}
		
			
		for (int i=0;i<array.length;i++) {
			System.out.println(array2[i]);
		}
			
		
		
		
		
	}
	
	
	
	
	
}
