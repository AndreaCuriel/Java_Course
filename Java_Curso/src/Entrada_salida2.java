import javax.swing.JOptionPane;

public class Entrada_salida2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JOptionPane 
		
				String nombre_usurio=JOptionPane.showInputDialog("Introduce tu nombre: ");
				String edad_usurio=JOptionPane.showInputDialog("Introduce tu edad: ");
				// usaremos la clase integer para convertir la edad a un int 
				int edad_numerica=Integer.parseInt(edad_usurio);
				edad_numerica++;
				System.out.println("Hola " + nombre_usurio + "tendras " + (edad_numerica) + " de edad");
				
				//formato al numero de decimales que se desean
				String num1=JOptionPane.showInputDialog("Introduce un numero ");
				double num2=Double.parseDouble(num1);
				System.out.print("la raiz de " + num2 + " es");
				System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
