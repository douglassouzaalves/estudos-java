package br.com.javaThreads;

public class TestaThreadsRunnable {
    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 1000);

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread#2", 700);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread#3", 300);



    }
}
