package br.com.javaException;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println("mensagem da Exception: " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MyException{
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
                                //jogando exceção
    private static void metodo2() throws MyException{
        System.out.println("Inicio do metodo2");
        throw new MyException ("Algo deu errado...");

        }

    }

