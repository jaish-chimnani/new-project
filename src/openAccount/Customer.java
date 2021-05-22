package openAccount;

public class Customer {
    private static long accountNumber;
    private static String nameOfCustomer;
    private static byte age;
    private static String gender;
    private static long phoneNumber;
    private static String address;
    private static String nationality;

    public Customer(String nameOfCustomer, byte age, String gender, long phoneNumber, String address, String nationality) {
        Customer.nameOfCustomer = nameOfCustomer;
        Customer.age = age;
        Customer.gender = gender;
        Customer.phoneNumber = phoneNumber;
        Customer.address = address;
        Customer.nationality = nationality;
    }

    public static long getAccountNumber() {
        return accountNumber;
    }

    public static String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public static byte getAge() {
        return age;
    }

    public static String getGender() {
        return gender;
    }

    public static long getPhoneNumber() {
        return phoneNumber;
    }

    public static String getAddress() {
        return address;
    }

    public static String getNationality() {
        return nationality;
    }
}