package io.sggc.business.domain.enumerations;

public enum WeeklyBalanceStatus {

    OPENED("OPENED"),
    CLOSED("CLOSED");

    private final String status;

    WeeklyBalanceStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
