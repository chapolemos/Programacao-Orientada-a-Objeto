package lista;

import java.util.Arrays;

public class Voo {
	int numero;
	boolean cadeirasOcupadas[];
	int hora;
	int minutos;
	Data data;
	Voo(int numero, int cadeiras, int hora, int minutos, Data data){
		this.numero = numero;
		this.hora = hora;
		this.minutos = minutos;
		this.data = data;
		this.cadeirasOcupadas = new boolean[cadeiras];
		
		
		System.out.println("==========REGISTRO DE VOO==========");
		System.out.println("Voo nº "+this.numero+" criado");
		System.out.println("Data:"+this.data.dia+"/"+this.data.mes+"/"+this.data.ano);
		System.out.println("Hora:"+this.hora+":"+this.minutos);
		
		System.out.println("===================================\n");
	}	
	public boolean ocupa(int cadeira) {
		if (this.cadeirasOcupadas[cadeira] == true) {
			System.out.println("Cadeira "+cadeira+" não pôde ser ocupada.\n");
			return false;
		}
		else {
			System.out.println("Cadeira numero "+cadeira+" foi ocupada com sucesso.\n");
			this.cadeirasOcupadas[cadeira] = true;
			return true;
		}
			
	}
	
	public boolean verifica (int cadeira) {
		if (this.cadeirasOcupadas[cadeira] == true) {
			System.out.println("Cadeira "+cadeira+" esta ocupada.\n");
			return false;
		}
		else {
			System.out.println("Cadeira numero "+cadeira+" está livre.\n");
			return true;
		}
	}
	
	public void todasCadeiras() {
		System.out.println("==========LISTA DE CADEIRAS==========");
		for (int i = 0;i<this.cadeirasOcupadas.length;i++)
			if (this.cadeirasOcupadas[i] == false)
				System.out.println("Cadeira numero "+i+" esta livre.\n");
			else
				System.out.println("Cadeira numero "+i+" esta ocupada.\n ");
			
		System.out.println("====================================\n");
	}
	

	public int proximaLivre() {
		for (int i = 0; i<this.cadeirasOcupadas.length;i++) {
			if (this.cadeirasOcupadas[i] == false) {
				System.out.println("A proxima cadeira livre é: "+i+"\n");
				return i;
			}
		}
		System.out.println("Erro inesperado, encerrando programa.");
		return -1;
	}
	public int getVoo() {
		System.out.println("Este é o vôo de número: "+this.numero+"\n");
		return this.numero;
	}
	public Data getData() {
		System.out.println("Este vôo foi realizado em:"+this.data.dia+"/"+this.data.mes+"/"+this.data.ano+"\n");
		return this.data;
	}
	
	public int vagas() {
		int vagas = 0;
		for (int i = 0;i<this.cadeirasOcupadas.length;i++)
			if (this.cadeirasOcupadas[i] == false)
				vagas++;
		System.out.println("Vagas restantes: "+vagas+"\n");
		return vagas;
	}
	
	public Voo clone() {
		Voo voo = new Voo(this.numero, this.cadeirasOcupadas.length, this.hora, this.minutos, this.data);
		voo.cadeirasOcupadas = Arrays.copyOf(this.cadeirasOcupadas, this.cadeirasOcupadas.length);
		return voo;
	}
		
}
