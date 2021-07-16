
public class OperadoresLogicos {
	
	public static void main(String [] args) {
		//TODO Auto-generated method stub
		/*
		 * Operadores Logicos
		 * a==b a es igual a b
		 * a>b a es mayor que b
		 * a<b es menor que b
		 * a!=b a es diferente a b
		 * >= <=
		 */
		saludo();
		//System.out.print(saludo());
	}

}
/* 
 * Void hace referencia a algo vacio.
Cuando se coloca en un método o una función indica que no retornará nada. 
*/

//el metodo es publico y estatico, osea no se declaro un objeto
public static String saludo() {
	return "saludo";
}

public static void saludo() { // el void indica que no va a retornar nada
	System.out.print("saludo1");
	System.out.print("saludo2");	
}



