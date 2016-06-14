package com.example.myapp.dto;

import java.util.Date;

/**
 * Created by Warlock on 14.06.2016.
 */
public class RemindDTO {
    private long id;
    private String title;
    private Date remindDate;

    public RemindDTO(String title) {
        this.title = title;
    }

    public RemindDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
