package Arvore;

public class Nodo {
	private Nodo raiz;
    private Nodo esquerda;
    private Nodo direita;
    private Membro membro;
    private int nivel;

    public Nodo(Membro membro, int n, Nodo r) {
        this.esquerda = null;
        this.direita = null;
        this.membro = membro;
        this.nivel = n;
        this.raiz = r;
    }


    public Nodo getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Nodo esquerda) {
        this.esquerda = esquerda;
    }

    public Nodo getDireita() {
        return direita;
    }

    public void setDireita(Nodo direita) {
        this.direita = direita;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
    
    
    
}