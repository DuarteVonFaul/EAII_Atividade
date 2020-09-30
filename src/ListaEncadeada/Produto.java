package ListaEncadeada;

public class Produto {
	/** Essa Classe é o modelo do Objeto Produto**/
	
	
	//Variaveis Global
	 int cod;
	 String name;
	 
	 //Metodo construtor
	 public Produto(String n, int c) {
		 this.cod = c;
		 this.name = n;
	 }
	 
	 
	 //Setters e Getters ---------------------
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//ToString -----------------------------
	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", name=" + name + "]";
	}

}
