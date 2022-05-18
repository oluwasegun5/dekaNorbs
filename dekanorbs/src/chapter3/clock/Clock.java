package chapter3.clock;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (this.hour >= 24) this.hour = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (this.minute >= 60) this.minute = 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
        if(second >= 60) second = 0;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}
