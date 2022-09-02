import java.io.IOException;
import java.util.Scanner; 

public class ex2 {
	
public static void main(String[] args) throws IOException {
	
	Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o nome de usuario: ");

    String nome, senha;
    
    nome = entrada.next();
    
    System.out.println("Agora informe a senha: ");
    
    senha = entrada.next();
    
    while (nome.contains(senha)) {
    	System.out.println("Invalido. Nome de usuario igual a senha. Digite novamente.");
    	System.out.println("");
    	System.out.println("Informe o nome de usuario: ");
        
        nome = entrada.next();
        
        System.out.println("Agora informe a senha: ");
        
        senha = entrada.next();
    }
   System.out.println("");
    System.out.println("Dados cadastrados!");
    entrada.close();

}
}