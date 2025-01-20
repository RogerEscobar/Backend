package ReportApp;

public class ReportApp {
    public  static void main (String[] args) {

        Report pdfReport = new PDFReport();
        ReportManager pdfReportManager = new ReportManager(pdfReport);
        pdfReportManager.generateReport();

        Report htmlReport = new HTMLReport();
        ReportManager htmlReportManager = new ReportManager(htmlReport);
        htmlReportManager.generateReport();

        Report excelReport = new ExcelReport();
        ReportManager excelReportManager = new ReportManager(excelReport);
        excelReportManager.generateReport();
    }
}
