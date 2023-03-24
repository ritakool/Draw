import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice = 0;

        while (choice != 4){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("5. Print heart");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (byte i = 1; i <= 4; i++) {
                        System.out.print("\n");
                        for (byte j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    for (byte i = 1; i <= 7; i++) {
                        System.out.print("\n");
                        for (byte j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");

                    for (byte i = 7; i >= 1; i--) {
                        System.out.print("\n");
                        for (byte j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");

                    for (byte i = 1; i <= 7; i++) {
                        System.out.print("\n");
                        for (byte j = 1; j <= i; j++) {
                            System.out.print("  ");
                        }
                        for (byte j = i; j <= 7; j++) {
                            System.out.print(" *");
                        }
                    }
                    System.out.print("\n");

                    for (byte i = 7; i >= 1; i--) {
                        System.out.print("\n");
                        for (byte j = 1; j <= i; j++) {
                            System.out.print("  ");
                        }
                        for (byte j = i; j <= 7; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");

                    for (byte i = 7; i >= 1; i--) {
                        System.out.print("\n");
                        for (byte j = 1; j <= i; j++) {
                            System.out.print("  ");
                        }
                        for (byte j = i; j < 7; j++) {
                            System.out.print("* ");
                        }
                        for (byte j = i; j <= 7; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                    break;
                case 5:
                    System.out.println("Print heart");
                    for (int i = 1; i <= 6; i += 2) {
                        for (int j = 1; j <= 6 - i; j += 2) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (byte i = 1; i <= 6; i++) {

                        for (byte j = 1; j <= i; j++) {
                            System.out.print("  ");
                        }
                        for (byte j = i; j < 6; j++) {
                            System.out.print("* ");
                        }
                        for (byte j = i; j <= 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(4);
            }
        }
    }
}