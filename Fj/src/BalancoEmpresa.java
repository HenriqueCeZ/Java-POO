package Fj.src;
import java.util.HashMap;

public class BalancoEmpresa {
    private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
    public void registraDivida(String credor, String cnpjCredor, double valor){
         Divida divida = new Divida();
         divida.setCredor(credor);
         divida.setTotal(valor);
         divida.setCnpjCredor(cnpjCredor);
         dividas.put(cnpjCredor, divida);

    }

    public void pagaDivida(String cnpjCredor, double valor){
        Divida divida = dividas.get(cnpjCredor);
        if(divida != null){
            if(valor > 100){
                valor = valor - 8;
            }
            divida.setValorPago(divida.getValorPago()+valor);
        }
    }
}
