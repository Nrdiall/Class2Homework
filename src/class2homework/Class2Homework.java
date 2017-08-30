/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2homework;
import java.util.Scanner;
/**
 *
 * @author Naython
 */
public class Class2Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your first name?");
        String FirstName = keyboard.next();
        System.out.print("What is your last name?");
        String LastName = keyboard.next();
        System.out.print("What is your first name?");
        String FirstName2 = keyboard.next();
        System.out.print("What is your last name?");
        String LastName2 = keyboard.next();
        Person p = new Person(FirstName, LastName);
        Person c = new Person(FirstName2, LastName2);
        System.out.println(p.getFirstName() + " " + p.getLastName());
        System.out.println(c.getFirstName() + " " + c.getLastName());
        
    }
    
}
