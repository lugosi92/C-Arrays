package TEMA_4;

import java.util.Arrays;

public class Crear_Arrays {
public static void main(String[] args) {
	
	int arrayA[]=new int [300];//Se crea la tabla de numeros enteros y se define la longitud
	double arrayB[]=new double [50];//Se crea la tabla y se define la cantidad de elementos
	
	//Hacer una tabla con los valores ya dados
	int arrayEnteros[]= {5, 6, 10, 200,6};//Se crea la tabla y se le da valores a las celdas
	System.out.println(arrayEnteros);//Se imprime la dirección de memoria donde está la tabla
	System.out.println(arrayEnteros[3]);//Se hace referencia al elemento de la casilla 4 que es 200
	arrayEnteros[2]=11;//para cambiar el valor de la celda 2
	
	//Imprimir valores de la tabla
	System.out.println(arrayEnteros[0]);
	System.out.println(arrayEnteros[1]);
	System.out.println(arrayEnteros[2]);
	System.out.println(arrayEnteros[3]);
	
	//Saber la longitud de una tabla
	int longitud;//Se define la variable para guardar el tamaño del array
	int indiceUltimoElemento;
	longitud=arrayEnteros.length;
	System.out.println(longitud);//Imprimir longitud de la tabla
	indiceUltimoElemento=arrayEnteros.length-1;//Saber el indice del ultimo elemento
	System.out.println(indiceUltimoElemento);//Imprimir indice del último elemento
	
	
	//Imprimir una tabla entera, se convierte la i en el indice de las casillas del array
	for(int i=0; i<=arrayEnteros.length-1; i++) {
		System.out.println(arrayEnteros[i]);
	}
	
	//Imprimir la tabla en el orden inverso
	for(int i=arrayEnteros.length-1; i>=0; i--) {
		System.out.println(arrayEnteros[i]);
	}
	
	//Imprimir la tabla con los números en línea 
	System.out.println(Arrays.toString(arrayEnteros));
	
	//Rellenar tabla con valores
	
	
	//Rellenar la tabla con otro valor
	Arrays.fill(arrayEnteros, 10);//Se cambian todos los valores de la tabla a 10
	Arrays.fill(arrayEnteros, 2, 4, 10);//Esto es para cambiar los numeros de las casillas que están entre 2 y 4 con el valor 10
	System.out.println(Arrays.toString(arrayEnteros));
	
	//Forma de llenar una tabla con números pares
	for(int i=0; i<arrayEnteros.length; i++) {
	//	arrayEnteros.length[i]=2*i;
	}
	
	//Rellenar una tabla con el valor del índice
	for(int i=0; i<arrayEnteros.length; i++) {
	//	arrayEnteros.length[i]=i;
	}
	
	//Ordenar tabla
	Arrays.sort(arrayEnteros);
	System.out.println(Arrays.toString(arrayEnteros));
	
}
}
