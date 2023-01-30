import java.util.Scanner;

public class ScannerFac {

    private static Scanner SCANNER;

    public static Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }
}