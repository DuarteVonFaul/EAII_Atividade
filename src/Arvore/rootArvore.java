package Arvore;

public class rootArvore {
	/**arvore genealogica 3 regras:
	 * todo filho é o nó da esquerda e os irmãos o nó da direita
	 * cada nó para a esquerda é um Nivel
	 * Rezamos pra dá certo
	 * **/
	
	
	
	public static void main(String[] args) {
		Arvore a = new Arvore();
		int nivel = 0;
		//Aqui Criamos a RAiz da nossa Arvore 
		a.creat(a.getRaiz(), new Membro("Guilherme", "Kah"));
		a.imprimir();
		nivel++;
		//Agora vamos adicionar 2 Filhos
		if (!a.insert_left(a.getRaiz(), new Membro("Lucas",""), nivel))
				a.insert_right(a.getRaiz(), new Membro("Lucas",""), nivel);
		if (!a.insert_left(a.getRaiz(), new Membro("Maria",""), nivel))
				a.insert_right(a.getRaiz(), new Membro("Maria",""), nivel);
		a.imprimir();
		/**Aqui ta funcionando da Seguinte maneira
		 * 
		 *			 Guilherme - Kah
		 * 	Lucas
		 * 			Maria
		 * 
		 * 
		 * 
		 * Guilherme - Kah como rais, Lucas a Esquerda de Guilherme - Kah e Maria a Direita de Lucas, se colocarmos um 3 filho para Guilherme - kah ficaria na Direita de Maria.
		 * **/
		
	}

}
