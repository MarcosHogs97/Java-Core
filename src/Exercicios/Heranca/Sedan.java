package Exercicios.Heranca;

public class Sedan extends Veiculo {
    private int portas;
    private double capacidadeMala;

    public Sedan(String marca, String modelo, int ano, int eixos, double preco, int velocidadeMaxima, int portas, double capacidadeMala) {
        super(marca, modelo, ano, eixos, preco, velocidadeMaxima);
        this.portas = portas;
        this.capacidadeMala = capacidadeMala;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public double getCapacidadeMala() {
        return capacidadeMala;
    }

    public void setCapacidadeMala(double capacidadeMala) {
        this.capacidadeMala = capacidadeMala;
    }

    @Override
    public String toString() {
        return super.toString() + "Sedan{" +
                "Portas: " + portas +
                "\nCapacidadeMala: " + capacidadeMala +
                "} " ;
    }
}
