import java.util.*;
public class Main {
    public static void main(String [] args){
        Person person=new Person("Arushi","Ganeshpur","9988776655","demo@gmail.com");
        Student student=new Student("Simran","Ramnagar","7986776655",
                "demo2@gmail.com", Student.FRESHMAN);
        Employee employee=new Employee("Sanjana","Noida","9999999999",
                "demo3@gmail.com",910,60000);
        Faculty faculty=new Faculty("Muskan","Gadarpur","9988888888",
                "demo4@gmail.com",101,50000,"4pm to 6pm","Professor");
        Staff staff=new Staff("Ayan","Ganeshpur","9988776656",
                "demo5@gmail.com", 12,650000,"Executive");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
