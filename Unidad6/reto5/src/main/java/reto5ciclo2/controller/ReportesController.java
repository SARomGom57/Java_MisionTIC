package reto5ciclo2.controller;

import java.sql.SQLException;
import java.util.List;

import reto5ciclo2.model.dao.ComprasRealizadasDao;
import reto5ciclo2.model.dao.LiderDao;
import reto5ciclo2.model.dao.NumeroDeHabitacionesDao;
import reto5ciclo2.model.vo.ComprasRealizadasVo;
import reto5ciclo2.model.vo.LiderVo;
import reto5ciclo2.model.vo.NumeroDeHabitacionesVo;

public class ReportesController {
    private ComprasRealizadasDao comprasRealizadasDao;
    private LiderDao liderDao;
    private NumeroDeHabitacionesDao numeroDeHabitacionesDao;

    public ReportesController() {
        comprasRealizadasDao = new ComprasRealizadasDao();
        liderDao = new LiderDao();
        numeroDeHabitacionesDao = new NumeroDeHabitacionesDao();
    }

    public List<ComprasRealizadasVo> listarComprasRealizadasPorBanco() throws SQLException {
        return comprasRealizadasDao.listar();
    }

    public List<LiderVo> listarLideresProyecto() throws SQLException {
        return liderDao.listar();
    }

    public List<NumeroDeHabitacionesVo> listarNumeroDeHabitacionesHome() throws SQLException {
        return numeroDeHabitacionesDao.listar();
    }
}
