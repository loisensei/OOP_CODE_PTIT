package QuanLyBaiTapNhom2;

public class Member implements Comparable<Member>{
    private String msv,name,phoneNumber,topic;
    private int groupId;
    public Member(String msv, String name, String phoneNumber, int groupId){
        this.msv = msv;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }
    public int getGroupId(){
        return this.groupId;
    }
    public String toString(){
        return msv + " " + name + " " + phoneNumber+" "+groupId+" "+topic;
    }

    @Override
    public int compareTo(Member o) {
        if(this.msv.compareTo(o.msv)>0) return 1;
        else if(this.msv.compareTo(o.msv)<0) return -1;
        return 0;
    }
}
