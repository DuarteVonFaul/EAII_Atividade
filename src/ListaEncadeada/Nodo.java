package ListaEncadeada;

public class Nodo {
	/**Essa Classa é o nó que vamos usar para armazenar 
	o Objeto produto e os outros nós que fazem parte da Lista**/
	
	//Variaveis Global
    private Nodo back_Nodo;
    private Nodo next_Nodo;
    private Produto produto;

    //Metodo Construtor
    public Nodo( Produto p) {
        this.back_Nodo = null;
        this.next_Nodo = null;
        this.produto = p;
    }

    //Setters e Getters ----------------
    public Nodo getBack() {
        return back_Nodo;
    }

    public void setBack(Nodo anterior) {
        this.back_Nodo = anterior;
    }

    public Nodo getnext() {
        return next_Nodo;
    }

    public void setnext(Nodo proximo) {
        this.next_Nodo = proximo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto p) {
        this.produto = p;
    }
}