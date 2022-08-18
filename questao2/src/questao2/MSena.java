
package questao2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MSena extends JFrame{
    private JLabel Label;
    private TextField Field;
    private Button Botao;
   
   
    
    public MSena() {
        
        super("MS");
        setLayout(new FlowLayout());
        
            Label = new JLabel("Digite a Quantidade de Jogos: ");
            add(Label);
            
            Field = new TextField(20);
            add(Field);
            
            Botao = new Button (" JOGAR ");
            Botao.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOGAR(Integer.parseInt(Field.getText()));
                                   
                    
                
            }
            });
            add(Botao);
            
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setSize(380,100);
           setVisible(true);
           setLocationRelativeTo(null);
}
        
        public static void JOGAR(int JOGAR) {
        String MSENA="";    
        int[] jogos = new int[JOGAR];
        for (int i = 0; i < JOGAR; i++) {
            while (true) {
                int VALO = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Quantos Numeros Quer Jogar ? " + "No "+(i + 1) + "º JOGO: "));
                if (VALO < 6 || VALO > 15) {
                    JOptionPane.showMessageDialog(null, "!! VALOR ERRADO !! ");
                } else {
                    jogos[i] = VALO ;
                    break;
                }
            }
        }

        
        for (int i = 0; i < jogos.length; i++) {

            MSENA += "Jogo " + (i + 1) + ": " + VALORES(jogos[i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, MSENA);
    }

    public static String VALORES(int VALORES) {
        int[] VAL = new int[VALORES];
        Random random = new Random();
        for (int i = 0; i < VALORES; i++) {
            int JG = random.nextInt(60) + 1;

            for (int j = 0; j < VALORES; j++) {
                if (JG == VAL[j] && j != i) {
                    JG = random.nextInt(60) + 1;
                } else {
                    VAL[i] = JG;
                }
            }
        }
        
        for (int i = 0; i < VALORES; i++) {
            for (int j = i + 1; j < VALORES; j++) {
                if (VAL[i] > VAL[j]) {
                    int JGG = VAL[i];
                    VAL[i] = VAL[j];
                    VAL[j] = JGG;
                }
            }
        }
        String mega = "";
        for (int i = 0; i < VALORES; i++) {
            if (VAL[i] < 10) {
                mega += "0" + VAL[i] + " ";
            } else {
                mega += VAL[i] + " ";
            }
        }
        return mega;
    }
}
