import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Juan";
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Favor de introducir la contrase�a ");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("contrase�a incorrecta");

				
			}
			
			
			
		}
		
		System.out.println("contrase�a correcta. Acceso permitido");

	}

}
