
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLDL qldl = new QLDL();
        Scanner scanner = ScannerFac.getScanner();
        Integer ch = scanner.nextInt();
        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To search: ");
            System.out.println("Enter 3: To Update: ");
            System.out.println("Enter 4: To exit:");
            switch (ch) {
                case 1: {
                    int type = scanner.nextInt();
                    qldl.insert(type);
                }
                case 2: {
                    System.out.println("Type 1 to search by ID, type 2 to search by type");
                    ch = scanner.nextInt();
                    if (ch == 1){
                        System.out.println("Insert ID");
                        String id = scanner.next();
                        qldl.findByID(id);
                    }
                    if (ch == 2){
                        System.out.println("Insert Employee Level");
                        int id = scanner.nextInt();
                        qldl.findByType(id);
                    }
                }
                case 3: {
                    qldl.update();
                }
                case 4:{
                    System.exit(1);
                }
            }
        }
    }
}