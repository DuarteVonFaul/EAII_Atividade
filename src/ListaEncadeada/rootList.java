package ListaEncadeada;

import java.util.Scanner;

public class rootList {
	/** Situação: Sistema para crianção de uma Lista de produtos**/
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		while(true) {
			
			Menu();
			int input = sc.nextInt();
					
			switch(input) {
					
				case 1:
					System.out.println("Nome");
					String n = sc.nextLine();
					n = sc.nextLine();
					System.out.println("Codigo");
					int c = sc.nextInt();
					Produto p = new Produto(n,c);
					l.insert_First(p);
					
					break;
				case 2:
					System.out.println("Nome");
					n = sc.nextLine();
					n = sc.nextLine();
					System.out.println("Codigo");
					c = sc.nextInt();
					p = new Produto(n,c);
					l.insert_Last(p);
					
					break;
				case 3:
					System.out.println("Nome");
					n = sc.nextLine();
					n = sc.nextLine();
					System.out.println("Codigo");
					c = sc.nextInt();
					System.out.println("Posição na Lista");
					int pos = sc.nextInt();
					p = new Produto(n,c);
					l.insert_Random(pos, p);
					break;
				case 4:
					System.out.println("Removido");
					l.remove_Firts();
					l.all_Print();
					break;
				case 5:
					System.out.println("Removido");
					l.remove_Last();
					l.all_Print();
					break;
				case 6:
					System.out.println("Posição na Lista");
					pos = sc.nextInt();
					System.out.println("Removido");
					l.remove(pos);
					l.all_Print();
					break;
				case 7:
					l.all_Print();
					break;
				case 8:
					System.out.println("Posição na Lista");
					pos = sc.nextInt();
					l.Print(pos);;
					break;
			}
			
			
			
			
			
		}
		
	}
	
	
	
	public static void Menu() {
		System.out.println("Escolha uma Funcionalidade: "
				+ "\n 1- Adicionar Produto no inicio d/Lista "
				+ "\n 2- Adicionar Produto no Final d/Lista"
				+ "\n 3- Adicionar Produto em qualquer lugar d/Lista "
				+ "\n 4- remover Produto no inicio d/Lista"
				+ "\n 5- remover Produto no Final d/Lista"
				+ "\n 6- remover Produto de qualquer Lugar d/Lista"
				+ "\n 7- Imprimir toda a Lista"
				+ "\n 8- Imprimir um Produto em especifico");
	}
			
	

}
