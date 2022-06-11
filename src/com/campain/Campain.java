package com.campain;

import java.util.Date;

public class Campain {
    private String name;
    private int discountRate;
    private String startDate;
    private String finishDate;

    public Campain(String name, int discountRate, String startDate, String finishDate) {
        this.name = name;
        this.discountRate = discountRate;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}
