import java.util.Scanner;

public class ex11 {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe dez numeros inteiros: ");
	
	int x=0, n;
	
	while (x < 10) {
		
		n = entrada.nextInt();
		
		if (n % 2 != 0) {
			
			System.out.println("numero impar: " + n + "; ");
		}
		
		else {
			System.out.println("numero par: " + n + "; ");
		}
		
		x = x + 1;
		
	}
	System.out.println("Execução terminada.");
	entrada.close();
	}	
}
