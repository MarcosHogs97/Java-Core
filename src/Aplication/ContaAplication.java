package Aplication;

import Entities.heranca.Conta;
import Entities.heranca.ContaEmpresa;
import Entities.heranca.ContaPoupanca;

public class ContaAplication {
    public static void main(String[] args) {
    Conta conta = new ContaEmpresa(458,"Marcos",15000.0,1000000.0);
    Conta conta2 = new ContaPoupanca(784,"Mamay",15000.0,0.11);

    System.out.println(conta);
    conta.deposito(777.55);
    System.out.println(conta);
    conta.saque(7500.95);
    System.out.println(conta);


    System.out.println(conta2);
    conta2.deposito(777.55);
    System.out.println(conta2);
    conta2.saque(7500.95);
    System.out.println(conta2);
    }

}
