package Exercicios.Heranca;

public class Esportivo extends Veiculo {
    private int potencia;

    public Esportivo(String marca, String modelo, int ano, int eixos, double preco, int velocidadeMaxima, int potencia) {
        super(marca, modelo, ano, eixos, preco, velocidadeMaxima);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return super.toString() + "Esportivo{" +
                "potencia: " + potencia +
                " Cavalos } " ;
    }
}
