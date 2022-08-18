
package questao4;

public class Contato {

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    private String Nome;
    private String Telefone;
    private String Email;

    public Contato(String Nome, String Telefone, String Email) {
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Email = Email;
    }

    
    public String toString() {
        return " Nome: "+ Nome + "\nTelefone: "+ Telefone + "\nEmail: "+ Email; 
    }
    
    
}

