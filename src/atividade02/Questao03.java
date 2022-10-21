package atividade02;
import java.util.Scanner;
public class Questao03 {
    // 3. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16).

        public static void main(String[] args) {
                    try (Scanner ler = new Scanner(System.in)) {
                        System.out.println("Qual a sua idade?");
                        int n1 = ler.nextInt();
                        if (n1 >= 16) {
                            System.out.println("pode votar");
                        } else {
                            System.out.println("nao pode votar");
                        }
                    }
                

            
            

        }
}
