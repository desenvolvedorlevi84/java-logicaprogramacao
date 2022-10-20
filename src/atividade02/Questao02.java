package atividade02;
import java.util.Scanner;
public class Questao02 {
    // 2. Escreva um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero");
            int n1 = ler.nextInt();
            System.out.println("Digite o segundo numero");
            int n2 = ler.nextInt();
            System.out.println("Digite o terceiro numero");
            int n3 = ler.nextInt();
            if (n1 > n2 && n1 > n3) {
                System.out.print(n1 + " maior ");
            } else if (n2 > n3 && n2 > n1) {
                System.out.print(n2 + " maior ");
            } else {
                System.out.print(n3 + " maior ");
            }
            if (n1 < n2 && n1 < n3) {
                System.out.print(n1 + " menor ");
            } else if (n2 < n3 && n2 < n1) {
                System.out.print(n2 + " menor ");
            } else {
                System.out.print(n3 + " menor ");
            }
        }

        
            
        
        
        
    }
}
