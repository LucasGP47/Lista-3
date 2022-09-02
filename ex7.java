import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
	
		int a, b, x = 0 ;
		
		a = entrada.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		
		b = entrada.nextInt();
		
		for (x = a + 1; x < b; x++ ) {
			System.out.println(x);
			 entrada.close();
		}
		
		
		
	}

}
