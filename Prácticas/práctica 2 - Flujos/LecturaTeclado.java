import java.io.*;

public class LecturaTeclado{
	public static void main(String[] args) throws Exception{
		System.out.println("\t***Opciones***");
		System.out.println("\t\t1. Opci�n 1");
		System.out.println("\t\t2. Opci�n 2");
		System.out.println("\t\t3. Opci�n 3");
		
		System.out.print("Escriba una opci�n:");
		char lectura = (char)System.in.read();	
		if (lectura == '1'){
			System.out.println("Opci�n 1 seleccionada");
		}else if (lectura == '2'){
			System.out.println("Opci�n 2 seleccionada");
		}else if (lectura == '3'){
			System.out.println("Opci�n 3 seleccionada");
		}else{
			System.out.println("Opci�n Inv�lida");
		}
	}
}