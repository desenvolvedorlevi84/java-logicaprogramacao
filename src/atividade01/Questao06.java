package atividade01;
import java.util.Scanner;

public class Questao06 {
    //Escreva um programa para ler o valor de uma conta e quantas pessoas vão dividir a conta, o sistema vai apresentar quanto cada pessoa vai pagar.
    public static void main(String[] args) {
   // 1. Ferramenta que vai permitir utilizar a função de leitura.
   Scanner ler = new Scanner(System.in);
   // 2. Escrever a mensagem "Digite o valor da conta."
   System.out.println("Digite o valor da conta");
   // 3 Ler o valor
   float valorConta = ler.nextFloat();
   // 4. Escrever a mensagem "Quantas pessoas vão dividir?."
   System.out.println("Quantas pessoas vão dividir?");
   // 5. Ler quantas pessoas vão dividir
   int qtdPessoas = ler.nextInt();
   // 8. Calculo da divisão.
   float calculoDivisao = valorConta / qtdPessoas;
   System.out.println("O valor para cada pessoa é: " + calculoDivisao + " reais");
   
   ler.close();
} 

}
