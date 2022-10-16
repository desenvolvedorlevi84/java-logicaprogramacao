package atividade01;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) throws Exception {
        // ferramenta que vai permitir utilizar a função de leitura.
        Scanner ler = new Scanner(System.in);
        // 1. Escrever a mensagem "Digite um número."
        System.out.println("Digite o numero base.");
        // 2. Ler o número
        int n1 = ler.nextInt();
        n1 = ++n1;
        System.out.println("Vizinho a direita do Numero Base: "+n1);
        n1 = --n1 - 1;
        System.out.println("Vizinho a esquerda do Numero Base: "+n1);
        ler.close();
        
    }
}
