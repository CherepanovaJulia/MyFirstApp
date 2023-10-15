package laba1;


import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
         String day = in.nextLine() ;

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input day's number of month: ");
        int number = in.nextInt();

        System.out.println("today is: " + number + month + day);
        in.close();

    }
}
