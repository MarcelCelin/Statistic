package com.statistics.stats.model.entity;

import com.statistics.stats.model.enumerations.Gender;
import com.statistics.stats.model.enumerations.Profession;
import com.statistics.stats.model.enumerations.Situation;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Data
@Document(collection = "members")
public class Member {

    @Id
    private String memberId;

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private Gender gender;
    private String address;
    private String contact;
    private Profession profession;
    private Situation situation;

}
