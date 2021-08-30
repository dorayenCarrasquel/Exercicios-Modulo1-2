package br.com.zup;

import java.util.Scanner;

//4 - Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário.
public class EX004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidaDeNumeros = 0;
        int contador = 1;

        double soma = 0;
        double media = 0;
        double valorDigitado = 0;

        System.out.println("Por favor, Digite quantos números va a avaliar para a media: ");
        quantidaDeNumeros = leitor.nextInt();

        while (contador <= quantidaDeNumeros){
            System.out.println("Por favor digite o " +contador +"º número");
            double valordoUsuario = leitor.nextDouble();

            soma = soma + valordoUsuario;
            System.out.println(" a suma atual é: "+soma);
            contador ++;
        }
        media = soma /  quantidaDeNumeros;
        System.out.println("a media dos "+ (contador -1) +" números é de: "+media);

    }
}
