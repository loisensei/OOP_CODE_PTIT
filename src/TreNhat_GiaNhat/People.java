package TreNhat_GiaNhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People implements Comparable<People> {
    private String name;
    private Date birthDate;
    public People (String name, String birthDate) throws ParseException {
        this.name = name;
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
    }
    public String getName() {
        return this.name = name;
    }
    public String toString() {
        return name+" "+ new SimpleDateFormat("dd/MM/yyyy").format(birthDate);
    }
    @Override
    public int compareTo(People o) {
        if(this.birthDate.after(o.birthDate)) return -1;
        else if(this.birthDate.before(o.birthDate)) return 1;
        return 0;
    }
}
