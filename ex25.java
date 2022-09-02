import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		int p = 0;
		
		System.out.println("Informe a quantidade de produtos comprados: ");
		int q = entrada.nextInt();
		
		for (int x = 0; x <= q - 1; x++){
			
			System.out.println("Informe o produto comprado: ");
			p = entrada.nextInt();	
			System.out.println((x+1) + " - " + (p * 1.98));
			total = total + (p * 1.98);
		}
		
		
		
		
		
		
		System.out.println("Valor total: " + total );
		entrada.close();
		
	}

}
