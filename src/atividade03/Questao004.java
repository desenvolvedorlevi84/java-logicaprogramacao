package atividade03;
import java.util.Scanner;
public class Questao004 {
    // 4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" se
    // igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tentativas = 5;
        do{
            System.out.println("Tente sua sorte: ");
            String dig = new String(ler.nextLine());
            tentativas = tentativas - 1;
            if(dig.equals("Java-2022")){
                System.out.println("Parabéns voce acertou");
            }else
                System.out.println("Palavra Errada");
            }while(tentativas > 0);
            System.out.println("excedeu o limite de tentativas");
    ler.close();
    }
}
