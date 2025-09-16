import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String sala = "A219";
	    String salaUsuario = "";
	    
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número da sala em que vc está: ");
		salaUsuario = scanner.next();
		
		if(salaUsuario.equals(sala)) {
		    System.out.println("Você está no caminho certo.");
		} else {
		    System.out.println("Você está perdido(a), se encontre.");
		}
		scanner.close();
	}
}