package controller;

public class VetorController {
	
	public VetorController() {
		
		super();
		
	}
	
	public int paresVetor(int[] vetor, int tamanho) {
		
		if (tamanho == 0 ) {
			
			return 0;
			
		} else {
			
			int valor = 0;
			
			do {
			
			int ultimaPosicao = tamanho - 1;
			valor = vetor[ultimaPosicao];
			tamanho = tamanho - 1;
			
			} while (valor % 2 == 1);
			
			return 1 + paresVetor(vetor, tamanho);
			
		}
		
	}
	
}