public class Demo{
	public static void main(String args[]){
		int nums[] = new int[4];
		try{
			//Antes de generar la excepci�n
			System.out.println("Antes de generar la excepci�n");
			nums[10] = 20;
		}catch(ArrayIndexOutOfBoundsException e){
			//Atrapa la excepci�n
			System.out.println("�ndice fuera de l�mite");
		}
		System.out.println("Despu�s de atrapar la excepci�n");
	}
}
