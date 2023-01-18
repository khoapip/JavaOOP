import giadinh.*;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {


        HoGiaDinh hoGiaDinh = new HoGiaDinh();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Dia Chi:");
            scanner.nextLine();
            String address = scanner.nextLine();

            // Enter person number in family
            List<Nguoi> persons = new ArrayList<>();
            System.out.println("So Nguoi trong nha");
            int number = scanner.nextInt();

            for (int j = 0; j < number; j++) {
                System.out.println("Nhap Ten Nguoi");
                String name = scanner.next();
                System.out.println("Nhap tuoi");
                int age = scanner.nextInt();
                System.out.println("Nhap cccd");
                String id = scanner.next();
                System.out.println("Nhap Nghe Nghiep");
                String job = scanner.next();

                persons.add(new Nguoi(name, age, job, id));

            }

            hoGiaDinh.themNha(new GiaDinh(persons,address ));


        }
    }    }
}