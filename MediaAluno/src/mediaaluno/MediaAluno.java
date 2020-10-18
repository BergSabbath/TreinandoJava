package mediaaluno;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        
        System.out.print("Digite a 1ª nota do aluno: ");
            nota1 = entrada.nextDouble();
        System.out.print("Digite a 2ª nota do aluno: ");
            nota2 = entrada.nextDouble();
        System.out.print("Digite a 3ª nota do aluno: ");
            nota3 = entrada.nextDouble();
        media= (nota1+nota2+nota3)/3;
        
        System.out.println("A media do aluno é: "+ media) ;
           
    }
    
}
