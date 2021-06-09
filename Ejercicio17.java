import java.util.*;

public class Ejercicio17{
	public static void main (String[] args){
		
		int dim1,dim2,dim3;
		Scanner leer = new Scanner(System.in);

		//pedir el numero a aumentar 
		System.out.println("Ingrese las dimenciones del triangulo que quiere conocer su tipo: ");
		dim1 = leer.nextInt();
		dim2 = leer.nextInt();
		dim3 = leer.nextInt();

		if (dim1 == dim2 ) {
			if (dim1 == dim3) {
				System.out.println("Las dimenciones ingresadas correponden a un triangulo EQUILATERO");
				
			}else{
				System.out.println("Las dimenciones ingresadas correponden a un triangulo ISOCELES");
			}
			
		}else if (dim3!=dim2 & dim3!=dim1) {
			System.out.println("Las dimenciones ingresadas corresponden a un triangulo ESCALENO");
			
		}else{
			System.out.println("Las dimenciones ingresadas correponden a un triangulo ISOCELES");
		}

	}
}