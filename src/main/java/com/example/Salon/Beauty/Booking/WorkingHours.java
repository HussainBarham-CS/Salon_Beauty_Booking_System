package com.example.Salon.Beauty.Booking;


public class WorkingHours extends Schedule{

    private int startTime;
    private int endTime;

    public WorkingHours(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getStartTime() {
        return startTime;
    }
}
