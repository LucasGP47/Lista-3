import java.util.Scanner; 

public class ex21 { 
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero de pessoas: ");
		
		int n = entrada.nextInt();
		int i, soma = 0;
		float media; 
		
		for (int x = 0; x < n; x++) {
			System.out.println("Informe a idade da pessoa " + (x+1));
			i = entrada.nextInt();
			soma = soma + i;
		}
		
		media = soma / n;
		
		if (media < 25) {
			System.out.println("Turma Jovem");
		}
		
		if (media > 25 && media < 60) {
			System.out.println("Turma adulta");
		}
		
		if (media > 60) {
			System.out.println("Turma Idosa");
		}
		entrada.close();
}
}
