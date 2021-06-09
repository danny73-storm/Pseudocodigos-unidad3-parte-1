import java.util.*;

public class Ejercicio12{
	public static void main (String[] args){
		
		int num1;
		double fara;
		Scanner leer = new Scanner(System.in);

		//pedir el valor que se quiere convertir 
		System.out.println("\n\n Ingrese el valor de la temperatura: ");
		num1 = leer.nextInt();
		System.out.println("\n el valor "+ num1 + " °C equivale a: ");
		System.out.println("=======================================");

		//comvertir °C--> °F
		fara = (num1*(1.8)) + 32;

		System.out.println("\n ---> " + fara + " °F" );

	}
}