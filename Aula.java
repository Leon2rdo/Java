
package aula;

import java.util.Scanner;


public class Aula {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um numero entre 3 e 5");
        int soma = entrada.nextInt();
        int num = 0;
        int num2 = 0;
        int total = 0;
        System.out.println("Escolha dois numeros");
        num = entrada.nextInt(); num2 = entrada.nextInt();
        
        switch (soma) {
            case 3:
                total = num+num2;
                total = total+(total*20)/100;
                System.out.println(total);
            break;
            case 4:
                total = num-num2;
                total = total+(total*20)/100;
                System.out.println(total);
            break;
            case 5:
                total = num+num;
                total = total-(total*5)/100;
                System.out.println(total);
            break;

            default:
                System.out.println("Aooo potência");      
        }       
    }  
}
