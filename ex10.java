import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a base: ");
		
		int a, b, produto = 1, produto1, x;
		
		x = 1;
		
		a = entrada.nextInt();
		
		System.out.println("Informe o expoente: ");
		
		b = entrada.nextInt();
		
		
		for (x = 1; x <= b; x++) {	
			
		    produto1 = a * x;
		    
		    entrada.close(); 
	}
		System.out.println("O resultado e: " + produto);
		
	}

}
