package br.com.javaThreads;
                                //implementando interface
public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this); //fazendo referência á própria classe
        t.start();

    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(nome + "terminou a execução");
    }
}


