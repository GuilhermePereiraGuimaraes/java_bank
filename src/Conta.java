public class Conta {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public Conta(int numero, String agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void apresentacaoBoasVindas() {
        System.out.println("Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agencia + ", conta " + this.numero + " e seu saldo R$" + Math.round(this.saldo * 100.0) / 100.0
                + " já está disponível para saque");
    }
}
