package TEMA_4;

public class Ejercicio_4_2 {

	public static void main(String[] args) {
		// Construye una tabla de 10 elementos del tipo que quieras. Declara tres variables de tabla que
		//referencian a la tabla creada. Comprueba, imprimiendo por pantalla, que todas las variables
		//contienen la misma referencia.
		
		double tabla[]= new double[10];
		
		//declarar variables
		double t1[]=tabla;
		double t2[]=tabla;
		double t3[]=tabla;
	
	    
	    System.out.println(tabla);
	    System.out.println(t1);
	    System.out.println(t2);
	    System.out.println(t3);
	    
	    
	}

}
