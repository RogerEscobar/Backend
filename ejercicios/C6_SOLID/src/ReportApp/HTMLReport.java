package ReportApp;

public class HTMLReport implements Report{
    @Override
    public void generate() {
        System.out.println("Se esta generando el reporte en formato HTML");
    }
}
