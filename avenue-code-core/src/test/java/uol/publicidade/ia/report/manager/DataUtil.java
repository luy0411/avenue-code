package uol.publicidade.ia.report.manager;

import org.springframework.stereotype.Component;
import uol.publicidade.ia.report.manager.entity.MetricsReport;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataUtil {

    private Map<String, MetricsReport> allData;

    public DataUtil(){
        this.allData = new HashMap<>();
    }

    public Map<String, MetricsReport> getAllData() {
        return allData;
    }

    public void setAllData(Map<String, MetricsReport> allData) {
        this.allData = allData;
    }

}
