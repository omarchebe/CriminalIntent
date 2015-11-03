package com.criminalintent.omarche.criminalintent.BO;

import java.util.UUID;

/**
 * Created by Omar Che on 03/11/2015.
 */
public class Crime {

    private UUID mID;
    private String mTitle;


    public Crime() {
        this.mID = UUID.randomUUID();
    }

    public UUID getmID() {
        return mID;
    }

    public String getmTitle() {
        return mTitle;
    }


    public void setmID(UUID mID) {
        this.mID = mID;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
