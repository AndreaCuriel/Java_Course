import java.util.*;


public class entradas_salidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear el metodo contructor de scanner para poder leer la informacion de la consola del sistema.
		//el metodo contructor siempre se llama como la clase.
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre ");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad ");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + " tu cumpliras " + (edad+1));

		
		
		
	}   

}
