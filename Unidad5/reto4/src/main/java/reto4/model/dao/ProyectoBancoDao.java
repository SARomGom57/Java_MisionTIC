package reto4.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import reto4.model.vo.ProyectoBancoVo;
import reto4.utils.JDBCUtilities;

public class ProyectoBancoDao{
    public List<ProyectoBancoVo> listar(String banco) throws SQLException{
        List<ProyectoBancoVo> respuesta = new ArrayList<ProyectoBancoVo>();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        String consulta = "select p.ID_Proyecto as ID, p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato, l.Nombre ||' '||l.Primer_Apellido ||' '||l.Segundo_Apellido as LIDER FROM Proyecto p JOIN Tipo t ON (p.ID_Tipo = t.ID_Tipo) JOIN Lider l ON (p.ID_Lider = l.ID_Lider) where p.Banco_Vinculado = ? order by Fecha_Inicio desc, Ciudad, Constructora";
        try{
            stm = conn.prepareStatement(consulta);
            stm.setString(1,banco);
            rs = stm.executeQuery();
            while(rs.next()){
                ProyectoBancoVo vo = new ProyectoBancoVo();
                vo.setId(rs.getInt("id"));
                vo.setConstructora(rs.getString("constructora"));
                vo.setCiudad(rs.getString("ciudad"));
                vo.setClasificacion(rs.getString("clasificacion"));
                vo.setEstrato(rs.getInt("estrato"));
                vo.setLider(rs.getString("lider"));
                respuesta.add(vo);
            }
        }
        finally{
            if (rs != null){
                rs.close();
            }
            if(stm != null){
                stm.close();
            }
            if(conn !=null){
                conn.close();
            }
        }
        return respuesta;
    }
}
