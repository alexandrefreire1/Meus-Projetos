
package provaq1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


public class Calc extends JFrame {
    private JButton TotalPagar;
    private JTextField Tpreco;
    private JTextField TQuantid;
    private JLabel preco;
    private JLabel Quntid;
    private JLabel total;
    private double valor = 0;
    
    public Calc(){
        super("");
        setLayout(new FlowLayout());
        
        preco = new JLabel("Preço do Produto: ");
        Quntid = new JLabel("Quantidade:  ");
        Tpreco = new JTextField(10);
        TQuantid = new JTextField(10);
        TotalPagar = new JButton("Total a Pagar >>");
        TotalPagar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            double pc= Double.parseDouble(TQuantid.getText());
            int q = Integer.parseInt(TQuantid.getText());
            
            double v = pc * q;
            preco = new JLabel(v+"reais");
            add(preco);
            

            
        }
    });
        
        
        add(Tpreco);
        add(Quntid);
        add(TQuantid);
        add(TotalPagar);
        add(total);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150); 
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    
    
}
