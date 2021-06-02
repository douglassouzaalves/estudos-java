package br.com.javaException;

public class ExcecaoComErro {
    public static void main(String[] args) {

        int[] vetor = new int[4]; //vetor possui 4 posiçoes de acesso

        System.out.println("Antes da exception");

        vetor[4] = 10;

        System.out.println("Esse texto não será impresso");
    }
}
