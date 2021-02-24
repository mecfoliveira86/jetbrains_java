import java.util.Scanner;

public class Cinema2 {
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
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        int option = scan.nextInt();
        if (option == 1) {
            printer(data);
        } else if (option == 2) {
            buy(data);
        } else if (option == 3) {
            stats(data);
        } else {
            System.exit(0);
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
        int rowUser;
        int colUser;
        boolean monitor = false;

        do {
            System.out.println("Enter a row number:");
            rowUser = sc.nextInt();

            System.out.println("Enter a seat number in that row:");
            colUser = sc.nextInt();

            if (rowUser > data.length || colUser > data[0].length) {
                System.out.println("Wrong input!");
                monitor = true;
            } else if (data[rowUser - 1][colUser - 1].equals("B")) {
                System.out.println("That ticket has already been purchased!");
                monitor = true;
            } else {
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
                monitor = false;
            }
        } while (monitor);
    }

    public static void stats(String[][] data) {
        int tickets = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j].equals("B")) {
                    tickets++;
                }
            }
        }
        String chairs = String.format("Number of purchased tickets: %d", tickets);
        System.out.println(chairs);
        double spaces = data.length * data[0].length;
        double percent = (tickets / spaces) * 100;
        String percentual = String.format("Percentage:  %.2f", percent);
        System.out.println(percentual + "%");
        int firstPart = 0;
        int secPart = 0;

        if ((data.length * data[0].length) <= 60) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    if (data[i][j].equals("B")) {
                        firstPart += 10;
                    }
                }
            }
        } else {
            for (int i = 0; i < data.length / 2; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    if (data[i][j].equals("B")) {
                        firstPart += 10;
                    }
                }
            }
            for (int i = data.length / 2; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    if (data[i][j].equals("B")) {
                        secPart += 8;
                    }
                }
            }
        }
        String income = String.format("Current income: $%d", firstPart + secPart);
        System.out.println(income);

        int firstIncome = 0;
        int secondIncome = 0;

        if ((data.length * data[0].length) <= 60) {
            firstIncome = data.length * data[0].length * 10;
        } else {
            for (int i = 0; i < data.length/2; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    firstIncome += 10;
                }
            }
            for (int i = data.length / 2; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    secondIncome += 8;
                }
            }
        }
        String incomeResult = String.format("Total income: $%d", firstIncome + secondIncome);
        System.out.println(incomeResult);
        menu(data);
    }

    public static void main(String[] args) {
        String[][] reference = start();
        menu(reference);
    }
}