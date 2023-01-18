package giadinh;

public class Nguoi {
    private String name;
    private int age;
    private String job;
    private String cmnd;

    public Nguoi(String name, int age, String job, String cmnd) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.cmnd = cmnd;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Nguoi " + getName() + " " + getAge() + " " + getJob() + " " + getCmnd();
    }
}