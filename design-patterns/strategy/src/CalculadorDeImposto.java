public class CalculadorDeImposto {

    public void realizarCalculoICMS(Orcamento orcamento, Imposto impostoQualquer){
        double icms = impostoQualquer.calcula(orcamento);
        System.out.println(icms);
    }

 
    
    
}
