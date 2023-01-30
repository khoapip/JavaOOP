import thisinh.ThiSinh;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh managerCandidate = new TuyenSinh();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate: ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            managerCandidate.add(createCadidate(scanner, 'a'));
                            break;

                        }
                        case "b": {
                            managerCandidate.add(createCadidate(scanner, 'b'));
                            break;
                        }
                        case "c": {
                            managerCandidate.add(createCadidate(scanner, 'c'));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.print();
                    break;
                }
                case "3": {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    List candidate = managerCandidate.filterById(id);
                    if (candidate == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(candidate.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    public static ThiSinh createCadidate(Scanner scanner, char cate) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Priotity: ");
        int priority = scanner.nextInt();
        return new ThiSinh(id, name,address,priority, cate);


    }
}