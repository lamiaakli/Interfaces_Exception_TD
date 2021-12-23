package TD2;


	public class Mere implements Cloneable {
		private int i;
		private unObjet monObj;
		
		public Mere(int i, unObjet monObj) {
			this.i=i;
			this.monObj = monObj;
			
		}
		
		
		@Override
		public Object clone() {
			try {
				Mere mere = (Mere)super.clone();
				mere.monObj =(unObjet)monObj.clone();
				return mere;
			}
			catch (CloneNotSupportedException e) {
				throw new IllegalStateException(e);
			}
			
	
		}}



