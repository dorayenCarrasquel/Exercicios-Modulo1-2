package br.com.zup;

import java.util.Scanner;

//2 - Faça um programa para ler uma quantidade
// de números (N) digitada pelo usuário e mostrar
// a quantidade de números ímpares desses números.
public class EX002L5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variables
        int quantidaNumeros = 0;
        int contador = 1;
        int quantidaImpares = 0;
        double valorUsuario = 0;
        System.out.println("Por favor digite a Quantidade de Números a analizar: ");
        quantidaNumeros = leitor.nextInt();

        while (contador <= quantidaNumeros){
            System.out.println("Digite o "+contador +"º número a analizar:");
            valorUsuario = leitor.nextDouble();
            if (valorUsuario %2 ==1) {
                quantidaImpares = quantidaImpares + 1;
            }
            contador ++;
        }
        System.out.println("O numero de números impares é: " +quantidaImpares);
    }
}
