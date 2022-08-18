package questao4;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Agenda {
    ArrayList<Contato>No = new ArrayList<>();
    public void adcionarContato(Contato o){
        No.add(o);    
    }
    public void Excluir(int E){
       No.remove(E-1);
        
    }
    
    public String Visualizar(){
      int a=1;
      String b= "";
      for(Contato C:No){
          b+=( a+" : "+C+"\n");
          b+=("*******************\n");
          a++;
      }
      return b;
    }
    
    public void Editar(int r){
        String Nome,Telefone,Email;
        Nome=JOptionPane.showInputDialog(null,"NOME: ");
        Telefone = JOptionPane.showInputDialog(null,"Telefone: ");
        Email = JOptionPane.showInputDialog(null,"EMAIL:");
        Contato t = new Contato(Nome,Telefone,Email);
        No.set(r-1, t);
    }

  
}


