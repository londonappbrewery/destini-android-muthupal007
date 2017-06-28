package com.londonappbrewery.destini;

/**
 * Created by mpalg on 28-Jun-17.
 */

public class TopBottom {
    private int mStoryID;
    private int mAnswer1ID;
    private int mAnswer2ID;

    public TopBottom (int storyResourceID, int answer1ResourceID, int answer2ResourceID) {
        mStoryID = storyResourceID;
        mAnswer1ID = answer1ResourceID;
        mAnswer2ID = answer2ResourceID;
    }

    public int getAnswer1ID() {
        return mAnswer1ID;
    }

    public void setAnswer1ID(int answer1ID) {
        mAnswer1ID = answer1ID;
    }

    public int getAnswer2ID() {
        return mAnswer2ID;
    }

    public void setAnswer2ID(int answer2ID) {
        mAnswer2ID = answer2ID;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }
}

