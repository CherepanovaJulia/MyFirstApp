package laba1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int n1  = in.nextInt();
        int n2  = n1 - 1;
        int n3 = n1 + 1;
        int n4 = n1 + n2 + n3 + n1 * n2 + n1 * n3 + n2 * n3;

        System.out.println("Number 1: " + n1);
        System.out.println("Number 2: " + n2);
        System.out.println("Number 3: " + n3);
        System.out.println("Number 4: " + n4);
        in.close();

    }
}
