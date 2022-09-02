import java.util.Scanner;

public class ex13 { 
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero que deseja o fatorial: ");
		
		int n, aux;
		
		n = entrada.nextInt();
		
		aux = n;
		
		
		
		
		while (n >= 2) {
			 
			n = n - 1;
		    aux = aux * n;
			
			System.out.println(n);
		}
		
		System.out.println(aux);
		
		entrada.close();
}
}
