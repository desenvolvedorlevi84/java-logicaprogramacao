package atividade03;
import java.util.Scanner;
public class Questao002 {
    // 2. Escreva um programa que vai ler uma mensagem e um número, o sistema vai repetir a mensagem digitada x vezes o número digitado.

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Defina em uma palavra o que mais o mundo precisa."); 
            String msg = ler.nextLine();
            System.out.println("Digite numero de vezes que você diria essa palavra em publico.");
            int mult = ler.nextInt();

            for (int x =1; x<=mult; x=x+1){
                System.out.println(msg);
            }
        
            ler.close();

        }
        
    }
}
