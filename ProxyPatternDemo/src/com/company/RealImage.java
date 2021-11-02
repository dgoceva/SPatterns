package com.company;

import java.net.URL;

public class RealImage implements Image{
    @Override
    public void displayImage() {
        //display the image
        System.out.println("Display image");
    }
    //a method that only the real image has
    private void loadImage(URL url)  {
        //do resource intensive operation to load image
        System.out.println("Loading image "+url);
    }
    public RealImage(URL url)   {
        //load up the image
        loadImage(url);
    }

    }
