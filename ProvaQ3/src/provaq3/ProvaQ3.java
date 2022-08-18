
package provaq3;


public class ProvaQ3 {

    
    public static void main(String[] args) {
      Pessoa p = new Pessoa("Fabio",98); 
      Cliente c = new Cliente("Fab",84);
      c.setValorTotaldc(250);
      
      System.out.println("Pessoa: ");
      p.exibeDados();
      System.out.println("\nCliente: ");
      c.exibeDados();
      
      
        System.out.println("\nCompras 2: ");
        c.setValorTotaldc(300.75);
        c.exibeDados();
      
      
    }
    
}
