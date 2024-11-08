package com.statistics.stats.model.entity;

import lombok.Data;

@Data
public class Presence {

    private String activityId;
    private String memberId;
    private boolean wasThereAtTheBeginning;
    private boolean didAttendTeaching;
    private boolean wasThereTillTheEnd;
}
