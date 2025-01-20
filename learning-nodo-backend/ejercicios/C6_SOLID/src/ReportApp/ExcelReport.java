package ReportApp;

public class ExcelReport implements Report{
    @Override
    public void generate() {
        System.out.println("Se esta generando el reporte en formato XLS");
    }
}
