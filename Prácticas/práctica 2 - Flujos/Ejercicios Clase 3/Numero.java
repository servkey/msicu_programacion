import java.util.Scanner;

public class Numero{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Bienvenidos");
		System.out.println("Este programa te dir� el mayor de dos n�meros ingresados desde el teclado");
	
		//Lectura del primer n�mero
		System.out.print("Ingresa el primer n�mero: ");	
		int numero1 = in.nextInt();

		
		double resultado = Math.pow(numero1, 2);
		System.out.println("Resultado: " + resultado);
		
		System.out.print("Ingresa el segundo n�mero: ");		
		int numero2 = in.nextInt();

		if (numero1 > numero2){
			System.out.println("\nEl n�mero " + numero1 + " es mayor que " + numero2);
		}else{
			System.out.println("\nEl n�mero " + numero2 + " es mayor que " + numero1);		
		}		
	}
}