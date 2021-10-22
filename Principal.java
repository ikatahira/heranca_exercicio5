public class Principal {
  public static void main(String args[]){

    Novo n =new Novo();
    n.setEndereco("Rua das Palmeiras, Marília");
    n.setPreco(20000);
    n.setPrecoAdicional(200);
    System.out.println("Endereçõ: "+n.getEndereco()+" Preço: "+ n.getPreco()+" Preço adicional"+ n.getPrecoAdicional());

    Velho v=new Velho();
    v.setEndereco("Avenida Hassib Mofarrej, Oriente");
    v.setPreco(100000);
    v.setDescontoPreco(1000);
    System.out.println("Endereço: "+v.getEndereco()+" Preço: "+v.getPreco()+" Desconto:" +v.getDescontoPreco());


  }  
}
