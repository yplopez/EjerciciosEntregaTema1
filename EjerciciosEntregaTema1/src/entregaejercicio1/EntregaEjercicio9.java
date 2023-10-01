package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio9 {

	public static void main(String[] args) {
		
		// Declaro variable número 1
		int num1;
		
		// Declaro variable número 2
		int num2;
		
		//Creo el Scanner
		Scanner sc = new Scanner (System.in);
		
		//Pido número 1
		System.out.println("Digita dos numeros:");
		
		//Leo los números ingresados
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//Muestro si son iguales o no los números
		System.out.println(num1==num2);
		
		//Cierro el Scanner
		sc.close();
		

	}

}
