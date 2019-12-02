package lista;

public class Aluno {
	int matricula;
	String nome;
	double nota1;
	double nota2;
	double notaT;
	
	Aluno(int matricula, String nome, int nota1, int nota2, int notaT){
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaT = notaT;
	}
	double media(){
		return (this.nota1*2.5 + this.nota2*2.5 + this.notaT*2)/7;
	}
	void provafinal() {
		
		double media = this.media();
		double falta = 7-media;
		
		
		if (media < 7 && media >= 3) {
			System.out.println(this.nome+" ficou de prova final com media: "+media);
			System.out.println(this.nome+" precisa de: "+falta+" pontos para passar.");
			
		}
		else if(media < 3)
			System.out.println("Você falhou com media:"+media);
		else
			System.out.println("Aluno aprovado sem prova final.");
	}
			
		
}