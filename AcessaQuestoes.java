package lista;


public class AcessaQuestoes {
	
	public static void main (String[] args) {
		
		Data aviao = new Data(10,2,1998);
		Voo morreu = new Voo (666,10,15,02,aviao);
		Voo morreu2 = morreu.clone();
		morreu.ocupa(1);

		System.out.println("----------------------V�o morreu abaixo--------------------------	 \n");
		morreu.getVoo();
		morreu.getData();
		morreu.proximaLivre();
		morreu.todasCadeiras();

		System.out.println("----------------------V�o morreu2 abaixo--------------------------	 \n");
		morreu2.getVoo();
		morreu2.getData();
		morreu2.proximaLivre();
		morreu2.todasCadeiras();
		
	}
	
			
		
		
}
//Quest�o 01
/*
Aluno lemos = new Aluno(666,"Lemos",4,8,4);
lemos.provafinal();
*/

//Quest�o 2
/*
Data hoje = new Data(5,1,2000);
Data hoje2 = new Data(29,1,2000);
Data hoje3 = new Data(1,1,2000);
hoje3.compara(hoje2);
Data hoje4 = hoje.clone();
hoje4.getMesExtenso();
*/

//Quest�o 3




//Quest�o 4
/*
Gabarito jefG = new Gabarito('a','b','c','d','e','a','b','c','d','e','a','b','c','d','e');
Gabarito thaG = new Gabarito('e','d','c','b','a','e','d','c','b','a','e','d','c','b','a');
Gabarito vitG = new Gabarito('a','b','d','b','a','e','d','c','b','a','e','d','c','b','a');
Gabarito morgG = new Gabarito('a','b','c','d','e','e','d','c','b','a','e','c','c','d','a');
Gabarito mariG = new Gabarito('a','b','c','c','e','e','d','c','b','a','e','c','c','d','a');
Prova vit = new Prova("Vitor",vitG);
Prova jef = new Prova("Jeff",jefG);
Prova tha = new Prova("Thais",thaG);
Prova morg = new Prova("Morgana",morgG);
Prova mari = new Prova("Mariana",mariG);
morg.maior(vit);
vit.maior(mari);
tha.maior(jef);
 */

//Quest�o 5
/*
Vetor viado = new Vetor(2);
viado.imprimeVector();
viado.vector[0] = "1";
//System.out.println(viado.vector[1]);
viado.insert("Jenio");
viado.insert("Jenio");
viado.insert("Jenio");
viado.insert("Jenio");
viado.insert("Jenio");
viado.insert("Jenio");
viado.imprimeVector();
viado.insert("Jenio");
viado.insert("Jenio");
viado.size();
viado.imprimeVector();
viado.get(8);
//System.out.println(viado.vector[1]);
*/

//Quest�o 6
/*VetorOrdenado bicha = new VetorOrdenado(5);
bicha.insertOrdenado("Gay");
bicha.imprimeVector();
*/

//Quest�o 01 Lista 02
/*
Data dia = new Data(26,11,1998);
VooMelhorado morreu = new VooMelhorado(666,10,3,15,26,dia);
morreu.todasCadeirasF();
morreu.tipo(7);
*/