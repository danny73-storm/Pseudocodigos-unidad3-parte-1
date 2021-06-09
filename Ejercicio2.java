import java.util.*;

public class Ejercicio2{
	public static void main (String[] args){
		
		String pais,capital;
		Scanner s = new Scanner(System.in);

		//pedir el pais
		System.out.println("Ingrese el pais: ");
		pais = s.nextLine();
		//pedir la capital
		System.out.println("Ingrese la capital: ");
		capital = s.nextLine();

		System.out.println(capital +"es la capital de "+ pais);

	}
}