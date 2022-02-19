import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba=0;
		int punto=0;
		String mail=JOptionPane.showInputDialog("Introduce tu correo electronico ");
		
		//recorrer el correo en busca del arroba
		for(int i=0; i<mail.length(); i++) {
			
			if( mail.charAt(i)=='@') {
				arroba++;
			}
			if (arroba!=0) {
				
				if (mail.charAt(i)=='.') {
					punto++;
				}
				
			}
			
			
		}
		
		if(arroba==1 && punto==1) {
			System.out.println("Es correcto");
			JOptionPane.showMessageDialog(null,"Es correcto");
		}
		else {
			JOptionPane.showMessageDialog(null,"No es correcto");
		}

	}

}
