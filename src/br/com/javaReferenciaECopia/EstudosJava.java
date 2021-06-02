package br.com.javaReferenciaECopia;

public class EstudosJava {

    public static void main(String[] args) {
        int[] notas = {10, 85, 6, 45, 95, 78, 88, 60, 65, 80};
        int[] resultado = {0, 0};

        conferirNotas(notas, resultado);

        System.out.println("Quantidade de aprovados: " + resultado[0]);
        System.out.println("Quantidade de reprovados: " + resultado[1]);

    }
                                                //passagem por referência
    public static void conferirNotas(int[] nt, int[] result) {
        for(int n:nt) {
            if(n >= 60) {
                result[0]++;
            } else {
                result[1]++;
            }
        }


    }
}
