package br.com.zup.Lista6;

import java.util.Scanner;

//1 - Faça um programa que pergunte
// o preço de três produtos e informe
// qual produto você deve comprar,
// sabendo que a decisão é sempre pelo
// mais barato.
public class L6Ex001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Variables
//        double prod1;
//        double prod2;
//        double prod3;

        double emConta =0;
        double caro = 0;

        int contador = 1;

        while (contador <= 3) {

            System.out.println("Digite preço do " + contador + "º produto: ");
            double valor = leitor.nextDouble();

            if (valor >= 0) {
                // decisão o qual debo comprar
                if (contador == 1) {
                    emConta = valor;
                    caro = valor;
                } else {
                    if (valor <= emConta) {
                        emConta = valor;
                    } else {
                        valor = caro;
                    }
                }
                //System.out.println("O produto mais en conta é: " + barato + " e o produto mais caro é: " + caro);
                contador++;
            } else {
                System.out.println("Valor invalido");
            }


        }
        System.out.println("*************************");
        System.out.println("barato: " + emConta);
        System.out.println("caro: " + caro);
        System.out.println("*************************");


    }
}
