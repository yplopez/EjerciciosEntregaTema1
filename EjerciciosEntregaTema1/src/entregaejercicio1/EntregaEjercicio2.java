package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio2 {

	public static void main(String[] args) {
		// Declaro constante que comprueba que el número es múltiplo de 7
		final int multiplo=7;
		
		// Declaro la variable del número
		int num;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido un número al usuario
		System.out.println("Escribe un número: ");
		
		//Leo el número digitado
		num = sc.nextInt();
		
		//Informo si el número es múltiplo de 7 o no
		System.out.println(num%multiplo==0?"El número es múltiplo de 7.": "Sumale " + ((((num/multiplo)*7)+7)-num) + " a tu número");
		
		//Cierro el scanner
		sc.close();

	}

}
