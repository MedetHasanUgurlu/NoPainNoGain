import java.util.Arrays;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        // Can be re-arranged to form [1, 2, 3, 4, 5] ➞ true
        // cons([5, 6, 7, 8, 9, 9]) ➞ false
        // 9 appears twice

        int[] a = { 5, 1, 4, 3, 2 };
        System.out.println(isConsecutiveNumbers(a));
    }

    public static boolean isConsecutiveNumbers(int[] a){

        Arrays.sort(a);
        for(int i =0; i<a.length-1;i++){
             if((a[i+1]-a[i]) !=1){
                 return false;
             }
        }
        return true;

    }
}
