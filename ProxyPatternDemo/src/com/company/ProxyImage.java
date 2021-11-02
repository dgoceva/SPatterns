package com.company;

import java.net.URL;

public class ProxyImage implements Image {
    private URL url;

    @Override
    public void displayImage() {
        //this method delegates to the real image
        RealImage real = new RealImage(url);
        real.displayImage();
    }
    public ProxyImage(URL url)    {
        this.url = url;
    }
}
