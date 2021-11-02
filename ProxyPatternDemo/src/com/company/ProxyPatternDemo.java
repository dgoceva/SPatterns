package com.company;

import java.net.MalformedURLException;
import java.net.URL;

public class ProxyPatternDemo {

    public static void main(String[] args) throws MalformedURLException {
	// write your code here
        ProxyImage image = new ProxyImage(
                new URL("https","pixabay.com",
                        "bg/photos/halloween/"));
        image.displayImage();
    }
}
