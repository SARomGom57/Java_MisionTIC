package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;

public class DBManager implements AutoCloseable{
    private Connection connection;
    public DBManager() throws SQLException {
        connect();
    }
    public void connect() throws SQLException {
        String url = "jdbc:sqlite:C:\\Users\\Gerencia\\Desktop\\BookShopExp.db";
        connection = DriverManager.getConnection(url);
    }

    public Book searchBook(String isbn) throws SQLException {
        ResultSet rs = null;
        Statement stm = null;
        Book libro = null;
        try{
            stm = connection.createStatement();
            String sql = "select * from Libro where isbn = '" + isbn + "'";
            rs = stm.executeQuery(sql);
            while (rs.next()){
                libro = new Book();
                libro.setId(rs.getInt("id_libro"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setTitle(rs.getString("titulo"));
                libro.setYear(rs.getInt("anio"));
            }
        }
        finally{
            if(rs != null){
                rs.close();
            }
            if(stm != null){
                stm.close();
            }

        }
        return libro;


    }
    public List<Book> listBooks() throws SQLException{
        List<Book> libros = new ArrayList<Book>();
        String sql = "SELECT * FROM Libro"; 
        //lo que se encierra entre los parentesis de try se cierra cuando este acaba
        try(
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
        ){
            while (rs.next()){
                Book libro = new Book();
                libro.setId(rs.getInt("id_libro"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setTitle(rs.getString("titulo"));
                libro.setYear(rs.getInt("anio"));
                libros.add(libro);
            }
        }
        return libros;

    }
    public int getStock(Book book) throws SQLException{
        return getStock(book.getId());

    }

    public int getStock(int bookId) throws SQLException{
        int cantidad = 0;
        String sql = "select cantidad from Inventario where id_libro = ?";
        try(
            PreparedStatement stm = connection.prepareStatement(sql);  
        ){
            stm.setInt(1, bookId);  
            try(
                ResultSet rs = stm.executeQuery()
            ){
                if (rs.next()){
                    cantidad = rs.getInt("cantidad");
                }
            }
        }
        return cantidad;
    }

    public boolean sellBook(Book book, int units) throws SQLException{
        int cantidad = getStock(book);
        if (cantidad >=units){
            String sql = "insert into Ventas (fecha_venta, id_libro, cantidad) values(?,?,?)";
            String sql2 = "update Inventario set cantidad = ? where id_libro = ?";
            try(   //se registró la venta en la table Ventas
                PreparedStatement stm = connection.prepareStatement(sql);
            ){
                stm.setString(1, LocalDateTime.now().toString());
                stm.setInt(2, book.getId());
                stm.setInt(3, units);
                stm.executeUpdate();
            }
            try(  // Actualizar la cantidad en la tabla inventario
                PreparedStatement stm = connection.prepareStatement(sql2);
            ){
                stm.setInt(1, cantidad - units);
                stm.setInt(2, book.getId());
                stm.executeUpdate();
            }
        }else{
            return false;
        }
        return true;
    }

    @Override
    public void close() throws SQLException {
        if (connection != null){
            connection.close(); 
        }
        connection = null;
        
    }


}