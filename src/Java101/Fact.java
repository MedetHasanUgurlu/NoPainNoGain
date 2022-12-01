package Java101;

public class Fact {
    public static void main(String[] args) {

        System.out.println(fact(6));
    }

    public static int fact(int i){
        int result = 1;
        if (i<=0){
            return  -1;
        }
        for(int c =1;c<=i;c++){
           result *=c;
        }

        return result;

    }
}
