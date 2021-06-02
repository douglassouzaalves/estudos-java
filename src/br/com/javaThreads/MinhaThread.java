package br.com.javaThreads;
                                //extendendo a classe thread
public class MinhaThread extends Thread {
    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start(); //inicia o método run
    }

    @Override
    public void run() { //executa a tarefa da thread
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo); //colocando a thread pra dormir
            }
        } catch (InterruptedException ex) { //exceção verificada, caso a thread seja interrompida.
            ex.printStackTrace();

        }

        System.out.println(nome + " terminou a execução");
    }
}
