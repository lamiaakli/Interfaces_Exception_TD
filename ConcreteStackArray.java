package TD1;

public class ConcreteStackArray implements Astack {
	 
	 private int [] tab;
	 private int taille = 100;
	 private int sommet = -1;
	 

	  public ConcreteStackArray (int max) {
	        taille = max;
	        sommet = 0;
	        tab = new int [taille];
	    }
	  
	 
		public ConcreteStackArray() {
		// TODO Auto-generated constructor stub
			   sommet = 0;
		        tab = new int [taille];
	}


		@Override
		public void push(Object obj) {
			// TODO Auto-generated method stub
			 if (sommet < taille ) {
				
				 tab[sommet] = (int) obj;
				 sommet ++;
				 
			 }
			
		}
			  
		  
		public Object peek() 
		{
			Object obj = null;
			if(!isEmpty()) {
				obj = tab[sommet];	
			}
			return obj;
		}
		
	


		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return sommet ==0;
		}


	


		@Override
		public Object pop() {
			Object obj = null;
			if(!isEmpty()) {
			 obj = tab[sommet];
			 sommet--;
			}
			return obj;
			}
			
		 @Override
		    public ConcreteStackArray clone() {
		        try {
		            ConcreteStackArray clone = (ConcreteStackArray) super.clone();
		            // TODO: copy mutable state here, so the clone can't change the internals of the original
		            return clone;
		        } catch (CloneNotSupportedException e) {
		            throw new AssertionError();
		        }
		 }
}