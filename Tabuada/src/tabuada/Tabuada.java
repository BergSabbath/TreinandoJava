
package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //utilizando While
        System.out.println("(while)\n Digite um número para saber a sua tabuada de 1 a 10:");
        int num = entrada.nextInt();
        int i = 1 ; 
        while(i <=10){
        int Resul = num * i;
       
        System.out.println(num + " x " +i+ " = "+Resul);
            
        i++;
        }
        //utilizando do-while
        int o =1;
        System.out.println("(do-while)\n Digite outro numero: ");
        int num2 = entrada.nextInt();
        do{
           int Resul2 = num2 * o;
           
           System.out.println(num2 + " x " + o +" = "+ Resul2);
           o++;           
        }while(o <= 10);
        
        //utlizando for
        System.out.println("(for)\n Digite mais outro numero: ");
        int num3 = entrada.nextInt();
        for(int e = 1; e < 11; e++){
            int Resul3 = num3 * e;
          System.out.println(num3 +" x "+ e +" = "+ Resul3);
        }
        
    
    }
    
    
    
}
