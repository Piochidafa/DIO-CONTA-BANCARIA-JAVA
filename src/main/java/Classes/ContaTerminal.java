package Classes;

public class ContaTerminal {

    String agencia, nomeCliente;
    int numero;
    double saldo;


    public ContaTerminal(String agencia, String nomeCliente, int numero, double saldo) {
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public ContaTerminal(){}

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
