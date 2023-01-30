
import NhanVien.*;
import Exception.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLDL {

    private DataBase database ;

    public QLDL(){
        database= new DataBase();
    }

    public Employee findByID(String id){
        return database.findById(id);
    }

    public List<Employee> findByType(int type){
        return database.findByType(type);
    }


    /**
     * @param type
     * @return Employee
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public void insert(int type) {

        Scanner scanner = ScannerFac.getScanner();
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.print("Input Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();
        System.out.print("Input DOB: ");
        String birthday = scanner.nextLine();

        try {
            checkData(name, email, birthday, phone);
        } catch (BirthDayException e) {
            System.out.println("Invalid Birthday");
            insert(type);
        } catch (PhoneException e) {
            System.out.println("Invalid Phone");
            insert(type);
        } catch (EmailException e) {
            System.out.println("Invalid email");
            insert(type);
        } catch (FullNameException e) {
            System.out.println("Invalid fullname");
            insert(type);
        }

        Employee employee = null;
        if (type == 0) {
            employee = insertExperience(id, name, email, birthday, phone);
        }
        if (type == 1) {
            employee = insertFresher(id, name, email, birthday, phone);
        }
        if (type == 2) {
            employee = insertIntern(id, name, email, birthday, phone);
        }
        this.database.add(employee);
    }

    public List<Certificate> getCert(){
        List<Certificate> certs = new ArrayList<>();
        Scanner scanner = ScannerFac.getScanner();
        System.out.println("Input number of cert to input");
        int no = scanner.nextInt();
        for (int i = 0; i < no; i ++){
            System.out.println("Input cert id");
            String id = scanner.next();
            System.out.println("Input cert name");
            String name = scanner.next();
            System.out.println("Input cert rank");
            String rank = scanner.next();
            System.out.println("Input cert date");
            String date = scanner.next();
            certs.add(new Certificate(id, name, rank , date));
        }
        return certs;
    }
    private Expert insertExperience(String id, String name, String email, String birthday, String phone) {
        Scanner scanner = ScannerFac.getScanner();
        System.out.print("Input Year of Exp: ");
        int expYear = scanner.nextInt();
        System.out.print("Input Pro Skill: ");
        String proskill = scanner.nextLine();
        List<Certificate> cert = getCert();
        return new Expert(id, name, email, birthday, phone, cert, expYear, proskill);
    }

    private Intern insertIntern(String id, String name, String email, String birthday, String phone) {
        Scanner scanner = ScannerFac.getScanner();
        System.out.print("Input semester");
        String semester = scanner.next();
        System.out.print("Input School: ");
        String school = scanner.nextLine();
        System.out.print("Input major: ");
        String major = scanner.nextLine();
        List<Certificate> cert = getCert();
        return new Intern(id, name, email, birthday, phone, cert, semester, school, major);
    }

    private Fresher insertFresher(String id, String name, String email, String birthday, String phone) {
        Scanner scanner = ScannerFac.getScanner();
        System.out.print("Input grad date");
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.print("Input School Grad: ");
        String school = scanner.nextLine();
        System.out.print("Input rank: ");
        String rank = scanner.nextLine();
        List<Certificate> cert = getCert();
        return new Fresher(id, name, email, birthday, phone, cert, date, school, rank);
    }

    public void update() {
        System.out.print("Input ID to update: ");
        Scanner scanner = ScannerFac.getScanner();

        String id = scanner.nextLine();
        Employee employee = this.database.findById(id);

        if (employee != null){
            System.out.print("Input Name: ");
            String name = scanner.nextLine();
            System.out.print("Input Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Input Email: ");
            String email = scanner.nextLine();
            System.out.print("Input DOB: ");
            String birthday = scanner.nextLine();

            try {
                checkData(name, email, birthday, phone);
            } catch (BirthDayException e) {
                System.out.println("Invalid Birthday");
            } catch (PhoneException e) {
                System.out.println("Invalid Phone");
            } catch (EmailException e) {
                System.out.println("Invalid email");
            } catch (FullNameException e) {
                System.out.println("Invalid fullname");
            }
            employee.setName(name);
            employee.setDOB(birthday);
            employee.setEmail(email);
            employee.setPhone(phone);
        }

    }

    public void delete() {
        System.out.print("Input ID to delete: ");
        Scanner s = new Scanner(System.in);
        String id = s.nextLine();
        this.database.deleteById(id);
    }


    private void checkData( String name , String email, String birthday, String phone) throws BirthDayException, PhoneException, EmailException, FullNameException {
        birthdayCheck(birthday);
        emailCheck(email);
        nameCheck(name);
        phoneCheck(phone);
    }

    private void birthdayCheck(String birthday) throws BirthDayException{
        boolean isValidFormat = birthday.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})");
        if (!isValidFormat){
            throw new  BirthDayException("Invalid date Format");
        }
    }

    private void nameCheck(String name) throws FullNameException{
        if (name == null ||  name.isEmpty()) {
            throw new FullNameException("Name null");
        }
        String[] names = name.split("\\s+");
        if (names.length < 2){
            throw new FullNameException("Name too short");
        }
    }

    private void emailCheck(String email) throws EmailException{
        if (email == null || !email.contains("@")){
            throw new EmailException("Invalid Email");
        }
    }

    private void phoneCheck(String phone) throws PhoneException{
        if (!phone.startsWith("09") || !phone.startsWith("08")){
            throw new PhoneException("Invaid phone number");
        }
    }

}