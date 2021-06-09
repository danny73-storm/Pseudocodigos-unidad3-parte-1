import java.util.*;

public class Ejercicio8{
	public static void main (String[] args){
		
		int num1,num2,num3;
		Scanner leer = new Scanner(System.in);

		//pedir el primer numero  
		System.out.println("Ingrese el primer  numero: ");
		num1 = leer.nextInt();

		//pedir el segundo numero  
		System.out.println("Ingrese el segundo numero  numero: ");
		num2 = leer.nextInt();

		//pedir el tercer numero  
		System.out.println("Ingrese el tercer numero  numero: ");
		num3 = leer.nextInt();


		System.out.println("El promedio de numero ingresado  es: " + ((num1 + num2 + num3)/3));

	}
}