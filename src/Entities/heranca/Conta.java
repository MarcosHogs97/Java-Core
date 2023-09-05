package Entities.heranca;

/**
 * Representa uma conta bancaria
 *
 * @author Marcos Henrique O. G. da Silva
 * @since 04-09-2023
 */
public class Conta {
    /**
     * O numero da conta bancaria
     */
    private Integer numeroConta;
    /**
     * O titular da conta bancaria
     */
    private String titularConta;
    /**
     * O saldo da conta bancaria
     */
    private Double saldoConta;

    /*
     *Esse constructor cria uma conta com os valores padões para os atributos'numeroConta'
     * */
    public Conta() {

        this.numeroConta = null;
        this.titularConta = null;
        this.saldoConta = 0.0;
    }

    /*
     *Contrutor da classe que recebe os valores para os atributos personalizados:
     * 'numeroConta', 'titularConta', 'saldoConta'.
     *
     * @param numeroConta representa o numero de uma conta
     * @param titularConta representa o nome do dono da conta
     * @param saldoConta representa o saldo da conta
     * */
    public Conta(Integer numeroConta, String titularConta, Double saldoConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
    }

    /**
     * Obeter o numero da conta
     *
     * @return o numero da conta
     */
    public Integer getNumeroConta() {
        return numeroConta;
    }

    /**
     * Define o numero da conta
     */
    private void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Obeter o titular da conta
     *
     * @return o titular da conta
     */
    public String getTitularConta() {
        return titularConta;
    }

    /**
     * Define o titular da conta
     */
    private void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    /**
     * Obeter o saldo da conta
     *
     * @return o saldo da conta
     */
    public Double getSaldoConta() {
        return saldoConta;
    }

    /**
     * Realiza um saque na conta
     * @param quantidade representa o valor para o saque.
     * */
    public void saque(Double quantidade) {
        /*
         * Um saque representa um retirada na conta
         * */
        saldoConta -= quantidade;
    }

    /**
     * Realiza um deposito na conta
     * @param quantidade representa o valor para o deposito.
     * */
    public void deposito(Double quantidade) {
        saldoConta += quantidade;
    }

}
