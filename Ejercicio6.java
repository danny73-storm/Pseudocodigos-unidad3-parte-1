
public class Ejercicio6{
	public static void main (String[] args){

		int x;
		double num;

		x = (int)(Math.random()*(200));
		System.out.println("\n\n El numero generado es: " + x);
		
		num = x+((x*30)/100);

		System.out.println("\nEl numero " + x + " su aumento del 30% es: " + num);

	}
}