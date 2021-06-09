import java.util.*;

public class Ejercicio10{
	public static void main (String[] args){
		
		int num1,num2;
		Scanner leer = new Scanner(System.in);

		//pedir el primer numero  
		System.out.println("\nIngrese el primer  numero: ");
		num1 = leer.nextInt();

		//pedir el segundo numero  
		System.out.println("Ingrese el segundo numero: ");
		num2 = leer.nextInt();

		//calcular el perimetro

		int perimetro = (2*num1) + (2*num2);

		//calcular area

		int area = num1 * num2;



		System.out.println("\n El perimetro del rectangulo es: " + perimetro + "u ");
		System.out.println("El area del rectangulo es: " + area + " u^2 ");

	}
}