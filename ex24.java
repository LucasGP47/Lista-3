import java.util.Scanner; 

public class ex24 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor, valorm, soma = 0;
		
		System.out.println("Informe a quantidade de cds ");
		
		int q = entrada.nextInt();
		
		for (int x = 0; x < q; x++) {
			System.out.println("Informe o preço do cd " + (x+1));
			valor = entrada.nextInt();
			soma = soma + valor;
		}
		valorm = soma / q;
		
		System.out.println("Total Investido: " + soma);
		System.out.println("Media por cd: " + valorm);
		entrada.close();
}
}
