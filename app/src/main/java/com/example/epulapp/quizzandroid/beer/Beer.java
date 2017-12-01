package com.example.epulapp.quizzandroid.beer;

import android.graphics.Bitmap;

import java.util.Observable;

public class Beer extends Observable {
    private int id;
    private String name;
    private String image_url;
    private String description;
    private float abv; // Taux alcool
    private Bitmap image;

    public Beer() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAbv() {
        return abv;
    }

    public void setAbv(float abv) {
        this.abv = abv;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;

        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Beer) {
            if (((Beer) obj).getId() == this.id) {
                return true;
            }
        }

        return super.equals(obj);
    }
}
