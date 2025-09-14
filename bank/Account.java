package bank;
import java.util.*;
public class Account extends Bank {
    long acNo;
// @Override
    public void info(String name, int age, long acNo) {
        this.acNo = acNo;
        this.name = name;
        this.age = age;
        System.out.println(this.name + "  of age " + this.age + " have account number : " + this.acNo);

    }

}
