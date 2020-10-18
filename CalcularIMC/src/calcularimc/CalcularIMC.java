
package calcularimc;

import java.util.Scanner;
//import 

public class CalcularIMC {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a sua altura(metros): ");
            Double altura  = entrada.nextDouble();
        
        System.out.print("Digite o seu peso(quilos): ");
            Double peso = entrada.nextDouble();
        
//        Double IMC = peso/(altura*altura);
        Double imc = peso/(Math.pow(altura,2));
//        Math.pow(altura,2);

        System.out.println("O seu IMC eh: " + imc);
        
        if(imc < 18.5){
            System.out.println("Você está abaixo do peso!");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Você está com peso normal");
        } else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Você está com sobrepeso!");
        } else if(imc >= 30.0 && imc <= 39.9){
            System.out.println("Você com obesidade!");
        } else {
             System.out.println("Você está com Obesidade Grave!");
        }
    }     
}
    

