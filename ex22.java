import java.util.Scanner; 

public class ex22 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero de votantes: ");
		
		int v = entrada.nextInt();
		int c1 = 0, c2 = 0, c3 = 0;
		int voto;
		
		for (int x = 0; x < v; x++) {
			
			System.out.println("Informe o voto do votante " + (x+1) + " com apenas 1, 2, 3");
			voto = entrada.nextInt();
			
			if (voto == 1) {
				c1 = c1 + 1;
			}
			if (voto == 2) {
				c2 = c2 + 1;
			}
			if (voto == 3) {
				c3 = c3 + 1;
			}
			
		}
		
		System.out.println("O numero de votos no candidato 1 foi: " + c1 );
		System.out.println("O numero de votos no candidato 2 foi: " + c2 );
		System.out.println("O numero de votos no candidato 3 foi: " + c3 );
		
		entrada.close();
}
}
