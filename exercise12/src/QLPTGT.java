import phuongtien.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLPTGT {
    List<Vehicle> data;
    public QLPTGT(){
        data = new ArrayList<Vehicle>();
    }

    public void add(Vehicle v){
        if  (!data.stream().anyMatch(vehicle -> vehicle.getId() == v.getId())){
            data.add(v);
        }
    }


    public void delete(int id){
        data.removeIf(vehicle -> vehicle.getId() == id);
    }

    public List<Vehicle> filterColor(String color){
        return data.stream().filter(vehicle -> vehicle.getColor().equals(color)).collect(Collectors.toList());
    }

    public List<Vehicle> filterBrand(String brand){
        return data.stream().filter(vehicle -> vehicle.getBrand().equals(brand)).collect(Collectors.toList());
    }

    public void exit(){
        System.exit(1);
    }
}
