package Java101;

import java.sql.Array;
import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {

        int z =1;

        for(int i: findPrimes(100)){


            System.out.println(z+".number: "+i);
            z++;
        }



    }

    public static ArrayList<Integer> findPrimes(int n) {
        boolean status = true;
        int i =2;
        ArrayList<Integer> list = new ArrayList<>();
        while(status){
            if(isPrime(i)){
                list.add(i);

            }      i++;

            if(list.size()==n){
                status = false;
            }
        }

        return list;


    }


    public static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        } else {
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
