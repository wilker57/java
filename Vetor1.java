package Arrays;

public class Vetor1 {
	
	int [ ] vetor = new int [10];
	
	public static void main(String[] args) {
		
		for ( int i = 0; i < vetor.lenght ; i  ++) {
			
			vetor [i] = i*2;
			
			System.out.println("Posição: " + i + " Valor: " + i);
		}
		
	}

}
