package exam2;

public class Customer {
    String name;
    String contactInfo;


    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public Customer(String name, String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
    }
}
