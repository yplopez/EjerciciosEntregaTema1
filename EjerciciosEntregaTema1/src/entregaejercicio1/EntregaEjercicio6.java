package entregaejercicio1;

import java.util.Scanner;

public class EntregaEjercicio6 {

	public static void main(String[] args) {
		// Declaro variable de número.
		int num;
		
		//Declaro variables en las que voy a transformar el número.
		int hora, minuto, segundo;
		
		//creo el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Pido los segundos al usuario.
		System.out.println("Escribe los segundos: ");
		
		//Leo la cantidad escrita por teclado.
		num = sc.nextInt();
		
		//Creo formula para hallar horas.
		hora = num/3600;
		
		//Creo fórmula para hallar minutos.
		minuto = (num%3600)/60;
		
		//Creo fórmula para hallar segundos.		
		segundo = (num%3600)%60;
		
		//Muestro en pantalla el número transformado en horas, minutos y segundos.
		System.out.println("Los segundos corresponden a: " + hora + " hora(s), " + minuto + " minutos y " + segundo + " segundos.");
		
		//cierro el Scanner.
		sc.close();
		
		

	}

}
