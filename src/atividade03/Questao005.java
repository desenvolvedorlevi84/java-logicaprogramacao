package atividade03;
import java.util.Scanner;
public class Questao005 {
   // 5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.
   public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int maiorid = 0;
    int menorid =0;

    for(int q = 1;q <= 5;q = q + 1){
        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        
       
        if(idade >= 18){
        maiorid++;

    }else{
        menorid++;

    }
    
    }
    System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é de: " + maiorid +" pessoas. E menores de 18 anos e de: "+ menorid);

ler.close();
}

}
