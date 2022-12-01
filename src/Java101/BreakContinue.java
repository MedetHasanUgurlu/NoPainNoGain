package Java101;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Enter number quit for q");

        while(true){
            Scanner sc = new Scanner(System.in);
            String b = sc.nextLine();
            System.out.println("b");


            if(b.equals("q")){
                break;
            }else{
                continue;
            }
        }

    }
}
