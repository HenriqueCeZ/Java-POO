public class ICPP extends TemplateDeImpostoCondicional {



    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        // TODO Auto-generated method stub
         return orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        // TODO Auto-generated method stub
        return orcamento.getValor() * 0.05  ;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        // TODO Auto-generated method stub
        return orcamento.getValor() > 500;
    }
    
}
