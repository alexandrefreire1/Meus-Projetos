
package prova_q2;


public class Automovel extends Veiculo{
 private double potenciaDoMotor;

    public Automovel(String marca, int qtRodas, String modelo) {
        super(marca, qtRodas, modelo);
   
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    
    public void imprimirinformações() {
        System.out.println("Marca: "+getMarca()+"\nQuantidade de Rodas: "+getQtRodas()+ "\nQual o Modelo: "+getModelo()+"\nQual a Potencia do Motor: "+
               getPotenciaDoMotor()+"\nQual a Velocidade: "+getVelocidade());
    }

    
}
