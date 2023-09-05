package Entities;

import java.util.Scanner;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String nome;

    public Triangulo(String nome) {
        this.nome = nome;
    }

    public double calcularArea() {
        if (ladosFormamTriangulo()) {
            double valorP = (ladoA + ladoB + ladoC) / 2;
            double area = Math.sqrt(valorP * (valorP - ladoA) * (valorP - ladoB) * (valorP - ladoC));
            return area;
        } else {
            return -1;
        }
    }

    private boolean ladosFormamTriangulo() {
        return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA;
    }

    public void lerLados(Scanner sc) {
        ladoA = lerLado("A", sc);
        ladoB = lerLado("B", sc);
        ladoC = lerLado("C", sc);
        System.out.println("=======================================");
    }

    private double lerLado(String lado, Scanner sc) {
        System.out.print("Informe o lado " + lado + " do triângulo " + nome + ": ");
        return sc.nextDouble();
    }

    public void exibirResultado() {
        System.out.println("=======================================");
        double area = calcularArea();
        String tipoTriangulo = determinarTipoTriangulo();

        if (area != -1) {
            System.out.printf("A área do triângulo %s é: %.2f %n", nome, area);
            System.out.println("É um triângulo " + tipoTriangulo);
        } else {
            System.out.println("Os lados informados não formam um triângulo válido para o Triângulo " + nome + ".");
        }

        System.out.println("=======================================");
    }

    private String determinarTipoTriangulo() {
        if (ladoA == ladoB && ladoA == ladoC) {
            return "equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}
