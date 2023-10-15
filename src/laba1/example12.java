package laba1;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        int Year  = 2023 - age;

        System.out.println("year of birth: " + Year);
        in.close();
    }
}
