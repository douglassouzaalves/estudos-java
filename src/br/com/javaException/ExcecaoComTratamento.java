package br.com.javaException;

public class ExcecaoComTratamento {
    public static void main(String[] args) {

        try {

            int[] vetor = new int[4]; //este vetor possui 4 posiçoes de acesso

            System.out.println("Antes da exception");

            vetor[4] = 10;

            System.out.println("Esse texto não será impresso");

        } catch (ArrayIndexOutOfBoundsException exception) { //exemplo de uma das exceções(unchecked)
            System.out.println("-=-=-Exceção ao acessar um índice do vetor que não existe-=-=-");
        } finally {
            System.out.println("Esse texto será impresso após a exception");
            System.out.println("Finalizando programa...");
        }


    }
}
