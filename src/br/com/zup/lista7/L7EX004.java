package br.com.zup.lista7;

import java.util.Scanner;

//4. Faça um programa que leia n números inteiros
// positivos e calcule a soma desses números.
public class L7EX004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Variaveis

        int numerosAnalizar = 0;
        int soma = 0;
        int numUsuario = 0;
        int contador = 1;

        System.out.println("Por favor, digite quantos números deseja analizar: ");
        numerosAnalizar = leitor.nextInt();

        while (contador <= numerosAnalizar) {
            System.out.println("Digite número " + contador + ":");
            numUsuario = leitor.nextInt();

            if (numUsuario < 0) {
                System.out.println("Valor invalido, digite o número " + contador + ": ");
            } else {
                soma = soma + numUsuario;
                contador++;
            }

        }
        System.out.println("a soma dos valores é de: " + soma);
    }
}
