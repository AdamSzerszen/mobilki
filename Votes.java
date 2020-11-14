package com.example.adam.akproj;

/**
 * Created by Adam on 2020-11-05.
 */
public class Votes {

    float [] Votes = new float[ImageAdapter.Images.length];

    public float getVotesLength()
    {
        return Votes.length;
    }

    public void setOnPosition(int position,float Value)
    {
        Votes[position]=Value;
    }
    public float getRatePos(int position)
    {

        return Votes[position];
    }
    private static final Votes holder = new Votes();
    public static Votes getInstance()
    {
        return holder;
    }
}
