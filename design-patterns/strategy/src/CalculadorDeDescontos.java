public class CalculadorDeDescontos {
    public double calcula(Orcamento orcamento){
       Desconta d1  = new DescontoPorCincoItens();
       Desconta d2 = new DescontoPorMaisDeQuinhentosReais();
       Desconta d3 = new SemDesconto();

       d1.setProximo(d2);
       d2.setProximo(d3);

       return d1.desconta(orcamento);
    }
}
