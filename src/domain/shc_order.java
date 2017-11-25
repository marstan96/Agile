/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class shc_order implements Serializable {
    
    private String restaurant,food,drink,day,time,hour,minute;
    private int quantity,prio,orderNo;
    private static int nextnum = 5000;

    public shc_order() {
        this.orderNo = nextnum++;
    }

    public shc_order(String restaurant, String food, String drink, String day, String time, int quantity, String hour, String minute) {
        this.restaurant = restaurant;
        this.food = food;
        this.drink = drink;
        this.day = day;
        this.time = time;
        this.quantity = quantity;
        this.hour = hour;
        this.minute = minute;
        calprio();
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

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public static int getNextnum() {
        return nextnum;
    }

    public static void setNextnum(int nextnum) {
        shc_order.nextnum = nextnum;
    }
    
    public void calprio()
    {
        int inthour = Integer.parseInt(hour);
        int intminute = Integer.parseInt(minute);
        String strtime = this.time;
        
        if(strtime.equals("AM"))
        {
            
        }
    }

    @Override
    public String toString() {
        String str = String.format("%d %s:%s %s   %-30s %s & %s x %d\n", orderNo,hour,minute,time,restaurant,food,drink,quantity);
        return str;
    }
    
}
