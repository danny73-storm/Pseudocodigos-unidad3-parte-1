import java.util.*;

public class Ejercicio11{
	public static void main (String[] args){
		
		int num1;
		double yardas,metros,pies,pulgadas;
		Scanner leer = new Scanner(System.in);

		//pedir el valor que se quiere convertir 
		System.out.println("\n\n Ingrese el valor de que se quiere convertir: ");
		num1 = leer.nextInt();
		System.out.println("\n el valor "+ num1 + " cm equivale a: ");
		System.out.println("=======================================");

		//comvertir cm --> yardas
		yardas = num1*(1.09361/100);

		//comvertir cm --> metros
		metros = num1*(1.00/100);

		//comvertir cm --> ft (pies)
		pies = num1*(1.00/100)*(1.00/0.3048);


		//comvertir cm --> in (pulgadas)
		pulgadas = num1*(1.00/100)*(1.00/0.0254);

		System.out.println("\n---> " + yardas + " yardas " );
		System.out.println("---> " + metros + " mts" );
		System.out.println("---> " + pies + " ft (Pies) " );
		System.out.println("---> " + pulgadas + " in (Pulgadas)" );

	}
}