package entregaejercicio1;

import java.util.Locale;

import java.util.Scanner;

public class EntregaEjercicio1 {

	public static void main(String[] args) {
		// Declaro la variable del número 
		double numeroDecimal;
		
		// Declaro la variable del número entero
		int num;
		
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Establezco configuración regional del Scanner
		sc.useLocale(Locale.US);
		
		//Pido el número al usuario
		System.out.println("Escribe un número con decimal: ");
		
		//Leo el número escrito en el teclado
		numeroDecimal=sc.nextDouble();
		
		//Hago uso del cast
		num = (int) numeroDecimal;
		
		//Imprimo en pantalla la parte entera del número
		System.out.println("La parte entera del tu número es: " + num);
		
		//Cierro el Scanner
		sc.close();

	}

}
