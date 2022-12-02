package Java101;

import java.util.List;

public class ReferenceorOtherType {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        a =b;
        b=7;
        System.out.println(a);

        Integer Integer1;
        Integer Integer2 = 6;

        Integer1 = Integer2;
        Integer2 = 7;
        System.out.println("Integer1: " + Integer1);
        String s1 = new String();
        s1 = "İstanbul";
        String s2 = new String();
        s2 = "Iğdır";

        s1 =s2;
        s2 = "Manisa";
        System.out.println(s1);



        int[] numbers1 ={1,2,3,4,5};
        int[] numbers2 = {10,20,30,40};
        numbers1 = numbers2;
        numbers2[0] = 100;
        List.of(numbers1).stream().forEach(System.out::println);
        for (int s:numbers1
             ) {
            System.out.println(s);

        }
    }
}
