class ThrowEjemplo{
	public static void main(String args[]){
		try{
			System.out.println("Antes de Lanzar");
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			//Atrapa excepci�n
			System.out.println("Excepci�n atrapada");
		}
		System.out.println("Despu�s del bloque try/catch");
	}
}
