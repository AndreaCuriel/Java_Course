
public class Manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Andrea";
		System.out.println("mi nombre es: " + nombre);
		System.out.println("mi nombre tiene :" + nombre.length() + " letras");
		System.out.println("la primera letra de " + nombre + " es " + nombre.charAt(0));
		
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("la ultima letra de " + nombre + " es " + nombre.charAt(ultima_letra-1) );
		
		String frase="Hoy es un estupendo dia apra aprender a programar en java";
		String frase_resumen=frase.substring(29, 57) + " e irnos a la playa";
		System.out.println(frase_resumen);
		
		String alumno1, alumno2;
		alumno1="David";
		alumno2="David";
		System.out.println(alumno1.equals(alumno2));
		alumno2="david";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		


	}

}
