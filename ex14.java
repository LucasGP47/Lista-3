import java.util.Scanner; 

public class ex14 {

	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numerador e o denominador: ");
		
		int num, den, x = 0, y = 1;
		
		num = entrada.nextInt();
		den = entrada.nextInt();
		
		for (x = 0; x < num; x++ ) {
			
			System.out.print(1 + x + "/" + y);
			System.out.println("");
			y = y+2;
			entrada.close();
			if (y > den) {
				y = y-2;
			}
		}
		
		entrada.close();
		
	
		
		
		
		
}
}
