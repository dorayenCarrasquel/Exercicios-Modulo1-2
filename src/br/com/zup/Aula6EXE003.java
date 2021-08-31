package br.com.zup;

import java.util.ArrayList;
import java.util.List;


public class Aula6EXE003 {
    public static void main(String[] args) {
        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        todosOsNumeros.add(10);
        todosOsNumeros.add(12);
        todosOsNumeros.add( 5);

        for (Integer referencia:todosOsNumeros) {
            if (referencia % 2 == 0) {
                numerosPares.add(referencia);
            } else {
                numerosImpares.add(referencia);
            }

        }
        System.out.println("Analizando " + todosOsNumeros.size() + " números");
        System.out.println( "********************");
        System.out.println("* Numeros Impares *");
        System.out.println( "********************");
        System.out.println("Quantidade de Numeros Impares: " + numerosImpares.size());
        System.out.println("Os numeros impares foram: " + numerosImpares);
        System.out.println( "********************");
        System.out.println("* Numeros pares *");
        System.out.println( "********************");
        System.out.println("Quantidade de Numeros pares: " + numerosPares.size());
        System.out.println("Os numeros pares foram: " + numerosPares);
        System.out.println( "********************");

    }
}
