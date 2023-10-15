package laba1;


import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int year = in.nextInt();
        int age = 2023 - year;

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        in.close();
    }
}
