package com.company.assessment1;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Enter a name\n2.Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
       do {


           int count = 0;

           while(choice==1)
           {
               count++;
               System.out.println("Enter a name :");
               person.name = scanner.next();
               //UUID
               person.ID = UUID.randomUUID();
               person.setID(person.ID);
               person.setName(person.name);
               System.out.println(person.toString());
               System.out.println("1.Enter a name\n2.Exit");
               System.out.println("Enter your choice: ");
               choice = scanner.nextInt();
           }
           if(choice==2)
           {
               System.out.println("Exiting...");
           }

           else
           {
               System.out.println("Invalid choice");

           }


          }while(choice!=2);


    }
}
