package uol.publicidade.ia.report.manager.steps;

import cucumber.api.java.pt.Dado;
import org.springframework.beans.factory.annotation.Autowired;
import uol.publicidade.ia.report.manager.DataUtil;
import uol.publicidade.ia.report.manager.entity.MetricsReport;
import uol.publicidade.ia.report.manager.repository.MetricsRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class BaseSteps {

    @Autowired
    private MetricsRepository metricsRepository;

    @Autowired
    private DataUtil dataUtil;

    @Dado("^que o banco de dados esteja populado:$")
    public void queOBancoDeDadosEstejaPopulado(List<Map<String, String>> data) throws Throwable {
        for (Map<String, String> map : data) {
            MetricsReport report = new MetricsReport();
            report.setDate(Long.parseLong(map.get("date")));
            report.setHour(Integer.parseInt(map.get("hour")));
            report.setIdCreative(Long.parseLong(map.get("idCreative")));
            report.setIdLineItem(Long.parseLong(map.get("idLineItem")));
            report.setIdOrder(Long.parseLong(map.get("idOrder")));
            report.setTotalClicks(Long.parseLong(map.get("totalClicks")));
            report.setTotalImpressions(Long.parseLong(map.get("totalImpressions")));
            report.setTotalCPMAndCPCRevenue(new BigDecimal(map.get("totalCPMAndCPCRevenue")));
            this.dataUtil.getAllData().put(map.get("id"), report);
            this.metricsRepository.save(report);
        }
    }
}
