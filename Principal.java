public class Principal {
  public static void main(String args[]){

    Novo n =new Novo();
    n.setEndereco("Rua das Palmeiras, Marília");
    n.setPreco(20000);
    n.setPrecoAdicional(200);
    System.out.println("Endereçõ: "+n.getEndereco()+" Preço: "+ n.getPreco()+" Preço adicional"+ n.getPrecoAdicional());

  }  
}
