public class Conta {
    private double saldo;
    private String nome;
    private int agencia;

    public Conta(double saldo, String nome, int agencia) {
        this.saldo = saldo;
        this.nome = nome;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void imprime(){
        System.out.println(agencia);
        System.out.println(saldo);
    }
}
