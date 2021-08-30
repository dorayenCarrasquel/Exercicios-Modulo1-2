package br.com.zup;

import java.util.Scanner;

//3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses números.
public class EX003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador= 1;
        int quantidadeNumeros = 5;
        double soma = 0;

        while (contador <= quantidadeNumeros){
            System.out.println("Por favor, Digitem um número para somar");
            double valordoUsuario = leitor.nextDouble();

            soma = soma + valordoUsuario;
            System.out.println(" a suma atual é: "+soma);
            contador ++;
        }
    }
}
