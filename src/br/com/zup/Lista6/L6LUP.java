package br.com.zup.Lista6;
/*Crie um programa para gerenciar uma lista de alunos,
 cada aluno tem nome, telefone e email. No final do
 programa deve ser exibido a lista de alunos cadastrados.

Entrega Mínima: O sistema permite, via terminal, inserir
 pelo menos 1 aluno em uma lista e retornar o mesmo na tela.

Entrega Média: O sistema permite adicionar mais de um aluno e
 apresenta um menu para decidir se deverá adicionar mais alunos
 ou encerrar o programa.

Entrega Máxima: O Sistema permite excluir um aluno usando como
 parâmetro o email e não permite inserir um aluno com o email
 repetido.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L6LUP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // variable
        int numeroDeAlunos = 0;
        int contador = 1;
        String correo;
        String nome;
        String telefone;

        Map<String, String> cadastro = new HashMap<String, String>();

        //ENTREGA MINIMA

        //Recebendo dados
        System.out.println("Por favor, digite o email do alumno: ");
        correo = leitor.nextLine();
        System.out.println("Por favor, digite o nome: ");
        nome = leitor.nextLine();
        System.out.println("Por favor, digite o telefone: ");
        telefone = leitor.nextLine();

        //Almacenando dados
        cadastro.put(correo, nome + telefone);
        System.out.println(cadastro);
       /*  for (String referencia : cadastro.keySet()) {
            System.out.println("Email: " + correo + " ALuno: Telefone: " + cadastro.get(referencia));
        }

        */

        //ENTREGA MEDIA********************************************
//        System.out.println("Digite o números de alunos a cadastrar: ");
//        numeroDeAlunos = leitor.nextInt();
//        leitor.nextLine();
//
//
//        while (contador <= numeroDeAlunos) {
//            System.out.println("Digite os dados do aluno: ");
//            System.out.println("***********************");
//
//            System.out.println("Digite o nome do aluno seguido de ; e o telefone: ");
//            nomeTelefone = leitor.nextLine();
//
//            System.out.println("Digite Email: ");
//            correo = leitor.nextLine();
//            System.out.println("***********************");
//
//            cadastro.put(correo, nomeTelefone);
//
//            contador++;
//
//        }
//
        //Mostrando Lista


    }

}
