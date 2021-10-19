package timesort;

public class Time implements Comparable<Time> {
    private int hour,minute,second;
    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public int compareTo(Time o) {
        if(this.hour > o.hour) return 1;
        if(this.hour < o.hour) return -1;
        return compareMinutes(o);
    }
    private int compareMinutes(Time o){
        if(this.minute > o.minute)  return 1;
        if(this.minute < o.minute) return -1;
        return compareSeconds(o);
    }
    private int compareSeconds(Time o){
        return Integer.compare(this.second, o.second);
    }
    public String toString(){
        return hour +" "+ minute+" "+second;
    }
}
