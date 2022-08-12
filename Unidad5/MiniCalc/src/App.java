import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class App extends JFrame implements ActionListener, ChangeListener {
    private JTextField txtNum1, txtNum2;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private JRadioButton rbtSuma, rbtnRest, rbtMult, rbtDivi;
    private ButtonGroup btnGrupo; 

    public App() {
        setLayout(null);
        txtNum1 = new JTextField();
        txtNum1.setBounds(10,10,100,30);
        add(txtNum1);
        txtNum2 = new JTextField();
        txtNum2.setBounds(10,50,100,30);
        add(txtNum2);
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10,90,100,30);
        btnCalcular.addActionListener(this);
        add(btnCalcular);
        lblResultado = new JLabel("--");
        lblResultado.setBounds(150,0,150,60);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 15));
        add(lblResultado);
        btnGrupo = new ButtonGroup();
        rbtSuma = new JRadioButton("+");
        rbtSuma.setBounds(130,35,50,30);
        btnGrupo.add(rbtSuma);
        rbtSuma.addChangeListener(this);
        add(rbtSuma);
        rbtnRest = new JRadioButton("-");
        rbtnRest.setBounds(130,60,50,30);
        btnGrupo.add(rbtnRest);
        rbtnRest.addChangeListener(this);
        add(rbtnRest);
        rbtMult = new JRadioButton("*");
        rbtMult.setBounds(130,85,50,30);
        btnGrupo.add(rbtMult);
        rbtMult.addChangeListener(this);
        add(rbtMult);
        rbtDivi = new JRadioButton("/");
        rbtDivi.setBounds(130,110,50,30);
        btnGrupo.add(rbtDivi);
        rbtDivi.addChangeListener(this);
        add(rbtDivi);
    }

    public static void main(String[] args) throws Exception {
        App ventana = new App();
        ventana.setBounds(100,100,250,180);
        ventana.setVisible(true);
        ventana.setTitle("Mini Calculator");
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btnCalcular) {
            Double x = Double.parseDouble(txtNum1.getText());
            Double y = Double.parseDouble(txtNum2.getText());
            Double resultado = 0.0;
            if(rbtSuma.isSelected()){
                resultado = x+y;
            }
            if(rbtnRest.isSelected()){
                resultado = x-y;
            }
            if(rbtMult.isSelected()){
                resultado = x*y;
            }
            if(rbtDivi.isSelected()){
                resultado = x/y;
            }
            lblResultado.setText(String.valueOf(resultado));
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
    }
}
