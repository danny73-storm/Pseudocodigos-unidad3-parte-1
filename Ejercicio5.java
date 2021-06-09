import java.util.*;

public class Ejercicio5{
	public static void main (String[] args){
		
		int num;
		Scanner s = new Scanner(System.in);

		//pedir el numero a aumentar 
		System.out.println("Ingrese el numero: ");
		num = s.nextInt();

		System.out.println("El numero que sigue a " + num + " es: " + (num + 1 ));

	}
}