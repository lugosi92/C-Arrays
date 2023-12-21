package TEMA_4;

import java.util.Iterator;
import java.util.Random;

public class Ejercicio_4_3_randmo_mostar_suma {

	public static void main(String[] args) {
		// Crea una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre
		//1 y 100. Mostrar la suma de todos los números aleatorios que se han guardado en la tabla.

		// Crea una tabla de longitud 10
		int tabla[]=new int[10];
	
		//Inicializa con números aleatorios comprendidos entre 1 y 100.
		Random rand = new Random();
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rand.nextInt(100)+1;
		}
		
		
		//Mostrar la suma de todos los números aleatorios que se han guardado en la tabla
		  int suma = 0;
	        for (int num : tabla) {
	            suma += num;
	        }
	        System.out.println("La suma de los números en la tabla es: " + suma);
	}

}
