package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio5 {

	public static void main(String[] args) {
		// Declaro variables de coeficientes
		float a, b, c, x;
		
		// Creo el scanner
		Scanner sc = new Scanner(System.in);
				
		// Pido al usuario que ingrese valor a
		System.out.println("Ingresa valor de a: ");
				
		//Leo la cantidad digitada en teclado
		a = sc.nextFloat();
		
		// Pido al usuario que ingrese valor b
		System.out.println("Ingresa valor de b: ");
						
		//Leo la cantidad digitada en teclado
		b = sc.nextFloat();
				
		// Pido al usuario que ingrese valor c
		System.out.println("Ingresa valor de c: ");
						
		//Leo la cantidad digitada en teclado
		c = sc.nextFloat();
		
		// Pido al usuario que ingrese valor x
		System.out.println("Ingresa valor de x: ");
								
		//Leo la cantidad digitada en teclado
		x = sc.nextFloat();
		
		//Doy el valor de Y
		System.out.println("El valor de y es: " + ((a*Math.pow(x, 2)) + (b*x) + c));
		
		//Cierro el Scanner
		sc.close();

				
	}

}
