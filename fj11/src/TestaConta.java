public class TestaConta {
    public static void main(String[] args) {
     Conta conta = new Conta(400.5,"Henrique",1234);

     System.out.println(conta.getNome());
     conta.imprime();
    }
}
