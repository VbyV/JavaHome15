package ru.netology.javaqa.JavaHome15;

public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int price;
    protected String airFrom;
    protected String airTo;
    protected int time;

    public Ticket(int id, int price, String airFrom, String airTo, int time){
    this.id = id;
    this.price = price;
    this.airFrom = airFrom;
    this.airTo = airTo;
    this.time = time;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAirFrom() {
        return airFrom;
    }

    public void setAirFrom(String airFrom) {
        this.airFrom = airFrom;
    }

    public String getAirTo() {
        return airTo;
    }

    public void setAirTo(String airTo) {
        this.airTo = airTo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }

    }
}
