package lista;

public class Gabarito {
	char questoes[];
			
	Gabarito(char q1, char q2, char q3, char q4, char q5, char q6, char q7, char q8, char q9, char q10, char q11, char q12, char q13, char q14, char q15){
		this.questoes = new char[15];	
		//Peso menor
		this.questoes[0] = q1;
		this.questoes[1] = q2;
		this.questoes[2] = q3;
		this.questoes[3] = q4;
		this.questoes[4] = q5;
		this.questoes[5] = q6;
		this.questoes[6] = q7;
		this.questoes[7] = q8;
		this.questoes[8] = q9;
		this.questoes[9] = q10;
		//Peso maior
		this.questoes[10] = q11;
		this.questoes[11] = q12;
		this.questoes[12] = q13;
		this.questoes[13] = q14;
		this.questoes[14] = q15;
		}
	
}
