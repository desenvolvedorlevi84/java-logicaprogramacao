package atividade03;
import java.util.Scanner;
public class Questao003 {
    // 3. Escreva um programa que vai ler 2 números, o sistema vai escrever na tela todos os número entre os 2 digitados.
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite primeiro numero."); 
            int n1 = ler.nextInt();
            System.out.println("Digite segundo numero.");
            int n2 = ler.nextInt();
            System.out.println("o intervalo entre "+n1+" e "+n2+" é:");

            if (n1>n2) {
                for (int i = n1 - 1; i > n2; i = i - 1){
                    System.out.println(i);
        
                    
                }
    
                
            }else{
                for (int i = n1 + 1; i < n2; i = i + 1){
    
                    System.out.println(i);
        
                    
                }
            
    
            }
                
            
            
            ler.close();
        
        }
    }
}