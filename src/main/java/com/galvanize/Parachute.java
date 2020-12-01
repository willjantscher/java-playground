package com.galvanize;

public class Parachute {

    private double size = 150.0f;
    private String[] colors = {"magenta", "jade", "blackberry", "lime"};
    private boolean packed = true;
    private boolean inflated = false;
    private int numJumps = 0;

    public void open() {
        packed = false;
        inflated = true;

        numJumps++;
    }

    public void deflate() {
        inflated = false;
    }

    public void pack() {
        if (inflated) {
            System.out.println("Sorry, you cannot pack an inflated parachute!");
        } else {
            packed = true;
        }
    }
}
