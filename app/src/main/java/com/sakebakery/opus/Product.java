package com.sakebakery.opus;

import android.graphics.drawable.Drawable;

public class Product {

    public String title;
    public Drawable productImage;
    public String flavor;
    public String description;
    public int price;
    public String icing;
    public boolean selected;

    public Product(String title, Drawable productImage,String flavor, String description,
                   int price,String icing) {
        this.title = title;
        this.productImage = productImage;
        this.flavor=flavor;
        this.description = description;
        this.price = price;
        this.icing=icing;
    }

}