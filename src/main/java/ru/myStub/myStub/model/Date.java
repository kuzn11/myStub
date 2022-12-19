package ru.myStub.myStub.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Date {
    @XmlElement
    private String time;

    public String getDate() {
        return time;
    }

    public void setDate(String  date) {
        this.time = date;
    }

}