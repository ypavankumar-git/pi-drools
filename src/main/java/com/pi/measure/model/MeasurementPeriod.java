package com.pi.measure.model;

import java.time.LocalDateTime;

public class MeasurementPeriod {

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public MeasurementPeriod() {
        this.startDateTime = LocalDateTime.parse("2021-01-01T00:00:00");
        this.endDateTime = LocalDateTime.parse("2021-12-31T23:59:59");
    }
}
