package com.Other;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public Time add(Time other) {
        int totalSeconds = this.getSeconds() + other.getSeconds();
        int additionalMinutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        int totalMinutes = this.getMinutes() + other.getMinutes() + additionalMinutes;
        int additionalHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;

        int totalHours = this.getHours() + other.getHours() + additionalHours;

        return new Time(totalHours, remainingMinutes, remainingSeconds);
    }

    public Time subtract(Time other) {
        int totalSeconds = this.getSeconds() - other.getSeconds();
        int subtractedMinutes = 0;

        if (totalSeconds < 0) {
            totalSeconds += 60;
            subtractedMinutes++;
        }

        int totalMinutes = this.getMinutes() - other.getMinutes() - subtractedMinutes;
        int subtractedHours = 0;

        if (totalMinutes < 0) {
            totalMinutes += 60;
            subtractedHours++;
        }

        int totalHours = this.getHours() - other.getHours() - subtractedHours;

        return new Time(totalHours, totalMinutes, totalSeconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}


public class Program{
    public static void main(String[] args) {
        Time time1 = new Time(13,55,40);
        Time time2 = new Time(5,35,30);

        System.out.print("Time 1: ");
        time1.displayTime();

        System.out.print("Time 2: ");
        time2.displayTime();

        System.out.print("Time 1 + Time 2: ");
        Time sum = time1.add(time2);
        sum.displayTime();

        System.out.print("Time 1 - Time 2: ");
        Time difference = time1.subtract(time2);
        difference.displayTime();
    }
}
