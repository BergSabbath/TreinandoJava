
package calcularidade;

import java.util.Scanner;

public class CalcularIdade {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano do seu nascimento:");
        
        int anoNasc = entrada.nextInt();
        
        System.out.print("Digite o ano atual:");
        
        int anoAtual = entrada.nextInt();
        
        
        int idade = anoAtual - anoNasc;
        
        
        System.out.println("você terá em "+anoAtual+ " "+idade+" anos");

        
    }
    
}
