
public class Eje {
	public static void main(String[] args) {
		int [][] mat=new int [2][3];
		int suma=1;
		for (int i=0; i<mat.length; i++){
			for (int j=0; j<mat[i].length; j++){
				mat [i][j]=suma;
				suma=suma+1;
				
				System.out.print (mat [i][j]+" ");
			}
			System.out.println ();
		}
		
	}
}
