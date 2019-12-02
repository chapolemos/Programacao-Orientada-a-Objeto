package lista;

//import java.util.Arrays;

public class Prova {
	String aluno;
	Gabarito gabarito;
	char corretas[] = {'a','b','c','d','e','e','d','c','b','a','a','d','c','b','e'};
	Prova(String aluno, Gabarito gabarito){
		this.aluno = aluno;
		this.gabarito = gabarito;
		
		//for (int i =0;i<this.gabarito.questoes.length;i++)
			//System.out.println("");
		
	}

	public double nota() {
		double nota = 0;
		for (int i =0;i<15;i++) {
			if (this.gabarito.questoes[i] == this.corretas[i]) {
				if(i <10) {
				nota+=0.5;
				}
				else {
				nota+=1;
				}
			}		
		}
		
		//System.out.println("\nA nota de "+this.aluno+" é: "+nota);
		return nota;
	}
	public int acertos() {
		int acertos = 0;
		for (int i =0;i<15;i++) {
			if (this.gabarito.questoes[i] == this.corretas[i]) {	
				acertos++;		
			}		
		}
		
		//System.out.println("\nO aluno "+this.aluno+" acertou um total de: "+acertos+" questões.");
		return acertos;
	}
	public void imprimeProva() {
		System.out.println("\n\nAluno: "+this.aluno);
		for (int i =0;i<this.gabarito.questoes.length;i++)
			System.out.println("Resposta correta da questao "+(i+1)+": "+this.corretas[i]+" Resposta de "+this.aluno+": "+this.gabarito.questoes[i]);
	}
	
	public double maior(Prova prova) {
		System.out.println("\n\n\nAcertos da prova 1: "+this.acertos());
		System.out.println("\nAcertos da prova 2: "+prova.acertos());
		if (this.acertos() > prova.acertos()) {
			System.out.println("\nA prova 1 obteve mais acertos. Retornando nota.");
			return this.nota();
		}
		else if(this.acertos() < prova.acertos()) {
			System.out.println("\nA prova 2 obteve mais acertos. Retornando nota.");
			return prova.nota();
		}
		
		else {
			System.out.println("\nAs provas tiveram o mesmo número de acertos.");
			System.out.println("\nNota da prova 1: "+this.nota());
			System.out.println("\nNota da prova 2: "+prova.nota());
			if(this.nota() > prova.nota()) {
				System.out.println("\nA prova 1 obteve mais pontos. Retornando nota.");
				return this.nota();
			}
			else if(this.nota() < prova.nota()) {
				System.out.println("\nA prova 2 obteve mais pontos. Retornando nota.");
				return prova.nota();
			}
		}
		
		System.out.println("\nEmpate completo. Retornando nota da prova 1.");
		return this.nota();
	}
	
}
