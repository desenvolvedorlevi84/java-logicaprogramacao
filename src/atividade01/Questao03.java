package atividade01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) throws Exception {
        //Escreva um programa para ler um nome digitado e mostrar a mensagem "Olá <nome-digitado>".
        Scanner ler = new Scanner(System.in);
            System.out.println("Digite o seu nome.");
            String nome = ler.nextLine();
            ler.close();
            System.out.println("Olá " +nome);
        }   
            
    } 

