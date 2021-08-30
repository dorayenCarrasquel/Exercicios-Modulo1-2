package br.com.zup;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos a contar até 100");
        System.out.println("Por favor, digite um número para iniciar o contagem regresivo: ");
        int contador = leitor.nextInt();

        while (contador >= 100) {
            System.out.println(contador);
            contador--;
        }
    }
}
