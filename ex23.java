import java.util.Scanner; 

public class ex23 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de turmas: ");
        int t = entrada.nextInt();
        int a, soma = 0, media;
        for (int x = 0; x < t; x++) {
        	System.out.println("Informe o numero de alunos na turma " + (x+1));
        	a = entrada.nextInt();
        	soma = soma + a;
        	
        	if (a > 40) {
        		break;
        	}
        }
	media = soma / t;
	System.out.println("A media e " + media);
	entrada.close();
}	
}
