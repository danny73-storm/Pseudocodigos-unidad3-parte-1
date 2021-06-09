import java.util.*;

public class Ejercicio1{
	public static void main (String[] args){
		
		int num1,num2;
		Scanner s = new Scanner(System.in);

		//pedir el primer numero
		System.out.println("Ingrese el primer numero: ");
		num1 = s.nextInt();
		//pedir el segundo numero
		System.out.println("Ingrese el segundo numero: ");
		num2 = s.nextInt();

		System.out.println("La suma es: "+ (num1+num2));

	}
}