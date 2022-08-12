package reto4.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import reto4.model.vo.ComprasDeLiderVo;
import reto4.utils.JDBCUtilities;


public class ComprasDeLiderDao {
    public List<ComprasDeLiderVo> listar() throws SQLException{
        List<ComprasDeLiderVo> respuesta = new ArrayList<ComprasDeLiderVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stm = null;
        ResultSet rs = null;
        String consulta = "SELECT L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO AS LIDER, SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR  FROM LIDER L  JOIN PROYECTO P ON (P.ID_LIDER = L.ID_LIDER) JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO) JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION = MC.ID_MATERIALCONSTRUCCION)    GROUP BY L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO ORDER BY VALOR DESC LIMIT 10";
        try{
            stm = conn.createStatement();
            rs = stm.executeQuery(consulta);
            while(rs.next()){
                ComprasDeLiderVo vo = new ComprasDeLiderVo();
                vo.setLider(rs.getString("lider"));
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
