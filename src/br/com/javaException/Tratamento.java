package br.com.javaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            int num = leitor.nextInt();
            System.out.println(50/num);
        } catch (InputMismatchException exception) { //ocorre quando o método recebe uma string que não tem um int válido.
            System.out.println("Você só pode informar números inteiros");
        } catch (ArithmeticException erro) {
            System.out.println("Nenhum número pode ser dividido por zero");
        } finally {
            System.out.println("Fim do programa");
        }

    }
}
