package classescanner;
import java.util.Scanner;

public class ClasseScanner {
   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);       
        /*Capturando int*/
        System.out.println("Digite sua idade: "); 
           int Resp = entrada.nextInt();
            
        if(Resp <= 18){
            System.out.println("Você ainda e jovem");
            }else if(Resp >18 && Resp <=30){
            System.out.println("Você ja e um adulto");
            }else{
            System.out.println("Voce ja esta velho");
        }

        /*Capturando float*/
            System.out.println("Digite um valor: "); 
           float Resp2 = entrada.nextFloat();
            
        if(Resp2 <= 18){
            System.out.println("Você ainda e jovem");
            }else if(Resp2 >18 && Resp2 <=30){
            System.out.println("Você ja e um adulto");
            }else{
            System.out.println("Voce ja esta velho");
        }
            System.out.println("Digite um numero: "); 
            int Resp3 = entrada.nextInt();
            System.out.println("Voce digitou o mumero "+ Resp3);
            
            System.out.println("Digite um nome: "); 
            int Resp4 = entrada.nextInt();
            System.out.println("Voce digitou o nome "+ Resp4);
//        entrada.nextFloat()
//        entrada.nextInt()
//        entrada.nextLine()
//        entrada.nextShort()
//        entrada.next()


    }
    
}
