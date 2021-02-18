package cinema;

import java.util.Scanner;

public class Cinema {
    public static String[][] start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int cols = sc.nextInt();

        String[][] reference = new String[rows][cols];
        for(int i = 0; i< reference.length; i++) {
            for(int j = 0; j< reference[i].length; j++){
                reference[i][j] = "S";
            }
        }

        return reference;
    }

    public static void menu(String[][] data) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");
        int option = scan.nextInt();
        if (option == 1) {
            printer(data);
        } else if (option == 2) {
            buy(data);
        } else {
            return;
        }
    }

    public static void printer(String[][] data) {
        System.out.println("Cinema:");
        for(int i = 0; i < data[0].length; i++) {
            if (i == 0) {
                System.out.print("  " + (i + 1) + " ");
            } else {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " " + data[i][j] + " ");
                } else{
                    System.out.print(data[i][j] + " ");
                }

            }
                System.out.println();
            }
            menu(data);
        }

    public static void buy(String[][] data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int rowUser = sc.nextInt();

        System.out.println("Enter a seat number in that row:");
        int colUser = sc.nextInt();

        int first = data[0].length / 2;


        if (data.length * data[0].length <= 60) {
            System.out.println("Ticket price: $10");
        } else if (rowUser <= first) {
            System.out.println("Ticket price: $10");
        } else {
            System.out.println("Ticket price: $8");
        }

        data[rowUser - 1][colUser - 1] = "B";
        printer(data);
    }

    public static void main(String[] args) {
        String[][] reference = start();
        menu(reference);
    }
}