package com.statistics.stats.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
@Data
@Document(collection = "evolutions")
public class Evolution {
    @Id
    private String id;
    private String memberId;
    private ArrayList<Step> steps;
}
