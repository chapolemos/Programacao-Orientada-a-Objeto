package lista;

public class VooMelhorado extends Voo {
	int fumantes;
	
	VooMelhorado(int numero, int cadeiras, int fumantes, int hora, int minutos, Data data){
		super(numero, cadeiras, hora, minutos, data);	
		this.fumantes = fumantes;
	}
/*
 if i > cadeiras - cadeirasfumante
 é cadeira de fumante
 */
	public void todasCadeiras() {
		
		System.out.println("==========LISTA DE CADEIRAS==========");
		for (int i = 0;i<this.cadeirasOcupadas.length;i++) {
			if (this.cadeirasOcupadas[i] == false)
				System.out.println("Cadeira numero "+i+" esta livre.\n");
			else
				System.out.println("Cadeira numero "+i+" esta ocupada.\n ");
			if (i>=(this.cadeirasOcupadas.length-this.fumantes))
				System.out.println("A cadeira numero "+i+" é uma cadeira de fumante.\n");
		}
		System.out.println("====================================\n");
		
	}
	
	int cadeirasFumantes() {
		System.out.println("Ha um total de "+this.fumantes+" cadeiras dedicadas a fumantes no avião.");
		return this.fumantes;
	}
	
	char tipo(int posi) {
			if (posi>=(this.cadeirasOcupadas.length-this.fumantes)){
				System.out.println("A cadeira é de fumante.\n");
				return 'F';
			}
			else
			{
				System.out.println("A cadeira não é de fumante.\n");
				return 'N';
			}
	}
}
