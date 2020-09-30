package Pilha;

public class Nodo {
	
	//Variaveis Global
    private Nodo back_Nodo;
    private Nodo next_Nodo;
    private Passageiro passageiro;

    //Metodo Construtor
    public Nodo( Passageiro p) {
        this.back_Nodo = null;
        this.next_Nodo = null;
        this.passageiro = p;
    }

    
    
    //Getters e Setters----------------------------------
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

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
    
    

}
