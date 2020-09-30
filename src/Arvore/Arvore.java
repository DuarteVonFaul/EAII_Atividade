package Arvore;

public class Arvore {
		private static Nodo raiz;
	   private Nodo no;
	   private int quant;

	    public Arvore() {
	        this.no = null;
	        this.quant = 0;
	    }
	    
	    
	    
	    public void creat(Nodo n, Membro a) {
	    	if(n == null) {
	    		raiz = new Nodo(a,0,null);
	            this.quant = 1;
	    	}
	    }
	    
	    public void insert(Nodo n, Membro a) {
	    	int i = 1;
	    	if(n==null) {
	    		raiz = new Nodo(a,0,null);
	            this.quant = 1;
	    	}else {
	    		if (n.getEsquerda() == null) {
	    			 insert_left(n,a,i);
	    		}else if (n.getDireita() == null) {
	    			insert_right(n,a,i);
	    			
	    		}else if (n.getRaiz() != null){
	    			if (n.getRaiz().getDireita() != null) {
		    			if (n.getRaiz().getDireita().getEsquerda() == null)
			    			 insert_left(n.getRaiz().getDireita(),a,i);
		    			else if (n.getRaiz().getDireita().getDireita() == null)
			    			insert_right(n.getRaiz().getDireita(),a,i);
	    			}
	    			
	    		} else {
	    			insert(n.getEsquerda(),a);
	    		}
	    		
	    	}
	    	
	    	
	    }
	    
	    public boolean insert_left(Nodo n, Membro a,int v) {
	    	if(n==null) {
	    		raiz = new Nodo(a,0,null);
	            this.quant = 1;
	            return true;
	    	}else {
	    		if (n.getEsquerda() == null) {
	    			 n.setEsquerda(new Nodo(a,v,n));
	    			 this.quant++;
	    			 return true;
                }
	    		
	    	}
	    	return false;
	    }
	    
	    public boolean insert_right(Nodo n, Membro a, int v) {
	    	if(n==null) {
	    		raiz = new Nodo(a,0,null);
	            this.quant = 1;
	            return true;
	    	} else {
	    		if (n.getDireita() == null) {
	    			 n.setDireita(new Nodo(a,v,n));
	    			 this.quant++;
	    			 return true;
                }
	    	}
	    	return false;
	    }
	    
	    
	    
	    
	    
	    
	    
	     public void imprimirEmOrdem(Nodo n) {
	        if (n != null) {
	            imprimirEmOrdem(n.getEsquerda());
	            System.out.print(n.getMembro().toString()+ " \n");
	            imprimirEmOrdem(n.getDireita());
	        }
	    }
	      public void imprimirPreOrdem(Nodo n) {
	        if (n != null) {
	            System.out.print(n.getMembro().toString()+ "\n ");
	            imprimirPreOrdem(n.getEsquerda());
	            imprimirPreOrdem(n.getDireita());
	        }
	       
	    }
	   public void imprimirPosOrdem(Nodo n) {
	        if (n != null) {
	            imprimirEmOrdem(n.getEsquerda());
	            imprimirEmOrdem(n.getDireita());
	            System.out.print(n.getMembro().toString()+ " \n");
	        }
	    }
	    public void imprimir(){
	     // imprimirEmOrdem(raiz); 
	     imprimirPreOrdem(raiz);
	    //imprimirPosOrdem(raiz);
	    }


	    //Getters e Setters
		public static Nodo getRaiz() {
			return raiz;
		}



		public static void setRaiz(Nodo raiz) {
			Arvore.raiz = raiz;
		}



		public Nodo getNo() {
			return no;
		}



		public void setNo(Nodo no) {
			this.no = no;
		}



		public int getQuant() {
			return quant;
		}



		public void setQuant(int quant) {
			this.quant = quant;
		}
	    
	    
	    
	    
	}

