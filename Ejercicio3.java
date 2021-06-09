import java.util.*;

public class Ejercicio3{
	public static void main (String[] args){
		
		int num;
		Scanner s = new Scanner(System.in);

		//pedir el numero a aumentar 
		System.out.println("Ingrese el numero que se desea aumentar: ");
		num = s.nextInt();

		System.out.println("El doble de " + num + "es: " +(2*num));
		System.out.println("El triple de " + num + "es: " +(3*num));

	}
}