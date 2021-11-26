public class DescontoPorMaisDeQuinhentosReais implements Desconta {
    private Desconta proximo;
    
    public double desconta(Orcamento orcamento){
        if(orcamento.getValor() > 500.0){
            return orcamento.getValor() * 0.07;
        
        }else{
            return proximo.desconta(orcamento);
        }
   }  
  @Override
   public void setProximo(Desconta proximo){
      this.proximo = proximo;
   }
}
