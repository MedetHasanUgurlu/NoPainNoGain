import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {

        /*
        1 1 2 3 5 8 ...
        n0 = 1
        n1 = 1
        n2 = n0+n1 = 2
        n0=n1
        n1= n2




         */

        Arrays.stream(getFibonacci(10)).forEach(System.out::println);

    }


    public static int[] getFibonacci(int n) {
        List<Integer> list = new ArrayList<>();
        int n0 = 1;
        int n1 = 1;
        int n2 = n1 + n0;
        list.add(n0);
        list.add(n1);
        list.add(n2);
        while (n2 < n) {
            n0 = n1;
            n1 = n2;
            n2 = n1 + n0;
            if(n2>n){
                break;
            }
            list.add(n2);

        }

        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }


}

