//clases y métodos abstractos, tema de herencias, respecto a jerarquias 

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear instancias
		Persona[] LasPersonas=new Persona[2];
		LasPersonas[0]=new Empleado2("Andrea", 80000, 2009, 02, 25);
		LasPersonas[1]=new Alumno("Tania", "Docencia");
		
		for (Persona e:LasPersonas) {
			
			System.out.println(e.DameNombre() + " "+ e.DameDescripcion());
			
		}
		

	}

}
//abstracta pq tiene un método abstracta, es una regla 
abstract class Persona{
	
	//contructor
	public Persona(String nom) {
		nombre=nom;
	}
	
	//getter para el nombre
	public String DameNombre() {
		return nombre;
	}
	
	//MÉTODO ABSTRACTO, se agrega abstrac para forzar a las subclases a crear un método con el mismo nombre (método abstracto de ;a subclase), si hay un metodo abstracto en un clase, la clase debe ser abstracta también
	public abstract String DameDescripcion();
	
	//parametros, campos o atributos
	
	private String nombre;
}

//clases que contendrar los métodos necesarios para el uso de los objetos.
class Empleado2 extends Persona{ 
	
	//crear el contructor que le da el estado incial a los objetos
	//que ecibira parametros o argumetnos
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo=sue;
		//crear un obejto de la clase Gregorian Calendar con su método constructor que solicite los parametros de agno, mes y dia
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		Id=Idsiguiente;
		Idsiguiente++;
	}
	
	//reescribir o sobreescribir el metodo del metodo abstracto de la clase Persona, sino dara error
	public String DameDescripcion() {
		return "Este empleado tiene un Id= " + Id + " con un sueldo= " + sueldo;
	}
	
	
	//Getter para el sueldo
	public double dameSueldo(){
	// si colocamos final al inicio de la clase, este método no permitira que otro metodo de otra clase heredada llama un metodo con el mismo nombre
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
	
	//Las atributos o parametros para el constructor 
	private double sueldo;
	private Date altaContrato;
	private int Id;
	//variable de clase, para compartir la variable con todos los objetos, no depende del objeto, ejemplo la clase math con sus metodos, todos ellos son estaticos, no necesitas un objeto antes del metodo para invocarlo
	private static int Idsiguiente=1;
	
} 

class Alumno extends Persona{
	
	//Contructor
	public Alumno(String nom, String car) {
		//lamar el contructor de la superclase Persona
		super(nom);
		carrera=car;
		
	}
	
	//sobreescribir el metodo DameDescripcion (método abtracto)
	public String DameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
	}
	
	//atrubutos
	private String carrera;
}