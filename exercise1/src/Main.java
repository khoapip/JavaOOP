
import canbo.CanBo;
import canbo.CongNhan;
import canbo.KySu;
import canbo.NhanVien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB managerOfficer = new QLCB();
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name: ");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String branch = scanner.nextLine();
                            KySu engineer = new KySu(name, age, gender, branch);
                            managerOfficer.add(engineer);
                            System.out.println(engineer.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            int level = scanner.nextInt();
                            CongNhan worker = new CongNhan(name, age, gender, level);
                            managerOfficer.add(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            NhanVien staff = new NhanVien(name, age, gender, task);
                            managerOfficer.add(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.showInfo();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("ERROR");
                    continue;
            }

        }
    }

}