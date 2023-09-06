package Exercicios.Heranca;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int eixos, double preco, int velocidadeMaxima, double capacidadeCarga) {
        super(marca, modelo, ano, eixos, preco, velocidadeMaxima);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "Caminhao{" +
                "capacidadeCarga: " + capacidadeCarga +
                "} ";
    }
}
