package atividade01;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
            // ferramenta que vai permitir utilizar a função de leitura.
        Scanner ler = new Scanner(System.in);
            System.out.println("Media das Notas");
            // 1. Escrever a mensagem "Digite um número."
            System.out.println("Digite primeira nota.");
            // 2. Ler o número
            int n1 = ler.nextInt();
            // 3. Escrever a mensagem "Digite outro número."
            System.out.println("Digite segunda nota");
            // 4. Ler o número
            int n2 = ler.nextInt();
            // 5. Fazer a operação da média
            int r = (n1 + n2) / 2;
            // 6. Escrever o resultado.
            System.out.println("Média das Notas = "+r);
            String resultadofinal = (r >= 7) ? "Aprovado" : "Reprovado";
            System.out.println(resultadofinal);
            ler.close();
        }
    
}
