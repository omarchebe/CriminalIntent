package com.criminalintent.omarche.criminalintent.BO;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Omar Che on 03/11/2015.
 */
public class Crime {

    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public Crime() {
        this.mID = UUID.randomUUID();
        this.mDate = new Date();
    }

    public UUID getmID() {
        return mID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmID(UUID mID) {
        this.mID = mID;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
