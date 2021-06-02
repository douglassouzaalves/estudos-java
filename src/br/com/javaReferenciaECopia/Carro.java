package br.com.javaReferenciaECopia;

class Carro {

    int ano;
    String placa;
}

class TestaCarro {

    public static void main(String[] args) {
//        int valor = 100;
//        dobrarValor(valor);
//
//        System.out.println("Valor do carro: " + valor);

        Carro carro = new Carro();
        carro.ano = 2000;
        mudarAnoCarro(carro); //passagem por referência

        System.out.println("Ano do Carro: " + carro.ano);
    }

    public static void dobrarValor(int v) {
        v = v * 2; //passagem por valor
    }

    public static void mudarAnoCarro(Carro carro) {
        carro.ano = carro.ano + 1;
    }
}
