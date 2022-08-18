
package prova_q2;


public class Bicicleta extends Veiculo {
    
 private int numMarchas;
    private boolean bagageiro;

    public Bicicleta(String marca, int qtRodas, String modelo) {
        super(marca, qtRodas, modelo);
    }

    public void imprimirinformações() {
        System.out.println("Marca: "+getMarca()+"\nQuantidade de Rodas: "+getQtRodas()+"\nQuantas Marchas Tem: "+getNumMarchas()
        + "\nQual o Modelo: "+getModelo()+"\nTem Bagageiro: "+bagageiro);
    }
    
    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

 
    
    
}

