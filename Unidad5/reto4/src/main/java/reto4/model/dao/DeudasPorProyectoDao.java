package reto4.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import reto4.model.vo.DeudasPorProyectoVo;
import reto4.utils.JDBCUtilities;

public class DeudasPorProyectoDao {
    public List<DeudasPorProyectoVo> listar(Double limite) throws SQLException{
        List<DeudasPorProyectoVo> respuesta = new ArrayList<DeudasPorProyectoVo>();
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        String consulta = "select p.ID_Proyecto as ID, SUM(c.Cantidad*mc.Precio_Unidad) as VALOR from Proyecto p join Compra c on (p.ID_Proyecto= c.ID_Proyecto)  join MaterialConstruccion mc  on ( c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion)   where c.Pagado = 'No' GROUP by p.ID_Proyecto  HAVING SUM(c.Cantidad*mc.Precio_Unidad) > ?  order by VALOR desc";
        try{
            stm = conn.prepareStatement(consulta);
            stm.setDouble(1,limite);
            rs = stm.executeQuery();
            while(rs.next()){
                DeudasPorProyectoVo vo = new DeudasPorProyectoVo();
                vo.setId(rs.getInt("id"));
                vo.setValor(rs.getDouble("valor"));
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
