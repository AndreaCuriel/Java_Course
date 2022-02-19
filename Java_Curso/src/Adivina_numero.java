import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		do {
			System.out.println("Introduce un numero entre 1 al 100:");
			numero=entrada.nextInt();
			intentos++;
			
			if (aleatorio<numero) {
				System.out.println("El numero es menor");
			}
			
			else if (aleatorio>numero) {
				System.out.println("El numero es mayor");
			}
			
			
		}
		while(numero!=aleatorio);
		System.out.println("Ganaste!! \n Numero de intentos: " + intentos);
		

	}

}
