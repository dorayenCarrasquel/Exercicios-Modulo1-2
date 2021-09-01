package br.com.zup;

import java.util.Scanner;

//3. Escreva um programa que leia 10 números e escreva
// o menor valor lido é o maior valor lido.
public class L7EX003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //variables
        double menorValor = 0;
        double maiorValor = 0;
        double valorUsuario = 0;
        int contador = 1;

        while (contador <= 10){
            System.out.println("Por favor, digite o " + contador + " número a analizar: ");
            valorUsuario = leitor.nextDouble();

            if (contador == 1){
                menorValor = valorUsuario;
                maiorValor = valorUsuario;
            }
            else{
                if (menorValor <= valorUsuario){
                    menorValor = valorUsuario;
                }
                if (maiorValor >= valorUsuario){
                    maiorValor = valorUsuario;
                }
            }
            contador++;
        }
        System.out.println("O número de maior valor é: " +maiorValor);
        System.out.println("O número de menor valor é: " +menorValor);

    }
}
