
public class Uso_arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];
		paises[0]="Espa�a";
	    paises[1]="M�xico";
	    paises[2]="Colombia";
	    paises[3]="Australia";
	    paises[4]="Canad�";
	    paises[5]="Alemania";
	    paises[6]="Francea";
	    paises[7]="Per�";
	     
	    //for normal
	    /*for(int i=0; i<paises.length; i++) {
	    	System.out.println("Pa�s " + (i+1) + " " + paises[i]);
	    	   }*/
	    
	    // for each
	    for(String elemento:paises) {
	    	System.out.println(elemento);
	    }
	}

}
