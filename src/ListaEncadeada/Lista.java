package ListaEncadeada;

public class Lista {
	/** A classe Lista é a TAD com as funções genericas de Lista**/
	
    private Nodo first_Nodo;//Aqui vamos ter o Caminho para o Primeiro Obj da Lista
    private Nodo last_Nodo;//Aqui vamos ter o Caminho para o Ultimo Obj da Lista
    private int length;//Aqui Vamos ter o tamanho da Lista

   //O metodo Construtor cria uma Lista vazia 
  public Lista() {
      this.first_Nodo = null;
      this.last_Nodo = null;
      this.length = 0;
  }
  
  //O metodo Insert_First vai criar um novo nó que vai armazenar um Objeto produto e colocar no Inicio da Lista
 /**
  * 1º Se a lista estiver vazia ele vai ser colocado como o primeiro da Lista e em ultimo da Lista
  * 2º Se a lista ja tiver alguem no começo dela, ela vai entrar no Nó dizer que o anterior desse Nó 
  * É esse novo nó que estamos querendo coloar e que o próximo desse novo nó é o que anteriormente estava
  * em primeiro da Lista
  * 
  * **/
 public void insert_First(Produto p){
     Nodo new_Nodo = new Nodo (p);
     if(first_Nodo==null&& last_Nodo ==null) {
        first_Nodo = new_Nodo;
        last_Nodo = new_Nodo;
     }
     else{
    	 new_Nodo.setnext(first_Nodo);
      first_Nodo.setBack(new_Nodo);
      first_Nodo = new_Nodo;
     }
     length ++;
 }
 
 //O metodo Insert_Last vai criar um novo nó que vai armazenar um Objeto produto e colocar no Final da Lista
 public void insert_Last(Produto p) {
     if (first_Nodo==null&& last_Nodo ==null){
       insert_First(p);
      } else {
       Nodo new_Nodo = new Nodo (p);
       last_Nodo.setnext(new_Nodo);
       last_Nodo = new_Nodo;
       new_Nodo.setBack(last_Nodo);
       length ++;
      }
 }
 
 //O metodo Insert_Last vai criar um novo nó que vai armazenar um Objeto produto e colocar em qualquer posição da Lista
 public void insert_Random (int pos, Produto p){
     if(pos==0 || first_Nodo==null){
       insert_First(p);
     }
     else if(length== pos){
         insert_Last(p);
     }
     else{
        Nodo new_Nodo = new Nodo (p);
        Nodo anterior = search_Pos(pos-1);
        Nodo proximo = anterior.getnext();
        new_Nodo.setnext(proximo);
        new_Nodo.setBack(anterior);

          anterior.setnext(new_Nodo);
          proximo.setBack(new_Nodo);
          length++;
     }
 }
 
 	//Nesse metodo fazemos uma pesquisa pela posição desse objeto na Lista
     public Nodo search_Pos(int pos) {
      Nodo current = first_Nodo;
      if(pos <= length) {
    	  for (int i = 0; i < pos; i++) {
        	  current = current.getnext();
          }
          return current;	
      }
      return null;
      
  }
     
    //Aqui removemos o primeiro nó da Lista
    public void remove_Firts() {
      first_Nodo = first_Nodo.getnext();
      first_Nodo.setBack(null);
      length--;
  }
    //Aqui removemos o Ultimo nó da Lista
      public void remove_Last() {
      Nodo penultimo = last_Nodo.getBack();
      penultimo.setnext(null);
      last_Nodo = penultimo;
      last_Nodo.setnext(null);
      length--;
  }
      // E aqui removemos o Nó de qualquer posição da Lista
      public void remove(int posi){
         if(posi==0 || first_Nodo==null){
           remove_Firts();
         }
         else if(posi<=length){
             remove_Last();
         }
         else{
         Nodo proximo = search_Pos(posi+1);
         Nodo anterior= search_Pos(posi-1);
         
         anterior.setnext(proximo);
         anterior.setBack(anterior);
         
         proximo.setnext(proximo);
         proximo.setBack(anterior);
         length--;
         
         }
      }
      //Aqui Imprimimos toda a Lista
     public void all_Print(){
         Nodo atual = this.first_Nodo;
      for (int i = 0; i < length; i++) {
          System.out.print(atual.getProduto().toString() +"\n");
          atual = atual.getnext();
      }    
      System.out.println(" ");
     }
     
     //Aqui imprimimos um Objeto especifico da Lista baseado na Posição dele na mesma
     public void Print(int pos){
         Nodo current = this.first_Nodo;
         if (pos <= this.length) {
         	for (int i = 0; i < pos; i++) 
         		current = current.getnext();
         	System.out.print(current.getProduto().toString() +"\n");
         	
         }else 
        	 System.out.print("Não tem Nó nesta posição" +"\n");
     }
}
