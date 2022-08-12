import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 

public class Gui extends JFrame {
    
    private JLabel lblSaludo, lblVersion;
    private JButton btnSalir;
    private JTextField txtTitulo;
    private JButton btnTitulo;

    public Gui() {
        setLayout(null); //Posiciones absolutas de los componentes (null)
        lblSaludo = new JLabel("Hola Mundo");
        lblSaludo.setFont(new Font("Helvetica", Font.BOLD, 16));
        lblSaludo.setBounds(20, 20, 100, 20);
        add(lblSaludo); //Add y SetLayout son metodos heredados de la clase JFrame
        lblVersion = new JLabel("Version 1.0");
        lblVersion.setBounds(20, 50, 100, 20);
        add(lblVersion);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(240, 200, 100, 30);
        add(btnSalir);
        btnSalir.addActionListener(this);
        txtTitulo = new JTextField();
        txtTitulo.setBounds(20, 100, 150, 30);
        add(txtTitulo);
        btnTitulo = new JButton("Cambiar");
        btnTitulo.setBounds(240, 160, 100, 30);
        add(btnTitulo);
        btnTitulo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            System.exit(0); 
        }
        if (e.getSource() == btnTitulo) {
            setTitle(txtTitulo.getText());
        }
    }

    public static void main(String[] args) throws Exception {
        Gui ventana1 = new Gui();
        ventana1.setBounds(50, 50, 400, 300);
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setTitle("Hola mundo");
    }
}
