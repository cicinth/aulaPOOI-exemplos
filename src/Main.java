import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Carro[] carros = new Carro[2];

        System.out.println("Cadastro de carro");
        for(int contador = 0; contador < carros.length; contador++ ){
            Carro novoCarro = new Carro();

            System.out.println("Digite a marca do carro");
            novoCarro.marca =  scanner.next();

            System.out.println("Digite o modelo do carro");
            novoCarro.modelo =  scanner.next();

            System.out.println("Digite a cor do carro");
            novoCarro.cor =  scanner.next();

            System.out.println("Digite a placa do carro");
            novoCarro.placa =  scanner.next();


            System.out.println("Carro cadastrado com sucesso ");

            carros[contador] = novoCarro;
        }


        System.out.println("Esses são seus carros cadastrados");
        for(int contador = 0; contador < carros.length; contador++ ) {
            System.out.println(
                            carros[contador].placa+ " " +
                            carros[contador].cor + " " +
                            carros[contador].modelo + " " +
                            carros[contador].marca
            );
        }

    }
}
