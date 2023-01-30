
import tailieu.Bao;
import tailieu.Sach;
import tailieu.TaiLieu;
import tailieu.TapChi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach managerDocument = new QuanLySach();
        while (true) {
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category: ");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Newspaper");
                    System.out.println("Enter c: to insert Journal");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter ID: ");
                            int id = scanner.nextInt();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter author: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("Enter page number: ");
                            int pageNumber = scanner.nextInt();
                            TaiLieu book = new Sach(id, nxb, number, author, pageNumber);
                            managerDocument.add(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                            System.out.print("Enter ID: ");
                            int id = scanner.nextInt();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter Day issue: ");
                            int dayIssue = scanner.nextInt();
                            TaiLieu newspaper = new Bao(id, nxb, number, dayIssue);
                            managerDocument.add(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter ID: ");
                            int id = scanner.nextInt();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter issue number : ");
                            String issueNumber = scanner.nextLine();
                            System.out.print("Enter issue month : ");
                            int issueMonth = scanner.nextInt();
                            TaiLieu journal = new TapChi(id, nxb, number, issueNumber, issueMonth);
                            managerDocument.add(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            String type = "Sach";
                            managerDocument.searchType(type);
                            break;
                        }
                        case "b": {
                            String type = "Bao";
                            managerDocument.searchType(type);
                            break;
                        }
                        case "c":
                            String type = "Tap Chi";
                            managerDocument.searchType(type);
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    managerDocument.print();
                    break;
                }
                case "4": {
                    System.out.print("Enter id to remove: ");
                    int id = scanner.nextInt();
                    managerDocument.deleteByID(id);
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
            }

        }
    }

}