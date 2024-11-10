package com.statistics.stats.model.entity;

import com.statistics.stats.model.enumerations.EventType;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Activity {

    @Id
    private String id;
    private String name;
    private String description;
    private EventType activityType;
    private Date startDate;
    private Date endDate;
    private boolean isOnline;
    // place where the activity takes place
    private String address;
}
