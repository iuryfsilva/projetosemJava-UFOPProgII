package datas;


public class Principal {

	public static void main(String[] args) {
		
		Datas data1 = new Datas(31, 9, 2019);
		
		System.out.println(data1.toString());
		System.out.println("Dia: " + data1.getDia());
		System.out.println("Mes: " + data1.getMes());       
		System.out.println("Ano: " + data1.getAno());
		
		Datas data2 = new Datas();
		
		System.out.println(data2.toString());
		System.out.println("Dia: " + data2.getDia());
		System.out.println("Mes: " + data2.getMes());       
		System.out.println("Ano: " + data2.getAno());
		
		data1.avancaData();
		
		System.out.println(data1.toString());
		System.out.println("Dia: " + data1.getDia());
		System.out.println("Mes: " + data1.getMes());       
		System.out.println("Ano: " + data1.getAno());
		
	}

}
