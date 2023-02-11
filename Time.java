import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);

        System.out.println(t1);

        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        t1.setTime(23, 59, 58);
        System.out.println(t1);

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
    protected int hour;
    protected int minute;
    protected int second;
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    int getHour() {
        return hour;
    }
    int getMinute() {
        return minute;
    }
    int getSecond() {
        return second;
    }
    void setHour(int hour) {
        this.hour = hour;
    }
    void setMinute(int minute) {
        this.minute = minute;
    }
    void setSecond(int second) {
        this.second = second;
    }
    void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString() {
        String result = "";
        if (hour > 10) {
            result += hour;
        }
        else result += "0" + hour;
        result += ":";
        if (minute > 10) result += minute;
        else result += "0" + minute;
        result += ":";
        if (second > 10) result += second;
        else result += "0" +  second;
        return result;
    }
    Time nextSecond() {
        second++;
        if (second == 60) {
            minute++;
            second = 0;
        }
        if (minute == 60) {
            hour++;
            minute = 0;
        }
        if (hour == 24) {
            hour = 0;
        }
        return(this);
    }
    Time previousSecond() {
        second--;
        if (second == -1) {
            minute--;
            second = 59;
        }
        if (minute == -1) {
            hour--;
            minute = 59;
        }
        if (hour == -1) {
            hour = 23;
        }
        return(this);
    }
}