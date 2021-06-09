import java.util.*;

public class Ejercicio14{
	public static void main (String[] args){
		
		int num1,num2;
		Scanner leer = new Scanner(System.in);

		//pedir el primer numero  
		System.out.println("\nIngrese el primer  numero: ");
		num1 = leer.nextInt();

		//pedir el segundo numero  
		System.out.println("Ingrese el segundo numero: ");
		num2 = leer.nextInt();

		

		//Calculamos is es divisible con if-else

		if (num1 % num2 == 0) {
			System.out.println("Es divisible");
			
		}else{
			System.out.println("No es divisible");
		}
	}
}