package Pilha;

public class Pilha {
	
   private Nodo first_Nodo;//Aqui vamos ter o Caminho para obj que ta no topo
   private Nodo last_Nodo;//Aqui vamos ter o Caminho para obj que ta na base
   private int length;//Aqui Vamos ter o tamanho da Pilha

   //O metodo Construtor cria uma Lista vazia 
   public Pilha() {
      this.first_Nodo = null;
      this.last_Nodo = null;
      this.length = 0;
    }

    //Inserir um novo no Sempre como primeiro(topo) da Pilha
	public void insert(Passageiro p){
	     Nodo new_Nodo = new Nodo (p);
	     if(first_Nodo==null&& last_Nodo ==null) {
	        first_Nodo = new_Nodo;
	        last_Nodo = new_Nodo;
	     }
	     else{
	    	 new_Nodo.setNext(first_Nodo);
	      first_Nodo.setBack(new_Nodo);
	      first_Nodo = new_Nodo;
	     }
	     length ++;
	 }
	 
	//Aqui removemos o nó que ta no topo da Pilha -------------------------------------
	public void remove() {
	      first_Nodo = first_Nodo.getNext();
	      first_Nodo.setBack(null);
	      length--;
	 }
	
	//Aqui Imprimimos toda a Fila -----------------------------------------------------
	public void all_Print(){
	       Nodo current = this.first_Nodo;
	    for (int i = 0; i < length; i++) {
	        System.out.print(current.getPassageiro().toString() +"\n");
	        current = current.getNext();
	}    
	System.out.println(" ");
	}
	   
	//Aqui imprimimos um Objeto especifico da Fila baseado na Posição dele na mesma ------
	public void Print(int pos){
	       Nodo current = this.first_Nodo;
	       if (pos <= this.length) {
	       	for (int i = 0; i < pos; i++) 
	       		current = current.getNext();
	       	System.out.print(current.getPassageiro().toString() +"\n");
	   	
	}else 
	  	 System.out.print("Não tem Nó nesta posição" +"\n");
	}

	
	//Getters e Setters ------------------------------------------
	public Nodo getFirst_Nodo() {
		return first_Nodo;
	}

	public void setFirst_Nodo(Nodo first_Nodo) {
		this.first_Nodo = first_Nodo;
	}

	public Nodo getLast_Nodo() {
		return last_Nodo;
	}

	public void setLast_Nodo(Nodo last_Nodo) {
		this.last_Nodo = last_Nodo;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
	

}
