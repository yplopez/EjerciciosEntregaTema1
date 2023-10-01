package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio10 {

	public static void main(String[] args) {
		// Declaro variable de longitud
		double longitud;
		
		//Declaro la variable centímetros
		int centimetro;
		
		//Creo el Scanner
		Scanner sc = new Scanner (System.in);
		
		//Pido la longitud
		System.out.println("Digita la longitud alcanzada por tu papel, en metros: ");
		
		//Leo la cantidad digitada
		longitud = sc.nextDouble();
		
		//convierto el número recibido en centímetros y hago el cast
		centimetro = (int) (longitud*100);
		
		//Muestro el valor alcanzado en centímetros
		System.out.println("Tu papel ha alcanzado " + centimetro + " centímetros!");
		
		//Cierre del Scanner
		sc.close();
		
	}

}
