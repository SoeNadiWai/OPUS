package com.sakebakery.opus;

import android.graphics.drawable.Drawable;

public class Product {

    public String title;
    public Drawable productImage;
    public String flavor;
    public String description;
    public String price;
    public boolean selected;

    public Product(String title, Drawable productImage,String flavor, String description,
                   String price) {
        this.title = title;
        this.productImage = productImage;
        this.flavor=flavor;
        this.description = description;
        this.price = price;
    }

}