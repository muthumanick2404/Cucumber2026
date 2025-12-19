package reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
    public static void  generateReport(){
      
        Configuration config = new Configuration(new File("./target/cucumer-reports/cucumber.html"), "Cucumber2026FW");
        config.addClassifications("Webtesting", "Cucumber BDD with selenium java");
        List<String> jsonfiles = new ArrayList<>();
		jsonfiles.add("./target/report.json");
        ReportBuilder reportBuilder = new ReportBuilder(jsonfiles, config);
        reportBuilder.generateReports();
    }
}
