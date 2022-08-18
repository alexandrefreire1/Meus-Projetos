
package prova_q2;


public abstract  class Veiculo {
    
 private String marca;
  private int qtRodas;
  private String modelo;
  private int velocidade = 0;
  
  public abstract  void imprimirinformações();
  public void acelerar(double valor){
      velocidade+=valor;
  };
  public void frear (double valor){
      velocidade-=valor;
      
  }; 

    public Veiculo(String marca, int qtRodas, String modelo) {
        this.marca = marca;
        this.qtRodas = qtRodas;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtRodas() {
        return qtRodas;
    }

    public void setQtRodas(int qtRodas) {
        this.qtRodas = qtRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}


