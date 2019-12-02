package lista;

public class Data {
	int dia;
	int mes;
	int ano;
	String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
	

	Data(int dia, int mes, int ano){
		System.out.println("==========REGISTRO DE DATA==========");
		System.out.println("Data colocada:"+dia+"/"+mes+"/"+ano);
		
		
//Verificações de problema		
		//Checa se o dia e mês estão fora de bounds.
		if (dia > 31 || dia < 1 || mes > 12 || mes < 1) {
			//throw new ArithmeticException("Data invalida. Tente outra vez.");
			System.out.println("Data invalida.");
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
		//Verifica se o mês é fevereiro e a quantidade de dias. Avalia se é ano bissexto.
		else if ((dia > 28 && mes == 2 && ano %4 != 0) || (dia > 29 && mes == 2)) {
			System.out.println("Data invalida, "+meses[mes-1]+" tem apenas 28 dias.");
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
		//Verifica se o mês é um dos meses de 30 dias.		
		else if (dia > 30 && (mes == 4 || mes == 6 || mes == 9 ||mes == 11)) {
			System.out.println("Data invalida, "+meses[mes-1]+" tem apenas 30 dias.");
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
		//Caso não hajam problemas, a data é configurada certinho.
		else {
			System.out.println("Data valida.");
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		System.out.println("Data registrada:"+this.dia+"/"+this.mes+"/"+this.ano);
		System.out.println("====================================\n");
	}
	//Verifica se o ano é bissexto
	public boolean isBissexto() {
		if (this.ano %4 == 0) {
			System.out.println("O ano da data é um ano bissexto.");
			return true;
		}
		else {
			System.out.println("O ano da data é um ano não bissexto.");
			return false;
		}
	}
	public int getDia(){
		System.out.println("O dia da data é:"+this.dia);
		return this.dia;
	}
	public int getMes(){
		System.out.println("O mes da data é:"+this.mes);
		return this.mes;
	}
	public String getMesExtenso(){
		System.out.println("O mes por extenso da data é: "+meses[this.mes-1]);
		return meses[this.mes-1];
	}
	public int getAno(){
		System.out.println("O ano da data é:"+this.ano);
		return this.ano;
	}
	public int compara(Data data) {
		//Verifica se as datas são iguais.
		if (data.dia == this.dia && data.mes == this.mes &&data.ano == this.ano) {
			System.out.println("As datas são iguais");
			return 0;
		}
		//Verifica qual o maior ano.
		else if (data.ano > this.ano) {
			System.out.println("A data comparada é maior do que a primeira.");
			return 1;
		}
		else if (data.ano < this.ano) {
			System.out.println("A data comparada é menor do que a primeira.");
			return -1;
		}
		//Caso os anos sejam iguais, verifica qual o maior mes.
		else if (data.mes > this.mes) {
			System.out.println("A data comparada é maior do que a primeira.");
			return 1;
		}
		else if (data.mes < this.mes) {
			System.out.println("A data comparada é menor do que a primeira.");
			return -1;
		}
		//Caso os meses sejam iguais, verifica qual o maior dia.
		else if (data.dia > this.dia) {
			System.out.println("A data comparada é maior do que a primeira.");
			return 1;
		}
		else if (data.dia < this.dia) {
			System.out.println("A data comparada é menor do que a primeira.");
			return -1;
		}
		else
		{
			System.out.println("Ocorreu um erro imprevisto.");
			return 2;
		}
	}
	public Data clone() {
		Data data = new Data(this.dia,this.mes,this.ano); 
		System.out.println("==========COPIA DE DATA==========");
		System.out.println("Data colocada:"+dia+"/"+mes+"/"+ano);
		System.out.println("=================================\n");
		return data;
	}
}
