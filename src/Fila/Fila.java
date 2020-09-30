package Fila;

public class Fila {
	private Nodo first_Nodo;//Aqui vamos ter o Caminho para o Primeiro Obj da fila
    private Nodo last_Nodo;//Aqui vamos ter o Caminho para o Ultimo Obj da fila
    private int length;//Aqui Vamos ter o tamanho da Lista

   //O metodo Construtor cria uma fila vazia -----------------------------------------
	public Fila() {
	      this.first_Nodo = null;
	      this.last_Nodo = null;
	      this.length = 0;
	}

	  //Aqui inserimos um nó sempre no final da fila ------------------------------------
	public void insert(Cliente c) {
		Nodo new_Nodo = new Nodo(c);
	     if (first_Nodo==null&& last_Nodo ==null){
	    	 if(first_Nodo==null&& last_Nodo ==null) {
	    	        first_Nodo = new_Nodo;
	    	        last_Nodo = new_Nodo;
	    	     }
		     else{
		    	 new_Nodo.setNext(first_Nodo);
		      first_Nodo.setBack(new_Nodo);
		      first_Nodo = new_Nodo;
		     }
	      } else {
	       new_Nodo = new Nodo (c);
	       last_Nodo.setNext(new_Nodo);
	       last_Nodo = new_Nodo;
	       new_Nodo.setBack(last_Nodo);
	      }
	    length ++;
	}
		
	//Nesse metodo fazemos uma pesquisa pela posição desse objeto na fila ----------------
	    public Nodo search_Pos(int pos) {
	     Nodo current = first_Nodo;
	     if(pos <= length) {
	   	  for (int i = 0; i < pos; i++) {
	       	  current = current.getNext();
	         }
	         return current;	
	     }
	     return null;
	     
	 }
	
		
	//Aqui removemos o primeiro nó da Fila -------------------------------------
	public void remove() {
	      first_Nodo = first_Nodo.getNext();
	      first_Nodo.setBack(null);
	      length--;
	 }
	   
	//Aqui Imprimimos toda a Fila -------------------------------------------
	public void all_Print(){
		Nodo current = this.first_Nodo;
	    for (int i = 0; i < length; i++) {
	        System.out.print(current.getClient().toString() +"\n");
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
	       	System.out.print(current.getClient().toString() +"\n");
	   	
	}else 
	  	 System.out.print("Não tem Nó nesta posição" +"\n");
	}
		
	
	

}
