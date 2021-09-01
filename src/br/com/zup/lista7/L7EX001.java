package br.com.zup.lista7;
//1 - Escreva um programa que escreva na tela,
// de 1 até 100, de 1 em 1, 2 vezes. A primeira
// vez com "for" e a segunda com "while".
public class L7EX001 {
    public static void main(String[] args) {

        int contador = 1;
        int vez = 1;
        while (vez<= 2){
            if (vez <= 1){
                for (contador = 1; contador <= 100; contador++) {
                    System.out.print(contador + " - ");
                    vez=+1;
                }
            }
            else {
                while (contador<= 100){
                    System.out.println(contador +" :D");
                    contador++;

                }
            }
            vez++;
            contador = 0;
        }


    }
}
