package Java101;

import java.util.Scanner;

public class SwapWithout3RD {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("x:" );
        x = sc.nextInt();
        System.out.println("y: ");
        y = sc.nextInt();

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After swap x: "+x+" y: "+y);
    }
}
