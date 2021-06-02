package br.com.javaThreads;

public class MinhaThreadSoma implements Runnable {

    private String nome;
    private int[] nums;
    private static Calculadora calculadora = new Calculadora(); //compartilhando a classe calculadora

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        Thread thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(this.nome + " iniciada");
        int soma = calculadora.somaArray(this.nums);
        System.out.println("Resultado da soma para Thread" + this.nome + " é: " + soma);
        System.out.println(this.nome + " finalizada");
    }
}
