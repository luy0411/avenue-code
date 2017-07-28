package uol.publicidade.ia.report.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uol.publicidade.ia.report.manager.ReportManager;
import uol.publicidade.ia.report.manager.entity.MetricsReport;

import java.util.List;

@Controller
@RequestMapping("/report/metrics")
public class ReportController {

    @Autowired
    private ReportManager reportManager;

    @RequestMapping(method = RequestMethod.GET, value = "/debug")
    @ResponseBody
    public List<MetricsReport> getAllDebug() {
        return reportManager.getAllDebug();
    }

}