package atividade03;
import java.util.Scanner;
public class Questao001 {
    // 1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha o numero");
            int contar = ler.nextInt();
            int multi = 0;
            int div = 0;
            int soma = 0;
            int subtracao = 0;

            System.out.println("== Multiplicação ==");

        for (int x = 0; x < 10; x++) {
            int total = contar * ++multi;
            System.out.println(contar + " x " + multi + " = " + total);
            }

            System.out.println("== Divisão ==");
        
        for (int x = 0; x < 10; x++) {
            int total = contar / ++div;
            System.out.println(contar + " / " + div + " = " + total);
            }

            System.out.println("== Soma ==");

        for (int x = 0; x < 10; x++) {
            int total = contar + ++soma;
            System.out.println(contar + " + " + soma + " = " + total);
            } 

            System.out.println("== Subtracação ==");

        for (int x = 0; x < 10; x++) {
            int total = contar - ++subtracao;
            System.out.println(contar + " - " + subtracao + " = " + total);
            }



         ler.close();
        
      
    }
    
}
