/**
 * Person
 */
public class Person {
    private int number;
    private String name;
    private String phone;
    private String address;
    private String cpf;


    public Person(int number, String name, String phone, String address, String cpf) {
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.cpf = cpf;
    }


    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }


    public String getPhone() {
        return phone;
    }


    public String getAddress() {
        return address;
    }


    public String getCpf() {
        return cpf;
    }
    
}