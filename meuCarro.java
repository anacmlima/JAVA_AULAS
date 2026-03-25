package Aula04;



public class meuCarro {
	
	
	public static void main(String[] args) {
		//Programa principal, por isso tem o main. Onde irá usar a classe{estrutura}
		
		
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();
		Carro carro03 = new Carro();
		
		carro01.setMarca("Ford");
		carro01.setModelo("Fusion");
		carro01.setCor("Preta");
//		carro01.setPlaca("OXE2G66");
		carro01.setCombustivel("flex");
		
		carro02.setMarca("Mercedez");
		carro02.setModelo("Classe C Sedan");
		carro02.setCor("Rosa");
		carro02.setPlaca("OXE3G67");
		carro02.setCombustivel("flex");
		
		carro03.setMarca("Toyota");
		carro03.setModelo("Corolla");
		carro03.setCor("Azul");
		carro03.setPlaca("OXE4G68");
		carro03.setCombustivel("flex");
		
		System.out.println("Carros do meu estoque: " + 
		                    carro01.getPlaca() + ", " +
				            carro02.getPlaca() + ", " +
		                    carro03.getPlaca());  
	}

}
