package laba1;
import java.util.Scanner;

public class example7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input yor age: ");
        int age = in.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Age: " + age);
        in.close();
    }
}
