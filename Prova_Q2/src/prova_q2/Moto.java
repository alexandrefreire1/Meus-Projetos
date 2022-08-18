
package prova_q2;


public class Moto extends Automovel{
    private boolean PartidaEletrica;

    public boolean isPartidaEletrica() {
        return PartidaEletrica;
    }

    public void setPartidaEletrica(boolean PartidaEletrica) {
        this.PartidaEletrica = PartidaEletrica;
    }

    public Moto(String marca, int qtRodas, String modelo) {
        super(marca, qtRodas, modelo);
        
    }

    @Override
    public void imprimirinformações() {
        super.imprimirinformações();
        
        System.out.println("Tem Partida Eletrica: "+PartidaEletrica);
    }
   
   
}
