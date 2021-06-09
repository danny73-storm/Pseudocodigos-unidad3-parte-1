import java.util.*;

public class Ejercicio9{
	public static void main (String[] args){
		
		String pal1,pal2,cambio;
		Scanner leer = new Scanner(System.in);

		//pedir la primera palabra
		System.out.println("Ingrese la primera palabra: ");
		pal1 = leer.nextLine();
		//pedir la segunda palabra 
		System.out.println("Ingrese la segunda palabra: ");
		pal2 = leer.nextLine();

        //Realizando intercambio de valores

		cambio = pal1;
		pal1 = pal2;
		pal2 = cambio; 

		System.out.println("La primera palabra es: "+ pal1);
		System.out.println("La segunda palabra es: "+ pal2);

	}
}