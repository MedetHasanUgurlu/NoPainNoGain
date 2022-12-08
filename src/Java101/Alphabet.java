package Java101;

import java.lang.StringBuilder;
import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };

        Arrays.sort(arr);


        for(char c = 'a';c<='z';c++){
            System.out.println(c);
        }
    }
}
