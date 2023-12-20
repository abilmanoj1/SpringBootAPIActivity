package com.abilmanoj.universitystaffevents.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "event")
public class events {       //setting up entity class for event record

    private int eventId;
    private String eventRef;
    private String desc1;
    private String desc2;
    private String  desc3;
    private Date start;
    private Date end;
    private String teacherName;
    private String teacherEmail;
    private String locCode;
    private String locAdd1;
    private String locAdd2;
}
