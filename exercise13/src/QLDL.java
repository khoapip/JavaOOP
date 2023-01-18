
import NhanVien.*;
import Exception.*;

import java.util.Scanner;

public class QLDL {

    private DataBase database = new DataBase();

    /**
     * @param type
     * @return Employee
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public void insert(int type) {

        Scanner scanner = new Scanner(System.in);
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
            insert(type);
        } catch (PhoneException e) {
            insert(type);
        } catch (EmailException e) {
            insert(type);
        } catch (FullNameException e) {
            insert(type);
        }

        Employee employee = null;
        if (type == 0) {
            employee = insertExperience(name, email, birthday, phone);
        }
        if (type == 1) {
            employee = insertFresher();
        }
        if (type == 2) {
            employee = insertIntern();
        }
        this.database.add(employee);
    }

    private Expert insertExperience(String name, String email, String birthday, String phone) {

        Expert e = new Expert()
    }

    private Intern insertIntern() {

        Intern intern = new Intern();

        return intern;
    }

    private Fresher insertFresher() {
        Fresher fresher = new Fresher();

        return fresher;
    }

    public void update() {
        System.out.print("Input ID to update: ");
        Scanner s = new Scanner(System.in);

        String id = s.nextLine();
        Employee employee = this.database.findById(id);
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