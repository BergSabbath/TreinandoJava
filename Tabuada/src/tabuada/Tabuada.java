
package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    System.out.println("Digite um número para saber a sua tabuada de 1 a 10");
        int num = entrada.nextInt();
    int i = 1 ; 
    
    while(i <=10){
       int Resul = i * num;
       
    System.out.println(i + " x " +num+ " = "+Resul);
            
       i++;
   }
    
    }
    
}
