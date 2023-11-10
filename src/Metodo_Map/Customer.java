package Metodo_Map;

public class Customer {
    private String name;
    private String phoneNumber;
    private String gmail;

    public Customer(String name, String phoneNumber, String gmail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}