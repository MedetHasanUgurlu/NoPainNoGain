package Java101;

import java.util.Scanner;

public class Compate2Strings {

    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("First String:");
        s1 = sc.nextLine();
        System.out.println("Second String:");
        String dummy = sc.next();

        s2 = sc.nextLine();

        if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
