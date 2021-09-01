package br.com.zup;

import java.util.Scanner;

//2. Faça um programa que leia números inteiros e imprima sua média.
public class L7EX002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //variables
        int quantosNumeros = 0;
        float numUsuario;
        int contador = 1;
        float soma =0;
        float media;

        // Numeros a Avaliar
        System.out.println("Por favor, digite quantos números deseja avaliar: ");
       quantosNumeros = leitor.nextInt();

       //soma dos números

        while (contador <= quantosNumeros){
            System.out.println("Indique o "+contador +" número a avaliar");
            numUsuario = leitor.nextFloat();

            if (numUsuario <= 0){
                System.out.println("Digite um valor diferente a 0 ");
            }
            else{

                Math.ceil(numUsuario);
                soma = soma + numUsuario;
            }
            contador++;
        }
        media = soma / quantosNumeros;
        System.out.println("A soma de todos os números é de : " +soma);
        System.out.println("A media dos números é: " + media);




    }
}
