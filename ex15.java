
public class ex15 {
public static void main(String[] args) {
		
		
		int x = 0, s, y, resultado = 0; 
		
		s = 38;
		y = 39;
	    int b = 1;
	    
	    
	    
		for (x = 0; x < 37; x++ ) {
			
			s = s - 1;
			y = y - 1;
			b = x + 1;
			
			System.out.println("(" + s + " * " + y + ")/" + b);
			
			resultado = (s*y) / b + resultado;
			
		}
		
		System.out.println("O resultado e: " + resultado);
		
}
}
