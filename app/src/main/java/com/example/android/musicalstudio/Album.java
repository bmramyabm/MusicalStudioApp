package com.example.android.musicalstudio;

public class Album {
    private String mTitle;
    private String mArtist;
    private int mImageResourceId;

    public Album(String Title, String Artist, int imageResourceId) {

        mTitle = Title;
        mArtist = Artist;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
