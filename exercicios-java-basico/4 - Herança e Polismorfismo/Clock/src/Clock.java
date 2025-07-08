public abstract sealed class Clock permits BRLClock, USClock {

    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = Math.min(hour, 24);
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = Math.min(minute, 59);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = Math.min(second, 59);
    }

    public String format(int value) {
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    public String getTime() {
        return format(hour) + ":" + format(minute) + ":" + format(second);
    }

    public abstract Clock convertTime(Clock clock);
}
