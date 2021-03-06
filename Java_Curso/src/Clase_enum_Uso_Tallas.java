import java.util.Scanner;

//tipos enumerados, espefificando con una variable objeto tipo enum, que solo se pueden guardar especificamente unos valores 
public class Clase_enum_Uso_Tallas {
	
	//llamar e instanciar la clase enum
	//ENUM, sus metodos son estaticos, se utiliza el nombre de la clase apra usarlos
	//permite los contructores y m?todos getters y setters
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("G"), MUY_GRANDE("xl");
		//Constructor de Talla (clase enumerada), EL COMTRUCTOR DEBE SER PRIVADO PARA QUE NO SE PUEDAN CREAR INSTANCIA DEL CONTRUCTOR
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
		//GETTER
		public String dameAbreviatura() {
			return abreviatura;
		}
		private String abreviatura;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Talla s=Talla.MINI;
		Talla m=Talla.MEDIANO;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;*/
		
		//usar el metodo de la clase enum
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		String entrada_datos=entrada.next().toUpperCase();
		
		//metodo estuatico de enum, que devuelve la contante enumerada
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla= " + la_talla);
		System.out.println("Abreviatura " + la_talla.dameAbreviatura());


	}

}
