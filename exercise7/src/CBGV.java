import java.util.ArrayList;
import java.util.List;

public class CBGV {
    private List<Nguoi> teachers;

    public CBGV() {
        this.teachers = new ArrayList<>();
    }

    public void add(Nguoi teacher) {

        if (teachers.stream().anyMatch(nguoi -> nguoi.getId().equals(teacher.getId()))){
            this.teachers.add(teacher);
        }
    }

    public void deleteById(String id) {
        this.teachers.removeIf(teacher -> teacher.getId().equals(id));
    }

    public double getSalary(String id) {
        Nguoi teacher = this.teachers.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (teacher == null) {
            return 0;
        }
        return teacher.getLuong() + teacher.getThuong() + teacher.getPhat();
    }
}