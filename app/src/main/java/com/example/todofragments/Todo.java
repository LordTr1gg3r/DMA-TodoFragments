package com.example.todofragments;

import java.util.Date;
import java.util.UUID;

public class Todo {
    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public Todo(){
        mId = UUID.randomUUID();
        mDate = new Date();

    }
    public void setIsComplete(boolean todoIsComplete){
        mIsComplete = todoIsComplete;
    }
    public boolean isIsComplete(){
        return mIsComplete;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDetail() {
        return mDetail;
    }

    public Date getDate() {
        return mDate;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public void setTitle(String Title) {
        mTitle = Title;
    }

    public void setDetail(String detail) {
        mDetail = detail;
    }

    public void setDate(Date todoDate) {
        mDate = todoDate;
    }
}
