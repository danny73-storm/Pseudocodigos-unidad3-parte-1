import java.util.*;

public class Ejercicio16{
	public static void main (String[] args){
		
		int num1,num2,num3;
		Scanner leer = new Scanner(System.in);

		//pedir el numero a aumentar 
		System.out.println("Ingrese las 3 cantidades: ");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();

		if (num1>num2) {
			if (num1>num3) {
				System.out.println("El numero mayor de los 3 es: "+ num1);
				
			}else{
				System.out.println("El numero mayor de los 3 es: "+ num3);
			}
			
		}else if (num2 > num3) {
			System.out.println("El numero mayor de los 3 es: "+ num2);
			
		}else{
			System.out.println("El numero mayor de los 3 es: "+ num3);
		}

	}
}