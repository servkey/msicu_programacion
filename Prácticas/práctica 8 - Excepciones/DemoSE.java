public class DemoSE{
	public static void main(String args[]){
		int nums[] = new int[4];
		//Antes de generar la excepci�n
		System.out.println("Antes de generar la excepci�n");
		nums[10] = 20;
		System.out.println("Despu�s de atrapar la excepci�n");
	}
}
