
public class Descifrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] matriz= {17,18,22,21,8,10,9,11,20,5,3,24,18,11,7,15,10,6,19,16,18,23,25,4,11,1,16,4,16,2,26,3,14,23,7,15,2,19,17,13,14};
		
		
		for(int i=8; i<(matriz.length-31); i++) {
			
			System.out.print(matriz[i] + " ");
			
		}
		
		System.out.println();
		
		for(int i=0; i<(matriz.length-23); i+=3) {
			
			System.out.print(matriz[i] + " ");
			
		}
		
		System.out.println();
		
		for(int i=10; i<matriz.length; i+=5) {
			
			System.out.print(matriz[i] + " ");
		}
			

	}

}
