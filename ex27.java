import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int aux = 0, valor, total = 0, q, e;
		
		while (aux == 0) {
			
			System.out.println("Informe o valor do produto: ");
			valor = entrada.nextInt();
			System.out.println("Informe a quantidade do produto: ");
			q = entrada.nextInt();
			
			total = total + (valor * q);
			System.out.println("Deseja continuar com a compra? Se sim digite 1, se nao digite 0:");
			e = entrada.nextInt();
			if (e == 0) {
				aux = aux + 1;
			}
			
			
		}
		System.out.println("Total da compra: " + total);
		entrada.close();
	}

}
