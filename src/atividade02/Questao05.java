package atividade02;
import java.util.Scanner;
public class Questao05 {
    /* 5. Escreva um programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: “Não pode nem votar e nem dirigir”,
    “Pode votar, mas não pode dirigir”, “Pode votar e pode dirigir”.*/
    public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in)) {
                System.out.println("Qual a sua idade?");
                int n1 = ler.nextInt();
                if (n1 >= 18) {
                    System.out.println("Pode votar e pode dirigir");
                } else if(n1 >= 16){
                    System.out.println("Pode votar e nao pode dirigir");
                } else {
                    System.out.println("Não pode nem votar e nem dirigir");
                }
            }
        }
    }
