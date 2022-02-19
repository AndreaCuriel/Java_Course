package poo;

import javax.swing.JOptionPane;

//clase para instanciar la clase
public class Uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar o crear un objeto de la clase Coche (ejemplar de clase)
		
		//Coche Renault=new Coche();
		//si loas propiedades estan encapsuladas, no funciona la siguiente instruccion, se necesita llamar un método
		//System.out.println("Este coche tiene" + Renault.ruedas + " ruedas");
		
		//System.out.println(Renault.dime_largo());
		
		//mis objetos
		
		Coche micoche=new Coche();
		
		Furgoneta mifurgoneta=new Furgoneta(7, 580);
		
		//asignar color
		
		micoche.establece_color("amarillo");
		
		mifurgoneta.establece_color("rojo");  //metodo heredado
		
		//datos generales
		System.out.println(micoche.dime_datos_generales());
		System.out.println(mifurgoneta.dime_datos_generales() + " " + mifurgoneta.dimeDatosFurgoneta());
	
		//color
		System.out.println(micoche.dime_color());
		System.out.println(mifurgoneta.dime_color());
		
		//configuracion de asientos
		
		micoche.configurar_asientos(JOptionPane.showInputDialog(" Cuero: si o no"));
		mifurgoneta.configurar_asientos(JOptionPane.showInputDialog(" Cuero: si o no"));
		
		//datos de asientos
		System.out.println(micoche.dime_asientos());
		System.out.println(mifurgoneta.dime_asientos());
		
		//configuracion del climatizador
		micoche.configura_climatizador(JOptionPane.showInputDialog("Climatizador: si o no"));
		mifurgoneta.configura_climatizador(JOptionPane.showInputDialog("Climatizador: si o no"));
		
		//datos del climatizador
		System.out.println(micoche.dime_climatizador());
		System.out.println(mifurgoneta.dime_climatizador());
		
		//datos del peso
		System.out.println(micoche.dime_peso_coche());
		System.out.println(mifurgoneta.dime_peso_coche());
		
		
		
		System.out.println("El precio final del coche es " + micoche.precio_coche());
	}
	

}
