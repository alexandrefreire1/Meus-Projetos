
package prova_q2;


public class Carro extends Automovel{
    private int qtdPortas;

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
 public Carro(String marca, int qtdRodas, String modelo) {
        super(marca, qtdRodas, modelo);
    } 


    public void imprimirinformações() {
        super.imprimirinformações();
        System.out.println("Quantas Portas Tem: "+qtdPortas);
    }
        
}
