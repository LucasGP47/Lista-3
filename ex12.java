import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe ate qual termo quer que a sequencia va: ");
        
		int x, proximo = 0, anterior = 0;
		
		x = entrada.nextInt();

				while(proximo <= x) {
					
				  System.out.println(proximo);
				  
				  proximo = proximo + anterior;
				  
				  anterior = proximo - anterior;
				  
				   if(proximo == 0) {
					   
					  proximo = proximo + 1;
					  
				   }
				   entrada.close();
				}
				}

}
