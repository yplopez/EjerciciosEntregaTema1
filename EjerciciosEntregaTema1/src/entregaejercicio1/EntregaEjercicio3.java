package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio3 {

	public static void main(String[] args) {
		// // Declaro la variable del número
		int num1;
		
		// Declaro variable que comprueba que el número es múltiplo de 7
		int num2;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido un número al usuario
		System.out.println("Escribe un número: ");
		
		
		//Leo el número digitado
		num1 = sc.nextInt();
		
		//Pido un número al usuario
		System.out.println("Escribe otro número: ");
		
		
		//Leo el número digitado
		num2 = sc.nextInt();
		
		//Informo si el número es múltiplo de 7 o no
		System.out.println(num1%num2==0?"El primer número es multiplo del segundo.": "Sumale " + ((((num1/num2)*num2)+num2)-num1) + " al primer número para que sea multiplo del segundo.");
		
		//Cierro el scanner
		sc.close();

	}

}
