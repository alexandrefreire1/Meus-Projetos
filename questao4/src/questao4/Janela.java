package questao4;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Janela extends JFrame {

    private JLabel LNome;
    private JLabel LTelefone;
    private JLabel LEmail;
    private TextField TNome;
    private TextField TTelefone;
    private TextField TEmail;
    private JButton Cadastrar;
    private JButton Excluir;
    private JButton Econtato;
    private JButton Editar;
    private Agenda Contatinho = new Agenda();

    public Janela() {
        super("Cadastro");
        LNome = new JLabel("Nome: ");
        TNome = new TextField(40);
        LTelefone = new JLabel("Telefone:");
        TTelefone = new TextField(40);
        LEmail = new JLabel("Email: ");
        TEmail = new TextField(40);

        Cadastrar = new JButton(" CADASTRAR ");
        Cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String nome = TNome.getText();
                String telefone = TTelefone.getText();
                String email = TEmail.getText();

                Contato c = new Contato(nome, telefone, email);
                Contatinho.adcionarContato(c);

                TNome.setText("");
                TTelefone.setText("");
                TEmail.setText("");

                JOptionPane.showMessageDialog(null, "ADIÇÃO CONFIRMADA!!");

            }
        });

        Excluir = new JButton(" EXCLUIR ");
        Excluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int Cont = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE A POSIÇÃO DO CONTATO PARA EXCLUIR: "));
                Contatinho.Excluir(Cont);
                JOptionPane.showMessageDialog(null, "EXCLUSÃO CONFIRMADA!!");

            }
        });

        Econtato = new JButton(" VISUALIZAR CONTATO ");
        Econtato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, Contatinho.Visualizar());

            }
        });

        Editar = new JButton(" EDITAR CONTATO ");
        Editar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int Cont = Integer.parseInt(JOptionPane.showInputDialog(null, " DIGITE A POSIÇÃO DO CONTATO PARA EDITAR:"));
                Contatinho.Editar(Cont);

                JOptionPane.showMessageDialog(null, "MODIFICAÇÃO EXECUTADA!!");

            }
        });

        add(LNome);
        add(TNome);
        add(LTelefone);
        add(TTelefone);
        add(LEmail);
        add(TEmail);
        add(Cadastrar);
        add(Excluir);
        add(Econtato);
        add(Editar);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 268);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
