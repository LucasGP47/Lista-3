import java.io.IOException;
import java.util.Scanner;

public class ex1 {
	
	
public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma nota: ");
		
		float n, nota = 0;
		
		n = entrada.nextFloat();
		
		nota = n;
		
		 do { 
			 while (nota < 0 || n > 10) {

			 System.out.println("Nota Invalida. Digite novamente");
			 System.out.println("Informe uma nota: ");		 
				n = entrada.nextFloat();
				nota = n;
		 }
		 }
			 while (nota < 0 || n > 10);
			
		
		
		
		System.out.println("Nota escolhida: " + n);
		entrada.close();
}


}

