package br.com.zup.lista7;

import java.util.Scanner;

//5. Escreva um programa que declare um inteiro,
// inicialize-o com 0,e incremente-o de 1000 em 1000
// imprimindo seu valor na tela, até que seu valor
// seja 100000 (cem mil).
public class L7EX005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valorUsuario = 0;
        int incremento = 1000;

        System.out.println("Digite o valor a incrementar: ");
        valorUsuario = leitor.nextInt();

        while (valorUsuario <= 100000){
            System.out.println(valorUsuario);
            valorUsuario= valorUsuario + incremento;
            //System.out.println(valorUsuario);
        }
    }
}
