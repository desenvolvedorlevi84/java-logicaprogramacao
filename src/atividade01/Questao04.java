package atividade01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
            // 1. Ferramenta que vai permitir utilizar a função de leitura.
        Scanner ler = new Scanner(System.in);
            // 2. Escrever a mensagem "Digite seu nome."
            System.out.println("Digite seu nome");
            // 3 Ler o nome
            String nome = ler.nextLine();
            // 4. Escrever a mensagem "Digite horas trabalhadas."
            System.out.println("Digite horas trabalhadas");
            // 5. Ler o horas trabalhadas
            double n1 = ler.nextDouble();
            // 6. Escrever a mensagem "Digite valor da hora trabalhada."
            System.out.println("Digite valor da hora trabalhada");
            // 7. Ler o valor da hora trabalhada
            double n2 = ler.nextDouble();
            // 8. Calculo do sálario.
            double r = n1 * n2;
            System.out.println(nome + " seu salário será " + r + " reais");
            ler.close();
        }
        
            
    
}
