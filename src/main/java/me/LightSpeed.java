package me;

public class LightSpeed {
    public static void main(String[] args) {
        final int SPEED_OF_LIGHT = 186000; // miles per second
        final long days = 365; // number of days in a year
        long seconds = days * 24 * 60 * 60; // convert to seconds
        long distance = SPEED_OF_LIGHT * seconds;
        System.out.printf("In %d days, light will travel about %,d miles.", days, distance);
    }
}
