import java.util.Scanner;

public class Numero{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Bienvenidos");
		System.out.println("Este programa te dirá el mayor de dos números ingresados desde el teclado");
	
		//Lectura del primer número
		System.out.print("Ingresa el primer número: ");	
		int numero1 = in.nextInt();

		
		double resultado = Math.pow(numero1, 2);
		System.out.println("Resultado: " + resultado);
		
		System.out.print("Ingresa el segundo número: ");		
		int numero2 = in.nextInt();

		if (numero1 > numero2){
			System.out.println("\nEl número " + numero1 + " es mayor que " + numero2);
		}else{
			System.out.println("\nEl número " + numero2 + " es mayor que " + numero1);		
		}		
	}
}