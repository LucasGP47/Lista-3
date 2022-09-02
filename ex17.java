import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero que deseja conferir: ");
        
		int n, aux =1, p = 0;
		
		n = entrada.nextInt();
		
		for (aux = 1; aux <= n; aux++) {
		
		   if (n % aux == 0) {
			System.out.println("Divisivel por " + aux);
			p = p + 1;
			
			entrada.close();
		   }	
		}
		if (p > 2) {
			System.out.println("Nao e primo");
		}
		
		else {
			System.out.println("E primo");
		}
		
	}

}
