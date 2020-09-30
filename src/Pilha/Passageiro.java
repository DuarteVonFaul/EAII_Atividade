package Pilha;

public class Passageiro {
	
	private String name;
	private int chair_Code;
	
	
	public Passageiro (String n, int cc) {
		this.name = n;
		this.chair_Code = cc;
	}

	//Getters e Setters -------------------------
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getChair_Code() {
		return chair_Code;
	}


	public void setChair_Code(int chair_Code) {
		this.chair_Code = chair_Code;
	}

	//Tostring -----------------------------------------
	public String toString() {
		return "Passageiro [name=" + name + ", chair_Code=" + chair_Code + "]";
	}
	
	

}
