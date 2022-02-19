package poo;
//clase con la estructura comun.
public class Coche {
	
	//escribir las caracteristicas comunes de un carro
	//atributos encapsulados con private
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	//Propiedades diferentes dependiendo del coche (objeto)
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	
	//creaci�n del m�todo constructor 
	//m�todo especial que se encarga de dar un estado inicial al objeto
	
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	
	//m�todo getters o captadores, leemos las propiedades,
	//Sintaxis: public dato_a_devolver nombre_m�todo(){c�digo + return}
	
	//Proporcionar el largo del coche
	public String dime_datos_generales() {
		
		return "La plataforma del veh�culo tiene " + ruedas + " ruedad. Mide " + largo/1000 +
				" metros con un ancho de " + ancho + " cm y un peso de plataforma " + peso_plataforma + " kilos";
	}
	
	//m�todo setters o definidores, estabecen propiedad
	//Sintaxis: public void nombre_m�todo(){c�digo} 
	
	//modificar el color con un setter
	public void establece_color(String color_coche) {
		color=color_coche;
		
	}
	
	//Getter que nos informe del color
	public String dime_color() {
		return "El colo del coche es " + color;
		
	}
	
	
	//Setter para configurar los asientos
	//usaremos this para indicar que estamos haciendo referencia al nombre de la variable, cuando el parametro se llama igual
	public void configurar_asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")){
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
		
		
	}
	
	//Getter para devolver el dato de los asientos
	public String dime_asientos() {
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
			
		}else 
			return "El coche no tiene asientos de cuero";
	
	}
	
	//Setter
	
	public void configura_climatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
	}
	
	//Getter para devolver el dato del climatizador
		public String dime_climatizador() {
			if(climatizador==true) {
				return "El coche tiene climatizador";
				
			}else {
				return "El coche no tiene climatizador";
			}
			
		}
		
		//realizaremos un getter setter, el cual no es una practica recomendada, que un m�todo sea los dos
		public String dime_peso_coche() {
			int peso_carroceria=500;
			peso_total=peso_plataforma + peso_carroceria;
			
			if(asientos_cuero==true) {
				peso_total=peso_total + 50;
				
			}
			
			if(climatizador==true) {
				peso_total=peso_total + 20;
			}
			
			return "El peso total es " + peso_total;
			
		}
		
		public int precio_coche() {
			int precio_final=10000;
			
			if(asientos_cuero==true) {
				precio_final+=2000;
				
			}
			
			if(climatizador==true) {
				precio_final+=1500;
				
			}
			return precio_final;
		}
}
