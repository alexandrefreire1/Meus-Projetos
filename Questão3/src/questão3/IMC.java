
package questão3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class IMC extends JFrame {
     private JLabel texto;
     private JTextField peso;
     private JTextField altura;
     private JButton butao;
    
    public IMC(){
     super("Calculo IMC");
     setLayout ( new FlowLayout());
     
      texto= new JLabel("Digite Seu peso ");              
      add( texto );
      
     peso = new JTextField(20);
     add(peso);
     
     texto = new JLabel("Digite Sua Altura");
     add(texto);
     
     altura= new JTextField(20);
     add(altura);
     
    butao = new JButton("Calcular Seu IMC");
    butao.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
         double a = Double.parseDouble(peso.getText())/(Double.parseDouble(altura.getText())*
                 Double.parseDouble(altura.getText()));
           if(a<20){
              JOptionPane.showMessageDialog(null," SEU IMC É: " + a + " Abaixo do Peso");
        }
           else if(a>=20 && a<=25){
               JOptionPane.showMessageDialog(null,"SEU IMC É: "+a+" Peso Normal");
               
        }else if(a>=25 && a<=30){
            JOptionPane.showMessageDialog(null, "SEU IMC É: "+a+ " Acima do Peso");
        }else{
            JOptionPane.showMessageDialog(null, "SEU IMC É: "+a+ " OBESIDADE");
        }
           
      
    }
        });
        
            
        
    add(butao);
    
       
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);
    setVisible( true ); 
    };
    
   
}
