/*
 * . Create a class called Person with private properties like name, age, and address. Provide public getter and setter methods for these properties. Write a program that creates an instance of the Person class, sets values for its properties using the setter methods, and displays the values using the getter methods.
 */
class Person{
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    
}
public class ThirdQues {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("Rahul");
        p.setAge(12);
        p.setAddress("Noida Sector 32A");

        System.out.println("Name : "+p.getName());
        System.out.println("Age : "+p.getAge());
        System.out.println("Address : "+p.getAddress());
    }
}
