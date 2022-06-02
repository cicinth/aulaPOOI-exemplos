import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Carro carro = new Carro();
        carro.placa = "AYU564";

        System.out.println(carro.placa);

        carro.trocaPlaca("TESTE");

        System.out.println(carro.placa);

        carro.estaLigado = true;
        carro.ligar();

        int velocidadeAtual = carro.acelerar();
        System.out.println(velocidadeAtual);

    }
}
