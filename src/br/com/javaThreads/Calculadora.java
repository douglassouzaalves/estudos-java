package br.com.javaThreads;

public class Calculadora {

    private int soma;

    //apenas uma thread pode acessar esse método por vez
    public synchronized int somaArray(int[] array) {

        soma = 0; //variável soma sendo compartilhada

        for(int i = 0; i < array.length; i++) {
            soma += array[i];
                                                    //thread atual que está acessando o recurso
            System.out.println("Executando a soma" + Thread.currentThread().getName() +
                    " somando valor " + array[i] + " com total de " + soma);
            try {
                Thread.sleep(200);
            } catch (InterruptedException exception) {
                exception.printStackTrace(); //método da classe Throwable
            }
        }
        return soma;
    }
}
