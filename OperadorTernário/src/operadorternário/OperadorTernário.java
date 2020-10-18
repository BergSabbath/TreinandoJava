
package operadorternário;

import java.util.Scanner;

public class OperadorTernário {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);   
        
        
            String perg;
        do {
            System.out.print("Digite um numero: ");
        
            int num = entrada.nextInt();
            
            String Resp =((num>=10)?"Este numero e maior ou igual a 10":"Este numero e menor que 10");
                System.out.println(Resp);
            do{    
                System.out.println("Quer tentar novamente? (S/N)");
                perg = entrada.next();
                
            }while(!(perg.equals("s")) && !(perg.equals("n")));
//           
        }while(perg.equals("s"));
        
        
    }
    
}
