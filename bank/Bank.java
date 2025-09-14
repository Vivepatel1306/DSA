package bank;

public class Bank {
    String name;
    int age;

    public void info(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + " have age : " + this.age);
    }
}
