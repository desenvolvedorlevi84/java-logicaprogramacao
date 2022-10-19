package atividade01;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        //Escreva um programa para ler o valor de um jantar, o sistema vai apresentar a taxa do garçom 10% e também o valor
        //<valor refeição> + 10% = <final total>.

        // 1. Ferramenta que vai permitir utilizar a função de leitura.
        Scanner ler = new Scanner(System.in);
        // 2. Escrever a mensagem "Digite valor do jantar."
        System.out.println("Digite valor do jantar");
        // 3 Ler o valor
        float valorJantar = ler.nextFloat();
        float taxaGarcon = (valorJantar /100)*10;
        // 8. Calculo da refeição com a taxa do garçon.
        float custoRestaurante = valorJantar + taxaGarcon;
        System.out.println("O valor total da sua conta é: " + custoRestaurante + " reais");
        
        //ler.close();
    }
}
