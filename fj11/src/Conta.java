public class Conta {
    private double saldo;
    private String titular;
    private int agencia;

    public Conta(double saldo, String titular, int agencia) {
        this.saldo = saldo;
        this.titular = titular;
        this.agencia =  agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public String getNome() {
        return this.titular;
    }

    public void setNome(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

   public void sacar(double valor) {
       if(saldo >= valor){
           this.saldo -= valor;
       }else{
           throw new RuntimeException("Saldo insuficiente");
       }

   }
   public void depositar(double valor){
       this.saldo +=valor;
   }
}
