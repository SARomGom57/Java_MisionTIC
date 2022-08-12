import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class App extends JFrame {
    JButton boton[];
    FlowLayout flowlayout1;
    JLabel display;
    JPanel panelBotones;
    GridLayout gridlayout1;
    JButton botonResultado;

    public App() {
        display();
        botones();
        botonResultado();
        ventana();   
    }

    public void ventana(){
        flowlayout1 = new FlowLayout(FlowLayout.CENTER, 10,10);
        setLayout(flowlayout1);
        setTitle("Calculadora");
        setResizable(true);
        getContentPane().setBackground(Color.BLACK);
        setMinimumSize(new Dimension(260,410));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void display(){
        display = new JLabel("0");
        display.setPreferredSize(new Dimension(230,60));
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setBorder(new LineBorder(Color.GRAY));
        display.setFont(new Font("MONOSPACED", Font.PLAIN, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display);
    }

    public void botones(){
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        gridlayout1 = new GridLayout(4,4,10,10);
        panelBotones.setLayout(gridlayout1);
        add(panelBotones);
        boton = new JButton[16];
        String[] texto_Botones= new String[] {"1","2","3","+","4","5","6","-","7","8","9","*","C","0",".","/"};
        for (int i=0; i<16; i++){
            boton[i] = new JButton(texto_Botones[i]);
            boton[i].setPreferredSize(new Dimension(50,50));
            boton[i].setBackground(Color.DARK_GRAY);
            boton[i].setBorder(new LineBorder(Color.DARK_GRAY));
            boton[i].setForeground(Color.WHITE);
            panelBotones.add(boton[i]);
        }
    }

    public void botonResultado() {
        botonResultado = new JButton("Resultado");
        botonResultado.setPreferredSize(new Dimension(230, 40));
        botonResultado.setFont(new Font("MONOSPACED", Font.PLAIN, 16));
        botonResultado.setBackground(Color.DARK_GRAY);
        botonResultado.setBorder(new LineBorder(Color.DARK_GRAY));
        botonResultado.setForeground(Color.WHITE);
        add(botonResultado);
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
