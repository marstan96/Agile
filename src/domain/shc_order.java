/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author User
 */
public class shc_order {
    
    private String restaurant,food,drink,day,time,hour,mimute;
    private int quantity;

    public shc_order() {
    }

    public shc_order(String restaurant, String food, String drink, String day, String time, int quantity, String hour, String mimute) {
        this.restaurant = restaurant;
        this.food = food;
        this.drink = drink;
        this.day = day;
        this.time = time;
        this.quantity = quantity;
        this.hour = hour;
        this.mimute = mimute;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMimute() {
        return mimute;
    }

    public void setMimute(String mimute) {
        this.mimute = mimute;
    }
    
}
