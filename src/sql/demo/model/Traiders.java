package sql.demo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Traiders {
    private String name;
    private Integer freqTick;
    private BigDecimal cash;
    private Integer tradingMethod;
    private Integer changeProbability;
    private String about;

    public Traiders() {
    }

    public Traiders(String name, Integer freqTick, BigDecimal cash, Integer tradingMethod, Integer changeProbability, String about) {
        this.name = name;
        this.freqTick = freqTick;
        this.cash = cash;
        this.tradingMethod = tradingMethod;
        this.changeProbability = changeProbability;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFreqTick() {
        return freqTick;
    }

    public void setFreqTick(Integer freqTick) {
        this.freqTick = freqTick;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public Integer getTradingMethod() {
        return tradingMethod;
    }

    public void setTradingMethod(Integer tradingMethod) {
        this.tradingMethod = tradingMethod;
    }

    public Integer getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(Integer changeProbability) {
        this.changeProbability = changeProbability;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Traiders)) return false;
        Traiders traiders = (Traiders) o;
        return Objects.equals(getName(), traiders.getName()) && Objects.equals(getFreqTick(), traiders.getFreqTick()) && Objects.equals(getCash(), traiders.getCash()) && Objects.equals(getTradingMethod(), traiders.getTradingMethod()) && Objects.equals(getChangeProbability(), traiders.getChangeProbability()) && Objects.equals(getAbout(), traiders.getAbout());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFreqTick(), getCash(), getTradingMethod(), getChangeProbability(), getAbout());
    }
}
