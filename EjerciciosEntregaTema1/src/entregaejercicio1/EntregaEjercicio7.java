package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio7 {

	public static void main(String[] args) {
		// Declaro variable distancia en milimetros
		int milimetros;
		
		// Declaro variable distancia en centímetros
		int centimetros;
				
		// Declaro variable distancia en metros
		int metros;
		
		//Declaro variable para el total de centimetros;
		int totalcentimetros;
		
		//Creo el Scanner
		Scanner sc = new Scanner (System.in);
		
		//Pido distancia en milímetros
		System.out.println("Escribe el valor de la distancia en milímetros");
		
		//Leo la cantidad digitada
		milimetros = sc.nextInt();
		
		//Pido distancia en centímetros
		System.out.println("Escribe el valor de la distancia en centímetros");
		
		//Leo la cantidad digitada
		centimetros = sc.nextInt();
		
		//Pido distancia en metros
		System.out.println("Escribe el valor de la distancia en metros");
		
		//Leo la cantidad digitada
		metros = sc.nextInt();
		
		//Creo operación matemática
		totalcentimetros=(milimetros/10) + centimetros + (metros*100);
		
		//Doy el resultado esperado		
		System.out.println("La longitud total corresponde a: " + totalcentimetros + " centímetros.");		
		
		//Cierro el Scanner
		System.out.println();
		

	}

}
