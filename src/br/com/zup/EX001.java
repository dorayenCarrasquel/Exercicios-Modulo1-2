package br.com.zup;

import java.util.Scanner;

//1 - Faça um programa que mostra na tela os números de 1 a 100.
public class EX001 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos a contar até 100");
        System.out.println("Por favor, digite um número para iniciar o contagem: ");
        int contador = leitor.nextInt();

        while (contador <= 100){
            System.out.println(contador);
            contador ++;
        }



    }
}
