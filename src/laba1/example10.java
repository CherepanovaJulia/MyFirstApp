package laba1;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your year of birth: ");
        int year = in.nextInt();
        int age = 2023 - year;
        String string1 = "you are";
        String string2 = "old";

        System.out.println(string1 + "2023 - year = " + age + string2);
        in.close();
    }
}
