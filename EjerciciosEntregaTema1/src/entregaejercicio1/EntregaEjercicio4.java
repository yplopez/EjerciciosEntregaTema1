package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio4 {

	public static void main(String[] args) {
		// Declaro variable base
		float base;
		
		// Declaro variable altura
		float altura;
		
		// Creo el scanner
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario que ingrese la base
		System.out.println("Ingresa la base: ");
		
		//Leo la cantidad digitada en teclado
		base = sc.nextFloat();
		
		// Pido al usuario que ingrese la altura
		System.out.println("Ingresa la altura: ");
				
		//Leo la cantidad digitada en teclado
		altura = sc.nextFloat();
		
		//Muestro el área del triángulo
		System.out.println("El área del triangulo es : " + (base*altura)/2);
		
		//Cierro el Scanner
		sc.close();
			
		

	}

}
