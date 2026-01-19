package com.bagnballorganizer;
public class Ball {

    private String id;
    private String color;
    
 // size can be small , medium , large
    
    private String size; 

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
