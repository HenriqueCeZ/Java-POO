package Fj.src;
public class GerenciadorDividas {
    public void efetuarPagamento(Divida divida, double valor){
        if(valor > 100){
            valor = valor - 8;
        }
        divida.setValorPago(divida.getValorPago());
    }
}
