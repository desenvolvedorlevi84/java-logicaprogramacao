package atividade02;
import java.util.Scanner;
public class Questao01 {
    // 1. Escreva um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite um numero");
            int nb = ler.nextInt();
            if (nb < 0) {
                System.out.println("Menor que zero");
            } else if (nb == 0) {
                System.out.println("Igual a zero");
            } else {
                System.out.println("Maior que zero");
            }
        }
        
    }
    
}
    

