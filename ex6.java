import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 0;
		
		for (x = 0; x <= 50; x++) {
			
			if ((x % 2) != 0) {
				System.out.print(x + "; ");
			}
			entrada.close();	
		}
			
		
		
	}

}
