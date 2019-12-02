package lista;

public class Vetor {
	int size;
	String vector[];
	Vetor(int size){
		this.size = size;
		this.vector = new String[size];
	}
	Vetor(){
		this.size = size;
		this.vector = new String[size];
	}

	int insert(String elemento) {
		for (int i = 0;i<this.size;i++) {
			if (this.vector[i] == null) {
				this.vector[i] = elemento;
				System.out.println("Elemento "+elemento+" inserido com sucesso na posição "+i);
				return 0;
			}
			if (i==this.size-1) {
				
				String temp[] = new String[this.size+1];
				for (int j = 0;j<temp.length-1;j++) {
					temp[j] = this.vector[j];
				}
				
				System.out.println("Final do vetor alcançado no indice "+i+". Extendendo vetor.");
				this.vector = temp;
				this.size +=1;
				
			}
		}
		
		System.out.println("Elemento não inserido.");
		return -1;
	}
	
	String get(int pos) {
		if (pos >= this.size || pos < 0) {
			System.out.println("\nPosição inválida.");
			return null;
		}
		else {
		System.out.println("\nO elemento na posição "+pos+" é: "+this.vector[pos]);
		return this.vector[pos];
		}
	}
	int size(){
		System.out.println("\nO tamanho do vetor é: "+this.size);
		return this.size;
	}
	
	void imprimeVector() {
		System.out.println("\nImprimindo vetor.\n");
		for (int i = 0;i<this.size;i++)
				System.out.println("Elemento "+i+": "+this.vector[i]);
	}
}
