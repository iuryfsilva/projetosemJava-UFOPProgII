package datas;

import java.time.LocalDate;

public class Datas {
	
	LocalDate localDate = LocalDate.now();
	
	private int dia;
	private int mes;
	private int ano;
	
	public Datas(int dia, int mes, int ano) {
		
		if(dia < 32 && dia > 0){
			this.dia = dia;
		}else {
			this.dia = 1;
		}
		
		if(mes < 13 && mes > 0){
			this.mes = mes;
		}else {
			this.mes = 1;
		}
		
		this.ano = ano;
		
	}
	
	public Datas() {
		this.dia = localDate.getDayOfMonth();
		this.mes = localDate.getMonthValue();
		this.ano = localDate.getYear();
	
	}
	
	public String toString() {
		 return(this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	public void avancaData() {
		if(this.dia < 32 && this.dia > 0) {
			this.dia++;
		}if(this.dia == 32) {
			this.dia = 1;
			this.mes++;
			if(this.mes == 13) {
				this.mes = 1;
				this.ano++;
			}
		}		
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
		
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
