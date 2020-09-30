package Fila;

public class Cliente {

	private int Code;
	private String Pedido;
	
	//Metodo Construtor ----------------
	public Cliente(int c, String p) {
		this.Code = c;
		this.Pedido = p;
	}
	//Setters e Getters--------------
	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getPedido() {
		return Pedido;
	}

	public void setPedido(String pedido) {
		Pedido = pedido;
	}
	//ToString -----------------------
	public String toString() {
		return "Cliente [Code=" + Code + ", Pedido=" + Pedido + "]";
	}
	
}
