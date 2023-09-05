package Entities.heranca;
/**
 * Representa uma conta bancaria de uma empresa
 * @author Marcos Henrique O. G. da silva
 * @version 1.0
 * */
public class ContaEmpresa extends Conta {
    /*
     *Limite para realização de emprestimo
     * */
    private Double limiteEmprestimo;
    /* Construct Padrãp
    **/
    public ContaEmpresa() {

    }
    /*Construct personalizado.
     * @param numeroConta representa o numero da conta, herdado do pai
     * @param titularConta representa o titulo da conta, herdado do pai
     * @param nomeConta representa o nome da conta, herdado do pai
     * @param limiteConta representa o limite para realização de emprestimo.
     * **/
    public ContaEmpresa(Integer numeroConta, String titularConta, Double saldoConta, Double limiteEmprestimo) {
        super(numeroConta, titularConta, saldoConta);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    /*
    *Obtem o limite de emprestimo da conta
    * @return o limite de emprestimo da conta.
    * */
    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }
    /*
    *Define o limite de emprestimo da conta
    * @param limiteEmprestimo o limite de emprestimo da conta.
    * */

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    /*
    *Realiza o empréstimo de uma conta empresa.
    * @param quantidade representa o valor do emprestimo.
    * */
    public void emprestimo(Double quantidade){
        if (quantidade <= getLimiteEmprestimo()){
            deposito(quantidade);
        }else{
            System.out.println("Empréstimo negado!");
        }
    }

}
