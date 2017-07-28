package uol.publicidade.ia.report.manager.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
public class MetricsReport {

    @EmbeddedId
    private MetricsReportKey metricsReportKey;

    private long totalImpressions;
    private long totalClicks;
    private BigDecimal totalCPMAndCPCRevenue;

    public MetricsReport() {
        this.metricsReportKey = new MetricsReportKey();
    }

    public MetricsReport(MetricsReportKey metricsReportKey) {
        this.metricsReportKey = metricsReportKey;
    }

    public MetricsReport(Long idOrder, Long totalClicks, Long totalImpressions, BigDecimal totalCPMAndCPCRevenue) {
        this.metricsReportKey = new MetricsReportKey();
        this.metricsReportKey.setIdOrder(idOrder);
        this.totalClicks = totalClicks;
        this.totalImpressions = totalImpressions;
        this.totalCPMAndCPCRevenue = totalCPMAndCPCRevenue;
    }

    public long getIdOrder() {
        return metricsReportKey.getIdOrder();
    }

    public void setIdOrder(long idOrder) {
        metricsReportKey.setIdOrder(idOrder);
    }

    public long getIdLineItem() {
        return metricsReportKey.getIdLineItem();
    }

    public void setIdLineItem(long idLineItem) {
        metricsReportKey.setIdLineItem(idLineItem);
    }

    public long getIdCreative() {
        return metricsReportKey.getIdCreative();
    }

    public void setIdCreative(long idCreative) {
        metricsReportKey.setIdCreative(idCreative);
    }

    public long getDate() {
        return metricsReportKey.getDate();
    }

    public void setDate(long date) {
        metricsReportKey.setDate(date);
    }

    public int getHour() {
        return metricsReportKey.getHour();
    }

    public void setHour(int hour) {
        metricsReportKey.setHour(hour);
    }

    public long getTotalImpressions() {
        return totalImpressions;
    }

    public void setTotalImpressions(long totalImpressions) {
        this.totalImpressions = totalImpressions;
    }

    public long getTotalClicks() {
        return totalClicks;
    }

    public void setTotalClicks(long totalClicks) {
        this.totalClicks = totalClicks;
    }

    public BigDecimal getTotalCPMAndCPCRevenue() {
        return totalCPMAndCPCRevenue;
    }

    public void setTotalCPMAndCPCRevenue(BigDecimal totalCPMAndCPCRevenue) {
        this.totalCPMAndCPCRevenue = totalCPMAndCPCRevenue;
    }

    @Override
    public String toString() {
        return new StringBuilder("MetricsReport{")
                .append("idOrder=").append(getIdOrder())
                .append(", idLineItem=").append(getIdLineItem())
                .append(", idCreative=").append(getIdCreative())
                .append(", date=").append(getDate())
                .append(", hour=").append(getHour())
                .append(", totalImpressions=").append(totalImpressions)
                .append(", totalClicks=").append(totalClicks)
                .append(", totalCPMAndCPCRevenue=").append(totalCPMAndCPCRevenue)
                .append('}')
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetricsReport that = (MetricsReport) o;

        return metricsReportKey.equals(that.metricsReportKey);
    }

    @Override
    public int hashCode() {
        return metricsReportKey.hashCode();
    }
}