package br.com.zup.lista7;

import java.util.Scanner;

//Faça um programa que some os números ímpares
// contidos em um intervalo definido pelo usuário.
// O usuário define o valor inicial do intervalo
// e o valor final deste intervalo e o programa
// deve somar todos os números ímpares contidos
// neste intervalo. Caso o usuário digite um
// intervalo inválido (começando por um valor
// maior que o valor final) deve ser escrito uma
// mensagem de erro na tela, “Intervalo de
// valores inválido” e o programa termina.
public class L7EX006 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numImpares = 0;
        int valorInicial = 0;
        int valorFinal = 0;
        int soma = 0;

        //
        System.out.println("Por favor, indique um valor inicial para o intervalo: ");
        valorInicial = leitor.nextInt();
        System.out.println("por favor, indique um valor final para seu intervalo: ");
        valorFinal = leitor.nextInt();

        if (valorInicial >= valorFinal) {
            System.out.println("Intervalo de Valores Inválidos");
        } else {
            while (valorInicial <= valorFinal) {

                if (valorInicial % 2 == 0) {

                }
                else {
                    numImpares = valorInicial;
                    System.out.println(numImpares);
                    soma = soma + numImpares;
                    System.out.println("A soma dos números impares é: "+soma);
                }
                valorInicial++;



            }
        }

    }
}
