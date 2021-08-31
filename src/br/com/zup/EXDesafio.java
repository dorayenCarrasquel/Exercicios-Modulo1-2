package br.com.zup;

import java.util.Scanner;

public class EXDesafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantNumeros = 0;
        int contador = 1;
        double valorAnalizar = 0;
        double maiorNum = 0;
        double menorNum = 0;
        double soma = 0;

        System.out.println("Por favor, indique o quantos números quer analizar: ");
        quantNumeros = leitor.nextInt();

        while (contador <= quantNumeros){
            System.out.println("Digite " + contador + " número a analizar ");
            valorAnalizar = leitor.nextDouble();

            if (contador == 1 ){
            maiorNum = valorAnalizar;
            menorNum = valorAnalizar;
            }

            else {
                if (valorAnalizar >= maiorNum) {
                    maiorNum = valorAnalizar;
                }

                if (valorAnalizar <= menorNum){
                    menorNum = valorAnalizar;
                }

            }

            System.out.println("Atualmente o menor valor é: " + menorNum + " e o maior valor é: " + maiorNum);

            soma = soma + valorAnalizar;
            System.out.println("A soma dos valores atualmente é: " + soma);
            contador++;
        }
    }
}
