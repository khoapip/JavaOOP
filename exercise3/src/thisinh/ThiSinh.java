package thisinh;

import java.util.ArrayList;
import java.util.Arrays;

public class ThiSinh {
    private int priority;
    private String name;
    private String location;

    private String[] subjects;

    char khoi;
    private final int id;

    public ThiSinh(int id, String name, String location, int priority, char khoi){
        this.id = id;
        this.priority = priority;
        this.name = name;
        this.location = location;
        this.khoi = khoi;
        this.setSubjects();
    }

    public void setSubjects() {
        if (this.khoi == 'A'){
            this.subjects = new String[]{"Toan", "Ly", "Hoa" };
        }
        if (this.khoi == 'B'){
            this.subjects = new String[]{"Toan", "Sinh", "Hoa" };
        }
        if (this.khoi == 'C'){
            this.subjects = new String[]{"Van", "Su", "Dia" };
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString(){
        return "Thi Sinh " + getName() + " sbd " + getId() + " uu tien " + getPriority() + " dia chi " + getLocation() + " khoi thi " + Arrays.toString(this.subjects) ;
    }
}
