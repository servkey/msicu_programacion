import java.io.*;

public class Main{
	public static void main(String args[]) throws Exception{
		int in = 0;
		while (in != -1){
			System.out.println("Escribe una letra: ");
			in = System.in.read();
			System.out.println("Escribiste: " + in);
		}
	}
}