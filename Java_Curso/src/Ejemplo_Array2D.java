
public class Ejemplo_Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes=0.10;
		
		double [][] saldo=new double[5][6];
		
		for(int i=0; i<6; i++) {
			saldo[0][i]=10000;
			acumulado=10000;
			
			for(int j=1; j<5; j++) {
				
				acumulado=acumulado+(acumulado*interes);
				saldo[j][i]=acumulado;
				
			}
			
			interes=interes+0.01;
		}
		
		
		for(double[]fila:saldo) {
			for(double tabla:fila) {
				System.out.printf(tabla + " ");
			}
			System.out.println();
		}

	}

}
