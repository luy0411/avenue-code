package uol.publicidade.ia.report.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import uol.publicidade.ia.report.manager.entity.MetricsReport;
import uol.publicidade.ia.report.manager.entity.MetricsReportKey;

import java.util.List;

@Component
public interface MetricsRepository extends JpaRepository<MetricsReport, MetricsReportKey>, QueryDslPredicateExecutor {

    @Query("select m from MetricsReport m where m.metricsReportKey.date between :startDate and :endDate")
    List<MetricsReport> findBetweenDates (@Param("startDate")Long startDate, @Param("endDate")Long endDate);

    @Query("select m from MetricsReport m where m.metricsReportKey.date > :startDate")
    List<MetricsReport> findStartingAt (@Param("startDate")Long startDate);

    @Query("select m from MetricsReport m where m.metricsReportKey.date = :date and m.metricsReportKey.hour = :hour")
    List<MetricsReport> findSpecificDateAndHour (@Param("date")Long date, @Param("hour")Integer hour);

    @Query("select m from MetricsReport m where m.metricsReportKey = :key")
    MetricsReport findByReportKey (@Param("key") MetricsReportKey key);

    @Query("select m from MetricsReport m where m.metricsReportKey in :keys")
    List<MetricsReport> findByReportKeys (@Param("keys") List<MetricsReportKey> keys);

    @Query("select m from MetricsReport m where m.metricsReportKey.idOrder = :idOrder")
    List<MetricsReport> findByOrder (@Param("idOrder")Long idOrder);

    @Query("select new MetricsReport(m.metricsReportKey.idOrder, " +
            "sum(m.totalClicks), sum(m.totalImpressions), sum(m.totalCPMAndCPCRevenue)) " +
            "from MetricsReport m where m.metricsReportKey.idOrder in :ids group by m.metricsReportKey.idOrder")
    List<MetricsReport> findByOrders (@Param("ids")List<Long> orders);

}