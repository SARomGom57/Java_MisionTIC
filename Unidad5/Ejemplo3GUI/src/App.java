import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements ItemListener {
    private JComboBox<String> combo1;

    public App(){
        setLayout(null);
        combo1 = new JComboBox<String>();
        combo1.setBounds(20, 20, 80, 20);
        combo1.addItem("Titulo 1");
        combo1.addItem("Titulo 2");
        combo1.addItem("Titulo 3");
        getContentPane().add(combo1);
        combo1.addItemListener(this);
    }

    public static void main(String[] args) throws Exception {
        App ventana = new App();
        ventana.setBounds(20, 20, 300, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo1){
            String opcion = combo1.getSelectedItem().toString();
            setTitle(opcion);
        }
        
    }
}
