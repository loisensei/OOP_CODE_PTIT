package TinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Gamer implements Comparable<Gamer>{
    private String  pcode,name;
    private Date timeIn,timeOut,timeplayer;
    public Gamer(String pcode, String name, String timeIn, String timeOut) throws ParseException {
        this.pcode = pcode;
        this.name = name;
        this.timeIn = new SimpleDateFormat("hh:mm").parse(timeIn);
        this.timeOut = new SimpleDateFormat("hh:mm").parse(timeOut);
        this.timeplayer = new SimpleDateFormat("hh:mm").parse(playingTime());
    }
    private String playingTime()  {
        long tmp = timeOut.getTime() - timeIn.getTime();
        long hours = TimeUnit.MILLISECONDS.toHours(tmp);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tmp);
        minutes = minutes - hours*60;
        return hours+":"+minutes;
    }
    public String toString() {
            return pcode +" "+ name+" "+ timeplayer.getHours()+" gio "+timeplayer.getMinutes()+" phut";
    }

    @Override
    public int compareTo(Gamer o) {
        if(this.timeplayer.compareTo(o.timeplayer) < 0) return 1;
        else if(this.timeplayer.compareTo(o.timeplayer)>0) return -1;
        return 0;
    }
}
