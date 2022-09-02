import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 0;
        
		while (x == 0) {
			
			System.out.println("Informe a populaçao do pais A: ");
			
			double a;
			
			int an = 0;
			
			a = entrada.nextInt();
			
			System.out.println("Informe a população do pais B: ");
			
			double b;
			
			b = entrada.nextInt();
			
			System.out.println("Informe a taxa de crescimento dos paises A e B respectivamente: ");
			
			float t1, t2;
			
			t1 = entrada.nextFloat();
			t2 = entrada.nextFloat();
			
			while (a > b) {
				
				a = a + (a*t1);
				b = b + (b*t2);
				an = an + 1;
						
			}
			
			System.out.println("Serao necessarios " + an + " anos para B superar A.");
			
			System.out.println("");
		}
		
        entrada.close();
        
	}

}
