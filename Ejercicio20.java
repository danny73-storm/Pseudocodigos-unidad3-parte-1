import java.util.*;

public class Ejercicio20{
	public static void main (String[] args){
		
		int numero;
		Scanner leer = new Scanner(System.in);

		//pedir el numero 
		System.out.println("Ingrese numero: ");
		numero = leer.nextInt();

		double c1,r1,c2,r2,c3,r3,c4,r4;
		c1 =(numero -(numero % 10000))*0.0001;
		r1 = numero % 10000;
		c2 = (r1 - (r1 % 1000))*0.001;
		r2 = r1 % 1000;
		c3 = (r2 - (r2 % 100))*0.01;
		r3 = r2 % 100;
		c4 = (r3 - (r3 % 10))*0.1;
		r4 = r3 % 10;

		if (numero == (r4*10000)+(r3*1000)+(r2*100)+(r2 *10)+c1) {
		System.out.println("Numero CAPICUO");			
		}else{
			System.out.println("Numero no CAPICUO");
		}
	}
}