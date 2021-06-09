import java.util.*;

public class Ejercicio18{
	public static void main (String[] args){
		
		int numero;
		Scanner leer = new Scanner(System.in);

		//pedir el numero 
		System.out.println("Ingrese el valor maximo de 4 digitos: ");
		numero = leer.nextInt();

		if (numero<0) {
			numero = numero*(-1);			
		}
		if (numero>-999 & numero<9999) {
			double num1 = numero - Math.floor(numero*0.1)*10;
			int num1c = (int)num1;
			double num2 = num1c -Math.floor(numero*0.1)*10 + numero;
			int num2c = (int)num2;
			double num3 =numero -Math.floor(numero*0.0001)*0.0001;
			int num3c =(int)num3;
			double num4 = Math.floor(numero*0.1);
			int num4c = (int)num4;

			int suma = num1c + num2c + num3c +num4c;
			System.out.println(" d1= "+ num1c + " d2= " + num2c + " d3= " + num3c + " d4= " + num4c + "  Suma= " + suma);
		}else{
			System.out.println("El numero ingresado debe de maximo 4 digitos");
		}
	}
}