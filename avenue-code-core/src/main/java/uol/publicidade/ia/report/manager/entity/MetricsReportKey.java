package uol.publicidade.ia.report.manager.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MetricsReportKey implements Serializable {

    private long idOrder;
    private long idLineItem;
    private long idCreative;
    private long date;
    private int hour;

    public MetricsReportKey() {

    }

    public MetricsReportKey(long idOrder, long idLineItem, long idCreative, long date, int hour) {
        this.idOrder = idOrder;
        this.idLineItem = idLineItem;
        this.idCreative = idCreative;
        this.date = date;
        this.hour = hour;
    }

    public MetricsReportKey(MetricsReport report) {
        this.idOrder = report.getIdOrder();
        this.idLineItem = report.getIdLineItem();
        this.idCreative = report.getIdCreative();
        this.date = report.getDate();
        this.hour = report.getHour();
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdLineItem() {
        return idLineItem;
    }

    public void setIdLineItem(long idLineItem) {
        this.idLineItem = idLineItem;
    }

    public long getIdCreative() {
        return idCreative;
    }

    public void setIdCreative(long idCreative) {
        this.idCreative = idCreative;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetricsReportKey reportKey = (MetricsReportKey) o;

        if (idOrder != reportKey.idOrder) return false;
        if (idLineItem != reportKey.idLineItem) return false;
        if (idCreative != reportKey.idCreative) return false;
        if (date != reportKey.date) return false;
        return hour == reportKey.hour;
    }

    @Override
    public int hashCode() {
        int result = (int) (idOrder ^ (idOrder >>> 32));
        result = 31 * result + (int) (idLineItem ^ (idLineItem >>> 32));
        result = 31 * result + (int) (idCreative ^ (idCreative >>> 32));
        result = 31 * result + (int) (date ^ (date >>> 32));
        result = 31 * result + hour;
        return result;
    }
}
