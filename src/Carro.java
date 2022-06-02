public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public String placa;
    public int velocidadeAtual;
    public boolean estaLigado;

    public void ligar(){
        if(this.estaLigado){
            System.out.println("O carro ja esta ligado");
        } else {
            System.out.println("O carro da placa "+ this.placa + " esta ligando...");
            this.estaLigado = true;
        }
    }
    public void trocaPlaca(String placa){
        this.placa = placa;
    }

    public void desligar(){
        System.out.println("O carro esta desligando...");
    }

    public int acelerar(){
        System.out.println("O carro esta acelarando");
        this.velocidadeAtual++;
        return this.velocidadeAtual;
    }

}