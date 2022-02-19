
public class Uso_arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];
		paises[0]="España";
	    paises[1]="México";
	    paises[2]="Colombia";
	    paises[3]="Australia";
	    paises[4]="Canadá";
	    paises[5]="Alemania";
	    paises[6]="Francea";
	    paises[7]="Perú";
	     
	    //for normal
	    /*for(int i=0; i<paises.length; i++) {
	    	System.out.println("País " + (i+1) + " " + paises[i]);
	    	   }*/
	    
	    // for each
	    for(String elemento:paises) {
	    	System.out.println(elemento);
	    }
	}

}
