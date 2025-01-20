package ReportApp;

public class PDFReport implements Report{
    @Override
    public void generate() {
        System.out.println("Se esta generando el reporte en formato PDF");
    }
}
