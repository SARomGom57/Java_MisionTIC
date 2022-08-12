import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class App extends JFrame {
    public App(){
        String[] nombreColumnas = {"Nombre", "Edad", "Extranjero"};
        Object[][] datos = {{"Ana", 20, false}, {"Philipp", 35, true}, {"Carlos", 27, false}};

        DefaultTableModel modelo = new DefaultTableModel(datos, nombreColumnas);
        
        String[] datosColumnas = {"Contadora", "Ingenierio", "Administrador"};
        modelo.addColumn("Profesion", datosColumnas);

        Object[] datosFila = {"Laura", 25, false, "Enfermera"};
        modelo.addRow(datosFila);

        JTable tabla = new JTable(modelo);
        tabla.setPreferredScrollableViewportSize(new Dimension(250, 100));
        add(tabla);
        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane);
    }
    public static void main(String[] args) throws Exception {
        App ventana = new App();
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
