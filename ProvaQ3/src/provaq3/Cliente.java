
package provaq3;


public class Cliente extends Pessoa{
    private double valorTotaldc;

    

    public double getValorTotaldc() {
        return valorTotaldc;
    }

    public void setValorTotaldc(double valorTotaldc) {
        this.valorTotaldc += valorTotaldc;
    }
    
    public Cliente(String n,int a) {
        super(n, a);
    }
    public void RGNewCompra( double valor){
        valorTotaldc +=valor;
    }

    
    public void exibeDados() {
        String s = "";
		s += "Nome : " + getNome()+ "\nAno nasc : " + getAnoNascimento() + "\n" + "ValorTota: "+ valorTotaldc ;
		System.out.print(s);
    }
    
}
