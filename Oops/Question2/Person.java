import java.util.*;

public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    //Default Person Object
    public Person(){
        this("Unknown","Unknown","Unknown","Unknown");
    }

    public Person(String name, String address, String phone, String email) {
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.email=email;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public void setName(){
        this.name=name;
    }

    public void setAddress(){
        this.address=address;
    }

    public void setPhone(){
        this.phone=phone;
    }

    public void setEmail(){
        this.phone=phone;
    }

    public String toString(){
        return "\nName: "+name+"\nAddress: "+address+"\nPhone: "+phone+"\nEmail: "+email;
    }
}
