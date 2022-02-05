package sql.demo.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class ShareRates {
    private Date operDate;
    private Integer sheraId;
    private BigDecimal rate;

    public ShareRates() {
    }

    public ShareRates(Date operDate, Integer sheraId, BigDecimal rate) {
        this.operDate = operDate;
        this.sheraId = sheraId;
        this.rate = rate;
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public Integer getSheraId() {
        return sheraId;
    }

    public void setSheraId(Integer sheraId) {
        this.sheraId = sheraId;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShareRates)) return false;
        ShareRates that = (ShareRates) o;
        return Objects.equals(getOperDate(), that.getOperDate()) && Objects.equals(getSheraId(), that.getSheraId()) && Objects.equals(getRate(), that.getRate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperDate(), getSheraId(), getRate());
    }
}

