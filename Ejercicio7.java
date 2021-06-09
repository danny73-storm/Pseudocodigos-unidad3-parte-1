
public class Ejercicio7{

	public static void main (String[] args){

		int x;
		double num;

		x = (10-1)+(int)(Math.random()*(40+1));
		System.out.println("\n\n El numero generado es: " + x);
		
		num = x-((x*15)/100);

		System.out.println("\nEl numero " + x + " su dismminucion del 15% es: " + num);

	}
}