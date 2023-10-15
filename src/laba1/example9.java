package laba1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input total number of days in a month: ");
        int total = in.nextInt();

        String string1 = "This";
        String string2 = "consists of";
        String string3 = (month);

        System.out.println(string1 + string3 + string2 + "total number of days" + total);
        in.close();

    }
}
