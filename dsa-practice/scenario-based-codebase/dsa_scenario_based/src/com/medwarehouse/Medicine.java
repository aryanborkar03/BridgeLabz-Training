package com.medwarehouse;
public class Medicine {

    private String name;
 // format: YYYYMMDD for easy comparison
    private int expiryDate; 

    public Medicine(String name, int expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public int getExpiryDate() {
        return expiryDate;
    }
}
