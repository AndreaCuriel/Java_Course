
public class Uso_Arrays2dimesiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear una matriz de dos dimensiones
		/*int [][] matrix=new int [3][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;*/
		
		int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		
		// imprimir matriz con dos for normales
		/*for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		System.out.println();*/
		
		//usar el for para arrays
		for(int[]fila:matrix) {
			for(int tabla:fila) {
				System.out.print(tabla + " ");
			}
			System.out.println();
			
		}
		
		
		

	}

}
