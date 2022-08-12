package tabla;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame {

    public App() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:hr.db");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM jobs");
        
        DefaultTableModel modelo = new DefaultTableModel();
        JTable table = new JTable(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Salario Min");
        modelo.addColumn("Salario Max");

        try{
            while (rs.next()) {
                Object[] fila = new Object[4];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            rs.close();
            stmt.close();
            conn.close();
    
            table.setPreferredScrollableViewportSize(new Dimension(400, 200));
            add(table);
            JScrollPane pane = new JScrollPane(table);
            add(pane);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        
    public static void main( String[] args ) throws SQLException {
        App ventana = new App();
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setTitle("Consulta");
    }
}
