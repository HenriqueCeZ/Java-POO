public class CalculadorDeImposto {

    public void realizarCalculoICMS(Orcamento orcamento){
        double icms = new ICMS().calcularICMS(orcamento);
        System.out.println(icms);
    }

    public void realizaCalculoISS(Orcamento orcamento){
        double iss = new ISS().calcularISS(orcamento);
        System.out.println(iss);

    }
    
    
}
