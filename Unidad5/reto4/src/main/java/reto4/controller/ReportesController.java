package reto4.controller;

import java.sql.SQLException;

import reto4.model.dao.ComprasDeLiderDao;
import reto4.model.dao.DeudasPorProyectoDao;
import reto4.model.dao.ProyectoBancoDao;
import reto4.model.vo.*;
import java.util.List;


public class ReportesController {
    private ProyectoBancoDao proyectoBancoDao;
    private DeudasPorProyectoDao deudasPorProyectoDao;
    private ComprasDeLiderDao comprasDeLiderDao;

    public ReportesController(){
        proyectoBancoDao = new ProyectoBancoDao();
        deudasPorProyectoDao = new DeudasPorProyectoDao();
        comprasDeLiderDao = new ComprasDeLiderDao();
    }
    public List<ProyectoBancoVo> listarProyectosPorBanco(String banco) throws SQLException{
        return proyectoBancoDao.listar(banco);
    }
    public List<DeudasPorProyectoVo> listarTotalAdeudadoProyectos(Double limite) throws SQLException{
        return deudasPorProyectoDao.listar(limite);
    }

    public List<ComprasDeLiderVo> listarLideresQueMasGastan() throws SQLException{
        return comprasDeLiderDao.listar();
    }
}
