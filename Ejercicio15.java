import java.util.*;

public class Ejercicio15{
	public static void main (String[] args){
		
		int num;
		Scanner leer = new Scanner(System.in);

		//pedir el numero a aumentar 
		System.out.println("Ingrese el numero: ");
		num = leer.nextInt();

		if (num>0) {
			System.out.println("El numero ingresado es POSITIVO");
		}else if (num == 0) {
			System.out.println("El numero ingresao es NULO");
			
		}else{
			System.out.println("El numero ingresado es NEGATIVO");
		}

	}
}