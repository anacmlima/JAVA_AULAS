package Aula05;

import java.util.Scanner;

import Aula04.Carro;

public class minhaLoja {
	public static void main(String[] args) {
		
		
		Carro meuCarro = new Carro();
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a marca do seu carro: ");
		meuCarro.setMarca(scan.nextLine());
		
		
		System.out.println("Digite o modelo do seu carro: ");
		meuCarro.setModelo(scan.nextLine());
		
		
		
		System.out.println("Seu carro é da marca " + meuCarro.getMarca() + " e do modelo "
				+ meuCarro.getModelo());
		
		scan.close();
	}
}
