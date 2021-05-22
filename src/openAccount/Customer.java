package openAccount;

public class Customer {
    private long accountNumber;
    private String nameOfCustomer;
    private byte age;
    private String gender;
    private long phoneNumber;
    private String address;
    private String nationality;

    public Customer(long accountNumber, String nameOfCustomer, byte age, String gender, long phoneNumber, String address, String nationality) {
        this.accountNumber = accountNumber;
        this.nameOfCustomer = nameOfCustomer;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.nationality = nationality;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public byte getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }
}