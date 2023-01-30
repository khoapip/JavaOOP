import giadinh.GiaDinh;
import giadinh.HoGiaDinh;
import giadinh.Nguoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This is sudo code. To overview how to do it.
// You can finish by fill you code

public class Main {
    public static void main(String[] args) {
        HoGiaDinh town = new HoGiaDinh();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            // Input foreach famili

            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();

            // Enter person number in family
            List<Nguoi> persons = new ArrayList<>();
            System.out.println("Enter number person");
            int number = scanner.nextInt();

            for (int j = 0; j < number; j++) {
                System.out.println("Input Name");
                String name = scanner.nextLine();
                System.out.println("Input Age");
                int age = scanner.nextInt();
                System.out.println("Input Job");
                String job = scanner.nextLine();
                System.out.println("Input cmnd");
                String cmnd = scanner.nextLine();

                persons.add(new Nguoi(name, age, job, cmnd));
            }

            // After done input
            town.themNha(new GiaDinh(persons,address ));


        }
    }
}