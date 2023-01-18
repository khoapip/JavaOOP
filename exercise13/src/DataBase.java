import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import NhanVien.*;
public class DataBase {
    List<Employee> data;
    public DataBase(){
        this.data = new ArrayList<Employee>();
    }

    public Employee findById(String id) {
        return this.data.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }


    public void deleteById(String id) {
        data.removeIf(employee -> employee.getId().equals(id));
    }

    public void add(Employee e){
        if (data.stream().noneMatch(employee -> employee.getId().equals(e.getId()))){
            System.out.println("ID khong ton tai, them nhan vien moi");
            data.add(e);
        }else{
            System.out.println("Sua nhan vien");
            data.stream().map(employee -> employee.getId().equals(e.getId()) ? e : employee);
        }
    }

    public List<Employee> findByType(int type) {
        return this.data.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Expert;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

}
