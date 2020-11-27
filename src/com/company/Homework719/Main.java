package com.company.Homework719;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user1 = new User("admin.admin", "Admin");
        System.out.println("Enter admin1 password:");
        user1.setPassword(scanner.nextLine());
        User user2 = new User("admin1.admin1", "Admin");
        System.out.println("Enter admin2 password:");
        user2.setPassword(scanner.nextLine());
        User user3 = new User("user.user", "Customer");
        System.out.println("Enter customer1 password:");
        user3.setPassword(scanner.nextLine());
        User user4 = new User("user1.user1", "Customer");
        System.out.println("Enter customer2 password:");
        user4.setPassword(scanner.nextLine());
        User user5 = new User("user2.user2", "Customer");
        System.out.println("Enter customer3 password:");
        user5.setPassword(scanner.nextLine());
        User user6 = new User("user3.user3", "Customer");
        System.out.println("Enter customer4 password:");
        user6.setPassword(scanner.nextLine());
        User user7 = new User("user4.user4", "Customer");
        System.out.println("Enter customer5 password:");
        user7.setPassword(scanner.nextLine());
        User user8 = new User("user5.user5", "Customer");
        System.out.println("Enter customer6 password:");
        user8.setPassword(scanner.nextLine());
        User user9 = new User("user6.user6", "Customer");
        System.out.println("Enter customer7 password:");
        user9.setPassword(scanner.nextLine());
        User user10 = new User("user7.user7", "Customer");
        System.out.println("Enter customer8 password:");
        user10.setPassword(scanner.nextLine());

        ArrayList<User> arrayListUsers = new ArrayList<>();
        arrayListUsers.add(user1);
        arrayListUsers.add(user2);
        arrayListUsers.add(user3);
        arrayListUsers.add(user4);
        arrayListUsers.add(user5);
        arrayListUsers.add(user6);
        arrayListUsers.add(user7);
        arrayListUsers.add(user8);
        arrayListUsers.add(user9);
        arrayListUsers.add(user10);

        for (int i = 0; i < arrayListUsers.size(); i++) {
            System.out.println("Usermane - " + arrayListUsers.get(i).getUsername() + " , password - " + arrayListUsers.get(i).getPassword() + " , role - " + arrayListUsers.get(i).getRole() + ".");
        }
    }
}
