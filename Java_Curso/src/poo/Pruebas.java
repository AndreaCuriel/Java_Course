package poo;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		
		trabajador1.cambiaSeccion(JOptionPane.showInputDialog("Sección es "));
		
		System.out.println(trabajador1.devuelvedatos());
		System.out.println(trabajador2.devuelvedatos());
		System.out.println(Empleados.dameIdSiguiente());
		
		

	}

}

class Empleados{
	
	
	//Constructor 
	Empleados(String nom) {
		nombre=nom;
		seccion="Administración";
		Id=Idsiguiente;
		Idsiguiente++;
	}
	
	//Setter para cambiar la sección
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
		
	}
	
	//Getter
	public String devuelvedatos() {
		return "El nombre es " + nombre + " la seccion es : " + seccion + " id " + Id; 
	}
	
	
	//setter que cambia el nombre
	/*public void cambiaNombre(String nombre) {
	this.nombre=nombre;	
	}*/
	
	//metodo estatico que nos de el id siguiente
	public static String dameIdSiguiente() {
		return "el IdSiguiente es: "+ Idsiguiente;
	}

	
	
	//Taributos o parametros del contructor
	private final String nombre; //se usa final para evitar que el valor se cambie despues del contructor le asigna su valor 
	private String seccion;
	private int Id;
	//variable de clase, para compartir la variable con todos los objetos, no depende del objeto, ejemplo la clase math con sus metodos, todos ellos son estaticos, no necesitas un objeto antes del metodo para invocarlo
	private static int Idsiguiente=1;
	
	
}
