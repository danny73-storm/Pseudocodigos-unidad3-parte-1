import java.util.*;

public class Ejercicio4{
	public static void main (String[] args){
		
		int num;
		Scanner s = new Scanner(System.in);

		//pedir el numero a aumentar 
		System.out.println("Ingrese el numero que se desea obtener sus potencias respectivas: ");
		num = s.nextInt();

		System.out.println("El cuadrado de " + num + "es: " + (num*num));
		System.out.println("El cubo  de " + num + "es: " + (num*num*num));

	}
}