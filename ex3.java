import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome de usuario: ");
		
		String nome;
		int t;
		
		nome = entrada.next();
		t = nome.length();
		
		while (t < 3) {
			System.out.println("Invalido. Nome com menos de 3 caracteres. Digite novamente");
			nome = entrada.next();
			t = nome.length();
		}
	
	    System.out.println("Informe a idade: ");
	    
	    int i;
	    
	    i = entrada.nextInt();
	    
	    do {
	    	while (i < 0 || i > 150) {
	    		System.out.println("Invalido. Idade incorreta. Digite novamente");
	    		i = entrada.nextInt();
	    	}
	    }
	    while (i < 0 || i > 150);
	
	    System.out.println("Informe o salario: ");
	    
	    int s;
	    
	    s = entrada.nextInt();
	    
	    while (s < 0) {
	    	System.out.println("Invalido. Salario menor que 0. Digite novamente");
    		s = entrada.nextInt();
	    }
	
	    System.out.println("Informe o sexo: ");
	    
	    char sexo;
	    
	    sexo = entrada.next().charAt(0);
	    
	    while (sexo != 'f' && sexo != 'm' && sexo != 'F' && sexo != 'M' ) {
	    	System.out.println("Invalido. Sexo invalido. Digite novamente");
	    	sexo = entrada.next().charAt(0);	
	    }
	
	    System.out.println("Informe o estado civil: ");
	    
	    char e;
	    
	    e = entrada.next().charAt(0);
	    
	    while (e != 's' && e != 'c' && e != 'v' && e != 'd' && e != 'S' && e != 'C' && e != 'V' && e != 'D') {
	    	System.out.println("Invalido. Estado civil invalido. Digite novamente");
	    	e = entrada.next().charAt(0);
	    }
	    
	    System.out.println("Seu nome e: " + nome);
	    System.out.println("Sua idade e: " + i);
	    System.out.println("Seu salario e: " + s);
	    System.out.println("Seu sexo e: " + sexo);
	    System.out.println("Seu estado civil e: " + e);
	    
	    entrada.close();
	
	}

}
