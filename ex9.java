import java.util.Scanner; 

public class ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Informe o numero que deseja a tabuada: ");
		
		int n, produto, m1 = 0;
		
		n  = entrada.nextInt();
		
				
		while ( m1 >= 0 && m1 <= 10 ) {
			
			produto = m1 * n;
			System.out.println(n + " x " + m1 + " = " + produto);
			m1 = m1 + 1;
		}
		
		
		
		entrada.close();
		

	}

}
