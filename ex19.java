import java.util.Scanner;

public class ex19 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro: ");
		
		int n, y = 0, x = 0;
		
		n = entrada.nextInt();
		
		for (x = 0; x <= n; x++) {
			
			if (n % x == 0) {
				
				y = y + 1;
				x++;
								
			}
		
		
			
				
			
		}
}
}
