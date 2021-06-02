package br.com.javaThreads;

public class TesteSoma {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5}; //resultado correto 15

        MinhaThreadSoma thread1 = new MinhaThreadSoma(" Thread #1", array);
        MinhaThreadSoma thread2 = new MinhaThreadSoma(" Thread #2", array);
    }
}
