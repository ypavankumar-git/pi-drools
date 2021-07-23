package com.pi.measure.model;

import java.time.LocalDateTime;

public class RelevantPeriod {

    private LocalDateTime relevantStart;

    private LocalDateTime relevantEnd;

    public LocalDateTime getRelevantStart() {
        return relevantStart;
    }

    public void setRelevantStart(LocalDateTime relevantStart) {
        this.relevantStart = relevantStart;
    }

    public LocalDateTime getRelevantEnd() {
        return relevantEnd;
    }

    public void setRelevantEnd(LocalDateTime relevantEnd) {
        this.relevantEnd = relevantEnd;
    }
}
