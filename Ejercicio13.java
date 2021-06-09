import java.util.*;

public class Ejercicio13{
	public static void main (String[] args){
		
		double radio,altura;
		Scanner leer = new Scanner(System.in);

		//pedir el primer numero  
		System.out.println("\nIngrese el valor del radio: ");
		radio = leer.nextInt();

		//pedir el segundo numero  
		System.out.println("Ingrese el valor de la alura: ");
		altura = leer.nextInt();

		if (radio>0) {
			double pi=3.1416;
			double volumen;

			if (altura >0) {
				volumen = pi*(Math.pow(radio,2))*altura;
				System.out.println("El volumen del cilindro es: " + volumen + " u^3" );
				
			}else{
				System.out.println("La altura ingresa no es valida");
				System.out.println("debe ser un valor positivo");				
			}				
		}else{
			System.out.println("El radio ingresado no es POSITIVO");
				System.out.println("debe ser un valor POSITIVO");
		}
	}
}