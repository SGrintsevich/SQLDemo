package sql.demo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class TraiderShareAction {
        private Integer operation;
        private Integer traider_id;
        private Integer share_rate_id;
        private BigDecimal amount;

    public TraiderShareAction() {
    }

    public TraiderShareAction(Integer operation, Integer traider_id, Integer share_rate_id, BigDecimal amount) {
        this.operation = operation;
        this.traider_id = traider_id;
        this.share_rate_id = share_rate_id;
        this.amount = amount;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Integer getTraider_id() {
        return traider_id;
    }

    public void setTraider_id(Integer traider_id) {
        this.traider_id = traider_id;
    }

    public Integer getShare_rate_id() {
        return share_rate_id;
    }

    public void setShare_rate_id(Integer share_rate_id) {
        this.share_rate_id = share_rate_id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TraiderShareAction)) return false;
        TraiderShareAction that = (TraiderShareAction) o;
        return Objects.equals(getOperation(), that.getOperation()) && Objects.equals(getTraider_id(), that.getTraider_id()) && Objects.equals(getShare_rate_id(), that.getShare_rate_id()) && Objects.equals(getAmount(), that.getAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperation(), getTraider_id(), getShare_rate_id(), getAmount());
    }
}
