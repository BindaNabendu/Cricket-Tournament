package com.nabendu;

public class Player extends People{
    public int number;
    public String position;
    public Player(String name, int number, String position, String address) {
        super(name, address);
        this.number = number;
        this.position = position;
    }
}
