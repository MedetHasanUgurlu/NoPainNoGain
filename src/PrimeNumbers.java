
import java.util.ArrayList;


public class PrimeNumbers {


    public static void main(String[] args) {

        findPrime(16).stream().forEach(System.out::println);






    }
    public static ArrayList<Integer> findPrime(int n){
        ArrayList<Integer> list = new ArrayList();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;

    }

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}


