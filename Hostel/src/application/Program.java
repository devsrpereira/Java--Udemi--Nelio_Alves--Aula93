package application;

import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hostel = new String[9];

        System.out.printf("%nHow manny rooms wills be rented? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.printf("%nRent #%d%n",(i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();

            Rent rent = new Rent(name, email, room);
            hostel[room] = String.valueOf(rent);
        }

        System.out.printf("%nBusy rooms:%n");
        for (String s : hostel) {
            if (s != null) {
                System.out.println(s);
            }
        }

        System.out.println();
        sc.close();
    }
}
