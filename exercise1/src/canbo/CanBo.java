package canbo;

public class CanBo {
    String name;
    int age;
    String gender;
    public CanBo(String name, int age,  String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public String toString(){

        return "Can Bo: " + getName() + " " + getGender() + " " +  getAge();
    }
}
