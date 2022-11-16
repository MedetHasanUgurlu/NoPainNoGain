import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizeEr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(s,"@");
        System.out.println("Count: " + tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());

        }


    }
}
