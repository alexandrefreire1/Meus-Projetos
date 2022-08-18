
package prova_q2;


public class Prova_Q1 {

    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta("MONARKA",4,"RT-2000");
        bike.setBagageiro(true);
        bike.setNumMarchas(0);
        bike.imprimirinformações();
        
        Carro VRUMM = new Carro("TOYOTA",6,"L200");
        VRUMM.setQtRodas(4);
        VRUMM.setQtdPortas(6);
        VRUMM.setVelocidade(90);
        VRUMM.setPotenciaDoMotor(500);
        VRUMM.imprimirinformações();
        
        
        Moto BIIBII = new Moto("HONDA", 4, "BROS NXR 2020");
        BIIBII.setQtRodas(2);
        BIIBII.setPartidaEletrica(true);
        BIIBII.setVelocidade(130);
        BIIBII.setPotenciaDoMotor(160);
        BIIBII.imprimirinformações();
    }
    
}
