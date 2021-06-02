package br.com.javaThreads;

public class TestaThreads {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread #1", 1000);
        MinhaThread thread2 = new MinhaThread("Thread #2", 900);
        MinhaThread thread3 = new MinhaThread("Thread #3", 800);
    }
}
