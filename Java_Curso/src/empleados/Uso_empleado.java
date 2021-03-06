package empleados;

import java.util.*;
//Clase principal con el metodo void main.
public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Paco G?mez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Ana L?pez", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("Mar?a Mart?n", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de ingresos: " + empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de ingresos: " + empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de ingresos: " + empleado3.dameFechaContrato());*/
	
		//Instancia o objeto de jefatura
		Jefatura jefe_RRHH=new Jefatura("Andrea", 55000, 2006, 9, 25);
		
		//establecer el insentivo con el metodo de la clase jefatura
		jefe_RRHH.estableceIncentivo(2570);
		
		
		// crear el array tipo Empleados
		Empleado[] misEmpleados=new Empleado[6];
		//darle los valores con el contructor al array misEmpleados
		misEmpleados[0]=new Empleado("Paco G?mez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana L?pez", 95000, 1995, 06, 02);
		misEmpleados[2]=new Empleado("Mar?a Mart?n", 105000, 2002, 03, 15);
		misEmpleados[3]=new Empleado("Israel Salinas");
		
		//agregar el objeto jefe_RRHH en el array, se realiza el polimorfismo (principio de la sustituci?n, es un)
		misEmpleados[4]=jefe_RRHH;
		misEmpleados[5]=new Jefatura("Tania", 95000, 1999, 5, 26);
		
		//hacer el casting o refundicion del objeto misEmpleados[6] para poder utilizar el m?todo de establecer insentivo que solo se encuentra en la subclase. y el objeto mis Empleado es un objeto de superclase, por lo cual no podemos llamar el metodo.
		Jefatura jefa_Finanzas=(Jefatura)misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000);
		
		//misEmpleados[5]=jefa_Finanzas;
		
		
		/*for (int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de ingresos: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		// para la implementacion de la clase Arrays para usar el metodo para ordenar el suel de menos a mayor de los empleados, nos solicita que tenemos que usar una interfez "comparable" que sera agregada en la clase empleados 
		Arrays.sort(misEmpleados);
		
		//usar el for mejorado
		for (Empleado e:misEmpleados) {  //enlazado dinamico cuando llame el m?todo dameSueldo del objeto jefatura, es de manera auntomatica, identifica que el objeto es de la subclase, por lo cual llamara el metodo que se llma igual que en la super clase.
			e.subeSueldo(5);
			System.out.println("Nombre: " + e.dameNombre()  + " Id " + e.dameId() + " Sueldo: " + e.dameSueldo() + " Fecha de ingresos: " + e.dameFechaContrato());
			
			
		}
		
		
	}

}
//clases que contendrar los m?todos necesarios para el uso de los objetos.
class Empleado implements Comparable{ //se coloca la interfaz para ordenar los sueldos, despues de ver herencia, por lo cual tiene que incluir un metodo de la clase comparable 
	
	//crear el contructor que le da el estado incial a los objetos
	//que ecibira parametros o argumetnos
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		//crear un obejto de la clase Gregorian Calendar con su m?todo constructor que solicite los parametros de agno, mes y dia
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		Id=Idsiguiente;
		Idsiguiente++;
	}
	
	//Crear otro contructor 
	public Empleado(String nom) {
		//nombre=nom;
		//si deseamos colocar en automatico valores cuando no se tienen todos los parametros
		//se llama dentro de este contructor el otro contructor con this. rellenando los parametros 
		//colocados dentro del this, mas el parametro ingresado en el contructor donde estamos
		
		this(nom, 30000, 2000, 01, 01);
	}
	
	//Getter para mostrar el nombre
	public String dameNombre() {
		return nombre;
	}
	
	//Getter para el sueldo
	public double dameSueldo(){
	// si colocamos final al inicio de la clase, este m?todo no permitira que otro metodo de otra clase heredada llama un metodo con el mismo nombre
	//public final double dameSueldo(){	
		return sueldo;
	}
	
	//Getter
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	//Getter para el id
	public int dameId(){
		return Id;
	}
	
	//Usar un setter que aunmente el sueldo, sin dovolver nada
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	// este m?todo es necesario para usar la clase Arrays 
	//crear el metodo compareto, pq lo requieres por la interfaz, ya que las interfaces tinen metodos abtractos
	public int compareTo(Object miObjeto) {
		//se necesita hacer un refundicion del miObjeto a tipo Empleado
		Empleado otroEmpleado=(Empleado) miObjeto; // esto me va permitir comprar los dos objetos
		// el this es para especificar el parametro implicito, un empleado cualquiera
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1; //es el valor que indica el metodo en la API para etsa interfaz
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1; //es el valor que indica el metodo en la API para etsa interfaz
		}
		
		return 0;
	}
	
	
	//Las atributos o parametros para el constructor 
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	//variable de clase, para compartir la variable con todos los objetos, no depende del objeto, ejemplo la clase math con sus metodos, todos ellos son estaticos, no necesitas un objeto antes del metodo para invocarlo
	private static int Idsiguiente=1;
	
} 
//clase que para la jefatura que hereda de empleado
class Jefatura extends Empleado{
//final class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		//es necesario escribir los parametros del contructor de empleado que se desea
		super(nom, sue, agno, mes, dia);
		
	}
	
	//setter
	public void estableceIncentivo(double b) {
		incentivo=b;
		
	}
	
	//getter , el triangolo verde indica que estamos sobreescribiendo un m?todo, invalidando el metodo heredado
	public double dameSueldo() {  //si descomentas la linea 98, esto manda error, pq final no permite que use el mismo nombre del metodo de la superclase
		double sueldoJefe;
		//asigna el valor del sueldojefe, llamando el metodo heredado de damesueldo de la clase empleado
		sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
		
	}
	
	//campos o variables 
	
	private double incentivo;
	
	
	
}

//tercera clase para mostrar el uso de las clases y metodos final, que se usa para impedir la herencia especifica de una clase o m?todo
//si agregamos la frase final en la clase Jefatura, ya no se podra heredar y marcara error. linea 128, comentada
class Director extends Jefatura{
	
	public Director(String nom, double sue, int agno, int mes, int dia) {
		//es necesario escribir los parametros del contructor de empleado que se desea
		super(nom, sue, agno, mes, dia);
		
	}
}