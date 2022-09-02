import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantia de paes: ");
		int q = entrada.nextInt();
		
		int quan;
		double total = 0;
		
		for (int x = 0; x < q; x++) {
			System.out.println("Informe a quantidade de paes comprados: ");
			quan = entrada.nextInt();
			System.out.println((x+1) + " - " + (quan * 0.18));
			
			total = total + (quan * 0.18);
			
		}

		System.out.println("O total e " + total);
		entrada.close();
		
	}

}
