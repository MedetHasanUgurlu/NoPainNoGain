package Java101;

public class Fact {
    public static void main(String[] args) {

        System.out.println(fact2(6));
    }

    public static int fact2(int n){
        int result = 1;
        for(int i= 1;i<=n;i++){
            result *=i;

        }
        return result;
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
