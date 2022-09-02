import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do conjunto: ");
		
		int t, x = 1, n = 0, soma = 0;
		
		int menor = 100000000;
		int maior = -100000000;		
		
		t = entrada.nextInt();
		
		while (x <= t) {
			
		System.out.println("Informe um numero");
		n = entrada.nextInt();
		x = x + 1;
		
		if (n > maior) {
			maior = n;
		}
		
        if (n < menor ) {
        	menor = n;
        }
		
        soma = soma + n;
		}
		
		System.out.println("O maior e: " + maior + ". O menor e: " + menor + ". A soma e: " + soma);
		entrada.close();
	}

}
