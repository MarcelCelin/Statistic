package com.statistics.stats.model.entity;

import com.statistics.stats.model.enumerations.LevelOfEngagement;
import lombok.Data;

import java.util.Date;

@Data
public class Step {
    private Date startDate;
    private Date endDate;
    private LevelOfEngagement levelOfEngagement;
}
