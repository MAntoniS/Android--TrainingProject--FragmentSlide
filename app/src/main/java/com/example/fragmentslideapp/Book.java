package com.example.fragmentslideapp;

import java.io.Serializable;

public class Book implements Serializable {

    private String mTitle;

    private String mAutorName;

    private String mGenre;

    private String mUrl;


    public Book(String mTitle, String mAutorName, String mGenre, String mUrl) {
        this.mTitle = mTitle;
        this.mAutorName = mAutorName;
        this.mGenre = mGenre;
        this.mUrl = mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAutorName() {
        return mAutorName;
    }

    public String getmGenre() {
        return mGenre;
    }

    public String getmUrl() {
        return mUrl;
    }
}
