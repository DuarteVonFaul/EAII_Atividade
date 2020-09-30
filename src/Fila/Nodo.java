package Fila;

public class Nodo {
	//Variaveis Global------
    private Nodo back_Nodo;
    private Nodo next_Nodo;
    private Cliente client;
    
    //Metodo Construtor----------
    public Nodo(Cliente c) {
    	this.back_Nodo = null;
        this.next_Nodo = null;
        this.client = c;
    }
    //Getters e Setters----------------
	public Nodo getBack() {
		return back_Nodo;
	}

	public void setBack(Nodo back_Nodo) {
		this.back_Nodo = back_Nodo;
	}

	public Nodo getNext() {
		return next_Nodo;
	}

	public void setNext(Nodo next_Nodo) {
		this.next_Nodo = next_Nodo;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}
    
    
    

}
