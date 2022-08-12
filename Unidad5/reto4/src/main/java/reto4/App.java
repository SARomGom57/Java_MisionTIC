package reto4;

import reto4.view.ReportesView;

public class App 
{
    public static void main( String[] args )
    {
        var reportesView = new ReportesView();
        var banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);

        System.out.println("*************************************************");
        
        var reportesView2 = new ReportesView();
        var limiteInferior = 50_000d;
        reportesView2.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior);

        System.out.println("*************************************************");

        var reportesView3 = new ReportesView();
        reportesView3. lideresQueMasGastan();
    }
}
