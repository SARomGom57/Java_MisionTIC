import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    private JMenuBar mMenuBar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem it1, it2, it3, it4;

    public App() {
        setLayout(null);
        mMenuBar = new JMenuBar();
        setJMenuBar(mMenuBar);
        menu1 = new JMenu("Opciones");
        mMenuBar.add(menu1);
        menu2 = new JMenu("Tamaño");
        menu1.add(menu2);
        menu3 = new JMenu("Color");
        menu1.add(menu3);
        it1 = new JMenuItem("640*480");
        it1.addActionListener(this);
        menu2.add(it1);
        it2 = new JMenuItem("1024*700");
        it2.addActionListener(this);
        menu2.add(it2);
        it3 = new JMenuItem("Azul");
        it3.addActionListener(this);
        menu3.add(it3);
        it4 = new JMenuItem("Rojo");
        it4.addActionListener(this);
        menu3.add(it4);
    }

    public static void main(String[] args) throws Exception {
        App ventana = new App();
        ventana.setBounds(20, 20, 300, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == it1){
            setSize(640, 480);
        }
        if (e.getSource() == it2){
            setSize(1024, 700);
        }
        if (e.getSource() == it3){
            getContentPane().setBackground(Color.BLUE);
        }
        if (e.getSource() == it4){
            getContentPane().setBackground(Color.RED);
        }
    }
}
