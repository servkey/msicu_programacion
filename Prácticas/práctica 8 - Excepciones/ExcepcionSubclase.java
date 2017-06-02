public class ExcepcionSubclase{
	public static void main(String args[]){
		int nums[] = new int[4];
		for (int i = 0; i < 5; i++){
			try{
				System.out.println("---------Iteraci�n " + i + "------------");
				//Antes de generar la excepci�n
				System.out.println("Antes de generar la excepci�n");
				if (i == 0){
					Object o = new Object();
					o = null;
					o.toString();
				}
				
				nums[i] = 20;
				System.out.println("Despu�s de asignar valor al arreglo");
	
			}catch(ArrayIndexOutOfBoundsException e){
				//Atrapa la excepci�n
				System.out.println("ArrayIndexOutOfBoundsException: �ndice fuera de l�mite");
			}catch(Throwable e){
				//Atrapando la excepci�n general
				System.out.println("(Throwable: Ocurrio un error");
			}
			System.out.println("Despu�s de atrapar la excepci�n");
		}
	}
}
