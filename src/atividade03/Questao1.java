package atividade03;
import java.util.Scanner;
public class Questao1 {
    // 1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Escolha o numero");
            int num = ler.nextInt();
            while (num <= 10) {
                System.out.print(num);
                System.out.println(" < dentro do loop while");
                num++;
                
            }
        }
      
    }
    
}
