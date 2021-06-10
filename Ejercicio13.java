import java.util.*;
public class Ejercicio13{
	public static void main(String[] args) {
		String opcion = "n";
		Scanner scan = new Scanner(System.in);
		do {
			int numero1;
			int numero2;
			int operacion;
			int total;
			int dividir;
			System.out.println("Ingresa el primer numero");
			numero1 = scan.nextInt();
			System.out.println("Ingresa el segundo numero");
			numero2 = scan.nextInt();
			System.out.println("Presiona 1 para sumarlos, presiona 2 para dividirlos");
			operacion = scan.nextInt();
			if (operacion == 1) {
				total = numero1 + numero2;
				System.out.println("El resultado de la suma es " + total);
				System.out.println("Si desea realizar otra operadion pulse cualquier letra, si no pusle (s)");
				opcion = scan.nextLine();
			} else if (operacion == 2) {
				if (numero2 == 0) {
					System.out.println("No es posible la division");
				} else {
					dividir = numero1/numero2;
					System.out.println("El resultado de la division es " + dividir);
					System.out.println("Si desea realizar otra operadion pulse cualquier letra, si no pusle (s)");
					opcion = scan.nextLine();
				}
			} else {
				System.out.println("No esta disponible esa operaacion");
			}


		} while (!opcion.equals("s"));

	}
}