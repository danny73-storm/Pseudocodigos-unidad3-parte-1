
public class Ejercicio19{

	public static void main (String[] args){

		int x;
		double num;

		x = (int)(Math.random()*(1000+1));
		System.out.println("\n\n El numero generado es: " + x);
		
		if (x % 5 == 0) {
			if (x<125) {
				System.out.println("Correcto");
			}else{
				System.out.println("El numero es mayor a los primeros 25 multiplos");
			}
		}else{
			System.out.println("El numero no es multiplo de 5");
		}
	}
}