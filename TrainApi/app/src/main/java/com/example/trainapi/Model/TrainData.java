package com.example.trainapi.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrainData {
        private String id;
        private Map<String, Integer> days;
        private String to_id;
        private Object  classes;
        private String from_id;
        private String arriveTime;
        private String departTime;

    public TrainData(String id, Map<String, Integer> days, String to_id, Object classes, String from_id, String arriveTime, String departTime) {
        this.id = id;
        this.days = days;
        this.to_id = to_id;
        this.classes = classes;
        this.from_id = from_id;
        this.arriveTime = arriveTime;
        this.departTime = departTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Integer> getDays() {
        return days;
    }

    public void setDays(Map<String, Integer> days) {
        this.days = days;
    }

    public String getTo_id() {
        return to_id;
    }

    public void setTo_id(String to_id) {
        this.to_id = to_id;
    }

    public Object getClasses() {
        return classes;
    }

    public void setClasses(Object classes) {
        this.classes = classes;
    }

    public String getFrom_id() {
        return from_id;
    }

    public void setFrom_id(String from_id) {
        this.from_id = from_id;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }
}