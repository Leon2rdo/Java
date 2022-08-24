
package aula;

import java.util.Scanner;


public class carro {
    
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int carros = 0;
        double salario = 1000;
        
        System.out.println("Qual a quantidade de carros vendidos pelo funcionario: ");
        carros = entrada.nextInt();
        
        if(carros>5){
            salario = carros*1000;
        }
        else{
            salario = carros*500;
        }
        
        salario = salario + 1000;
        
        System.out.println("O salario total do funcionario é: "+ salario);
 
        }
        
}
