
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLDL qldl = new QLDL();
        Scanner scanner = ScannerFac.getScanner();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To search ");
            System.out.println("Enter 3: To Update ");
            System.out.println("Enter 4: To print");
            System.out.println("Enter 5: To exit");

            System.out.println("Set Choice: ");
            Integer ch = scanner.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Set input employee Type");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    qldl.insert(type);
                    break;
                }
                case 2: {
                    System.out.println("Type 1 to search by ID, type 2 to search by type");
                    ch = scanner.nextInt();
                    scanner.nextLine();
                    if (ch == 1){
                        System.out.println("Insert ID");
                        String id = scanner.nextLine();
                        qldl.findByID(id);
                    }
                    if (ch == 2){
                        System.out.println("Insert Employee Level");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        qldl.findByType(id);
                    }
                    break;

                }
                case 3: {
                    qldl.update();
                    break;

                }
                case 4:{
                    qldl.print();
                    break;

                }

                case 5:{
                    System.exit(1);
                    break;

                }
            }
        }
    }
}