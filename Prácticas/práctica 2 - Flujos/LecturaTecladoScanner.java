import java.io.*;
import java.util.Scanner;

public class LecturaTecladoScanner{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("\t***Opciones***");
		System.out.println("\t\t1. Opci�n 1");
		System.out.println("\t\t2. Opci�n 2");
		System.out.println("\t\t3. Opci�n 3");
		System.out.print("Escriba una opci�n:");

		int opcion = in.nextInt();	
		switch(opcion){		
			case 1:
				System.out.println("Opci�n 1 seleccionada");
				break;
			case 2:
				System.out.println("Opci�n 2 seleccionada");
				break;
			case 3:
				System.out.println("Opci�n 3 seleccionada");
				break;
			default:
				System.out.println("Opci�n Inv�lida");
	
		}
	}
}