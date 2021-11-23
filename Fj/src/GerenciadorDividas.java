package Fj.src;
public class GerenciadorDividas {
    public void efetuarPagamento(Divida divida, String nomePagador, String cnpjPagador, double valor){
     Pagamento pagamento = new Pagamento();
     pagamento.setCnpjPagador(cnpjPagador);
     pagamento.setPagador(nomePagador);
     pagamento.setValor(valor);   
     divida.registra(pagamento);
    }
}
