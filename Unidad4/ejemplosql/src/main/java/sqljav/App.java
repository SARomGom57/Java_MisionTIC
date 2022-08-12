package sqljav;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
        String jdcUrl = "jdbc:sqlite:G:\\Mi unidad\\Mision TIC 2022\\Grupo 19\\Ciclo 2\\Fundamentos de Programación\\Unidad 3\\hr.db";
        try{
            //Select
            Connection conn = DriverManager.getConnection(jdcUrl); // JDBC Connection to SQLite Database
            String sqle = "SELECT * FROM employees e WHERE salary > 10000";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqle);
            while(rs.next()){
                Integer id = rs.getInt("employee_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                Double salario = rs.getDouble("salary");
                System.out.println(id+"\t"+nombre+"\t"+apellido+"\t"+salario);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println("Error al acceder a la base de datos");
            System.out.println(e.getMessage());
        }
        // Insert Into
        try{
            Connection conn = DriverManager.getConnection(jdcUrl);
            String sqli = "INSERT INTO departments (department_name, location_id) VALUES ('Mantenimiento',1500)";
            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate(sqli);
            if(rows > 0){
                System.out.println("Registro Creado con Exito");
            }
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println("Error al crear el registro de datos");
            System.out.println(e.getMessage());
        }
        // Update
        try{
            Connection conn = DriverManager.getConnection(jdcUrl);
            String sqlu = "UPDATE departments SET department_name = 'I+D' WHERE department_id = 12";
            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate(sqlu);
            if(rows > 0){
                System.out.println("Registro Actualizado con Exito");
            }
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println("Error al actualizar el registro");
            System.out.println(e.getMessage());
        }
        // Delete
        try{
            Connection conn = DriverManager.getConnection(jdcUrl);
            String sqld = "DELETE FROM regions WHERE region_id = 5";
            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate(sqld);
            if(rows > 0){
                System.out.println("Registro Borrado con Exito");
            }
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println("Error al borrar la tabla");
            System.out.println(e.getMessage());
        }
    }
}
