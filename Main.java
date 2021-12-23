package TD1;

public class Main {
	public static void main(String [] args) {
		
		ConcreteStackArray P = new ConcreteStackArray();
		
		System.out.println(P.isEmpty());
		P.push(4);
		P.push(8);
		System.out.println(P.isEmpty());
		System.out.println(P.pop());
		System.out.println(P.pop());
		System.out.println(P.pop());
		
		
	}
}
