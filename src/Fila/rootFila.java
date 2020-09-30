package Fila;

import java.util.Scanner;

public class rootFila {
	/** Situação: Sistema para Controle de uma Fila de Clientes/Pedidos**/
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Fila f = new Fila();
		int cod = 0;
		while(true){
			Menu();
			int input = sc.nextInt();
			
			switch(input) {
				case 1:
					System.out.println("Lista de Pedido" 
							+ "\nFila com Fritas - b012"
							+ "\nXturbo - b027"
							+ "\nSuco de Laranja - b035"
							+ "\nCoca Cola 1 litro - b072"
							+ "\nInserir Codigo do Pedido");
					String p = sc.nextLine();
					p = sc.nextLine();
					cod++;
					Cliente c = new Cliente(cod,p);
					f.insert(c);
					break;
				case 2:
					System.out.println("Pedido entregue");
					f.Print(0);
					f.remove();
					break;
				case 3:
					f.all_Print();
					break;
				case 4:
					System.out.println("Qual a Senho do Cliente ?");
					int pos = sc.nextInt();
					f.Print(pos);
					break;
			}
			
			
			
		}
		
		
		
}
	
	
	public static void Menu() {
		System.out.println("Escolha uma Funcionalidade: "
				+ "\n 1- Gerar Pedido para um Novo Cliente"
				+ "\n 2- Entregar Pedido Finalizado"
				+ "\n 3- Imprimir Lista de Pedidos"
				+ "\n 4- Imprimir um pedido Especifico ");
	}
		
}

