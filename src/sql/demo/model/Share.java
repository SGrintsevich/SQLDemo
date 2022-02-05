package sql.demo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Share extends BaseModel{
    private String name;
    private BigDecimal startPrice;
    private int changeProbability;
    private int delta;

    public Share() {
    }

    public Share(long id, String name, BigDecimal startPrice, int changeProbability, int delta) {
        super(id);
        this.name = name;
        this.startPrice = startPrice;
        this.changeProbability = changeProbability;
        this.delta = delta;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public int getChangeProbability() {
        return changeProbability;
    }

    public int getDelta() {
        return delta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public void setChangeProbability(int changeProbability) {
        this.changeProbability = changeProbability;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Share)) return false;
        if (!super.equals(o)) return false;
        Share share = (Share) o;
        return getChangeProbability() == share.getChangeProbability() && getDelta() == share.getDelta() && getName().equals(share.getName()) && getStartPrice().equals(share.getStartPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getStartPrice(), getChangeProbability(), getDelta());
    }
}
