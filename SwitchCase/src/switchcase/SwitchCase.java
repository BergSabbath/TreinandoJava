
package switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o seu dia da semana favorito? ");
        System.out.println("Para Domingo digite (1)\n"
                + "Para Segunda digite (2)\n"
                + "Para Terça digite (3) \n"
                + "para Quarta digite (4)\n"
                + "Para Quinta digite (5)\n"
                + "Para Sexta digite (6) \n"
                + "Para Sabado digite (7)\n"
                + "Se voce não gosta de dia nenhuma aperte um numero"
                + "diferente dos anteriores");
        
            int dia  = entrada.nextInt();
            
        switch(dia){
            case 1:
               System.out.println("Seu dia preferido é Domingo");
               break;
            case 2:
               System.out.println("Seu dia preferido é Segunda");
               break;
            case 3:
               System.out.println("Seu dia preferido é Terça");
               break;
            case 4:
               System.out.println("Seu dia preferido é Quarta");
               break;
            case 5:
               System.out.println("Seu dia preferido é Quinta");
               break;
            case 6:  
               System.out.println("Seu dia preferido é Sexta");
               break;
            case 7:
               System.out.println("Seu dia preferido é Sabado");
               break;
            default:
               System.out.println("Você não gosta de nenhum dia da semana");
        }
       
    }
    
}
