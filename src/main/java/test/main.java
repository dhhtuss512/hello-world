package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Admin on 05/30/17.
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account account1 = (Account) context.getBean("account1");
        System.out.println("\n => account 1 data: ");
        System.out.println("ID: " + account1.getId());
        System.out.println("OwnerName: " + account1.getOwnerName());
        System.out.println("Blance: " + account1.getBlance());

        Account account2 = (Account) context.getBean("account2");
        System.out.println("\n => account 2 data: ");
        System.out.println("ID: " + account2.getId());
        System.out.println("OwnerName: " + account2.getOwnerName());
        System.out.println("Blance: " + account2.getBlance());
    }
}
