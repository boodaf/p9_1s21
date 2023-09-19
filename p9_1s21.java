import java.util.scanner;

public class p9_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System operacion;
		System.out.println("Que tipo de operaciones deseas realizar");
		System.out.println("escribala: Suma, Resta");
		Operacion = teclado.nextLine()

		if (operacion.equals("Sumar")){
			System.out.println("Haremos una suma");
        }else if (operacion.equals("Resta")){
        	System.out.println("Haremos una resta");
        }else {
        	System.out.println("No existe la operacion")
        }
	}
}