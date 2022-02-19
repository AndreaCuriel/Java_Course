import javax.swing.JOptionPane;

public class Factorial_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado=1;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Escribir numer "));
		
		for(int i=numero; i>0; i--) {
			
			resultado=resultado*i;
		}
		
		JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + resultado);
		
		

	}

}
