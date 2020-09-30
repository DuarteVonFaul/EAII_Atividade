package Arvore;

public class Membro {
	
	private String name;
	private String Comp;
	
	public Membro(String n, String c) {
		
		this.name = n;
		this.Comp = c;
		
	}

	
	//getters e Setters ---------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComp() {
		return Comp;
	}

	public void setComp(String comp) {
		Comp = comp;
	}


	@Override
	public String toString() {
		return "Membro [name=" + name + ", Comp=" + Comp + "]";
	}
	
	

}
