package ReportApp;

public class ReportManager {

    private final Report report;

    public ReportManager(Report report) {
        this.report =report;
    }

    public void generateReport(){
        report.generate();
    }
}
