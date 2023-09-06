package Exercicios.Heranca;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int eixos;
    private double preco;
    private int velocidadeMaxima;

    public Veiculo(String marca, String modelo, int ano, int eixos, double preco, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.eixos = eixos;
        this.preco = preco;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String toString() {
        return "Veiculo\n" + "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nEixos: " + eixos + "\nPreco:" + preco + "\n" + "Top Speed: " + velocidadeMaxima;
    }
}
