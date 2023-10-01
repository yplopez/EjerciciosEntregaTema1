package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio8 {

	public static void main(String[] args) {
		// Declaro constante tarifa infantil.
		final double tarifaNiño = 15.5;
		
		//Declaro constante tarifa adulto.
		final int tarifaAdulto = 20;
		
		//Declaro constante descuento.
		final double descuento = 5;
		
		//Declaro la variable entrada niño.
		int entradaNiño;
		
		//Declaro la variable entrda adulto.
		int entradaAdulto;
		
		//Declaro la variable del subtotal.
		double subtotal;
		
		//Declaro variable del total.
		double total;
		
		//Creo el Scanner.
		Scanner sc = new Scanner (System.in);
		
		//Pido al usuario que digite la cantidad de entradas infantil.
		System.out.println("Digite la cantidad de entradas infantiles: ");
		
		//Leo cantidad digitada.
		entradaNiño = sc.nextInt();
		
		//Pido al usuario que digite la cantidad de entradas de adulto.
		System.out.println("Digite la cantidad de entradas para adulto: ");
				
		//Leo cantidad digitada.
		entradaAdulto = sc.nextInt();
		
		//Hago cálculos matemático del subtotal.
		subtotal = (entradaNiño*tarifaNiño) + (entradaAdulto*tarifaAdulto);
		
		//Hago el calculo del valor total.
		total = subtotal >=100 ?subtotal-(subtotal*descuento)/100:subtotal;
		
		//Imprimo valor a pagar.
		System.out.println("El valor a pagar es: " + total + " €");
		
		//Cierro el Scanner
		sc.close();
		

	}

}
