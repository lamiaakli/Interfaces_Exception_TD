package Exception;
import java.net.URI;
import java.net.URISyntaxException;

public class TestURI {
	public static void main(String[]args) {
		String u1 = ":https://www.universita.corsica/";
		try {
		URI u1= new URI (u1);
		System.out.println("La création de l'URI s'est bien passée");
		}
		catch (URISyntaxException e){
			System.out.println("Probleme de la creation il semble que "+ u1 + 
					"ne soit pas un uri correct");
			
		}
	}
}
