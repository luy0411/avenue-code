package uol.publicidade.ia.report.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uol.publicidade.ia.report.manager.entity.MetricsReport;
import uol.publicidade.ia.report.manager.repository.MetricsRepository;

import java.util.List;

@Component
public class ReportManager {

    private Logger LOGGER = LoggerFactory.getLogger(ReportManager.class);

    @Autowired
    private MetricsRepository metricsRepository;

    public List<MetricsReport> getAllDebug() {
        return metricsRepository.findAll();
    }

}