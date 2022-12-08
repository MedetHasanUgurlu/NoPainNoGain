import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class AAAA {
    public static void main(String[] args) {

        System.out.println(solution(10,85,30));
    }

    public static ArrayList<Integer> arrayToList(int[] ints){
        List<int[]> result = List.of(ints).stream().collect(Collectors.toList());
    return null;
    }

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
    /*
    while(resul)

    */
        int result = 0;
        int i = 1;
        while(result<Y){
            result += i*D;
            i++;

        }
        return i;


    }
}
