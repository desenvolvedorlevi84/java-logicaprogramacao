package atividade02;
import java.util.Scanner;
public class Questao04 {
    // 4. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode dirigir (idade>=18). 

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Qual a sua idade?");
            int n1 = ler.nextInt();
            if (n1 >= 18) {
                System.out.println("Voce pode dirigir");
            } else {
                System.out.println("Voce nao pode dirigir");
            }
        }
        
    }
}
