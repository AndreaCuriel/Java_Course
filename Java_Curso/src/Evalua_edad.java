import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu endad ");
		
		int edad=entrada.nextInt();
		
		if(edad>=18) {
			
			System.out.println("Es mayor de edad");
		
		}
		else {
			System.out.println("Es menor de edad");
		}
		

	}

}
