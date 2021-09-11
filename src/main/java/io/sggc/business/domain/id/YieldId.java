package io.sggc.business.domain.id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class YieldId implements Serializable {

    private LocalDate yieldDate;

    private String weeklyBalanceId;

    public LocalDate getYieldDate() {
        return yieldDate;
    }

    public void setYieldDate(LocalDate yieldDate) {
        this.yieldDate = yieldDate;
    }

    public String getWeeklyBalanceId() {
        return weeklyBalanceId;
    }

    public void setWeeklyBalanceId(String weeklyBalanceId) {
        this.weeklyBalanceId = weeklyBalanceId;
    }

    public YieldId() {
//
    }

    public YieldId(LocalDate yieldDate, String weeklyBalanceId) {
        this.yieldDate = yieldDate;
        this.weeklyBalanceId = weeklyBalanceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var that = (YieldId) o;
        return getYieldDate().equals(that.getYieldDate()) && getWeeklyBalanceId().equals(that.getWeeklyBalanceId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYieldDate(), getWeeklyBalanceId());
    }
}
