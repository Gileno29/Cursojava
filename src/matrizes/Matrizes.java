package matrizes;

public class Matrizes {
	public static void main(String[] args) {
		double[][] notas= new double[3][4];//declaração de uma matriz
		
		notas[0][0]=10;
		notas[0][1]=8;
		notas[0][2]=7;
		notas[0][3]=9.5;
		
		notas[1][0]=11;
		notas[1][1]=1;
		notas[1][2]=3;
		notas[1][3]=3.5;
		
		notas[2][0]=10;
		notas[2][1]=8;
		notas[2][2]=1;
		notas[2][3]=9.5;
		
		
		double soma;
		for(int i=0; i<notas.length;i++){
			soma=0;
			for(int j=0; j<notas[i].length; j++) {
				soma+= notas[i][j];
				
			}
			System.out.println("média do aluno "+ i+" é "+(soma/4));
		}
	}
	
	double[][] notas02= {{7,8,9,10},{2,4.5,6}};//inicialização de uma matriz

}
