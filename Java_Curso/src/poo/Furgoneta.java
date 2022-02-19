package poo;
//la clase furgoneta ehereda de Coche, Coche es la super clase, o clase padre.
//No hay herencia multiple en java
public class Furgoneta extends Coche{
	
	//parametros o atributos de la Furgoneta
	
	private int capacidad_carga;
	private int plaza_extra;
	
	//Su contructor
	public Furgoneta(int plaza_extra, int capacidad_carga) {
		//Llamar al contructor de la clase padre
		super();
		//Dar el estado inicial
		this.capacidad_carga=capacidad_carga;
		this.plaza_extra=plaza_extra;
		
	}
	//Getter
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es " + capacidad_carga + " y las plazas son " + plaza_extra;
	}
	
}
