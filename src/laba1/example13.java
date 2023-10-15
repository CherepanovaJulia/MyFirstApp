package laba1;


import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number 1: ");
        int n1 = in.nextInt();

        System.out.println("Input number 2: ");
        int n2 = in.nextInt();

        int n3 = n1 + n2;

        System.out.println("result: " + n3);
        in.close();



    }

}
