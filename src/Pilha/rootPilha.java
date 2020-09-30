package Pilha;

import java.util.Scanner;

public class rootPilha {
	/**Situa��o: Para um controle de Chamada de Embarque  e Desembarque
	 * regra 1� O primeiro a Entrar senta na Ultima poltrona do Avi�o
	 * regra 2� O primeiro a Sair sempre � quem ta sentado na primeira poltrona do Avi�o **/
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		int Lim_Passageiros = 60;
		int poltrona = 60;
		while(true){
			Menu();
			int input = sc.nextInt();
			
			switch(input) {
				case 1:
					if(p.getLength() < Lim_Passageiros) {
						System.out.println("Nome do passageiro");
						String n = sc.nextLine();
						n = sc.nextLine();
						Passageiro passageiro = new Passageiro(n,poltrona);
						p.insert(passageiro);
						poltrona--;
					}else 
						System.out.println("N�o tem mais vagas no Avi�o");
					break;
				case 2:
					System.out.println("Passageiro Desembarcado");
					p.Print(0);
					p.remove();
					break;
				case 3:
					p.all_Print();
					break;
				case 4:
					System.out.println("Qual a poltrona do Passageiro");
					int pos = sc.nextInt();
					p.Print((Lim_Passageiros - pos));
					break;
			}
			
			
			
		}
		
		
		
}
	
	
	public static void Menu() {
		System.out.println("Escolha uma Funcionalidade: "
				+ "\n 1- Embarcar Passageiro "
				+ "\n 2- Desembarcar Passageiro"
				+ "\n 3- Lista de Passageiros no Onibus"
				+ "\n 4- Mostrar Poltrona se tem passageiros ou n�o");
	}
	

}
