package Entities;

import java.util.Scanner;

public class Empregado {
	public String name;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;
	
	
    public void pedidoDeDados(Scanner sc) {
    	name = lerNome(sc);
    	salarioBruto = lerSalario(sc);
    	imposto = lerImposto( sc);
    	porcentagem = lerPorcentagem(sc);
        System.out.println("=======================================");
    }
    
    public double lerSalario(Scanner sc) {
        System.out.print("Informe o salario bruto: ");
        return sc.nextDouble();
    }
    public double lerImposto(Scanner sc) {
        System.out.print("Informe o imposto: ");
        return sc.nextDouble();
    }
    public double lerPorcentagem(Scanner sc) {
        System.out.print("Informe a porcentagem de incremento do salario: ");
        return sc.nextDouble();
    }
    public String lerNome(Scanner sc) {
        System.out.print("Informe o nome do empregado: ");
        return sc.next();
    }
    
    public double cSSI() {
    	double result;
    	
    	result = (salarioBruto - imposto) * porcentagem;
    	return result;
    }
    
    public void exibirResultado() {
    	System.out.println("=======================================");
    	System.out.printf("Nome: %s %n",name);
    	System.out.printf("Salario: %.2f %n",salarioBruto);
    	System.out.printf("Salario: %.2f %n",imposto);
    	System.out.printf("Incrementado Salarial: %.2f %n",cSSI());
    	System.out.printf("O funcionario: %s vai receber um total de : %.2f %n",name,salarioBruto + cSSI());
    	System.out.println("=======================================");
    }
    
}