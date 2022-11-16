public class Factorial {
    public static void main(String[] args) {
        System.out.println(isFactorial(8));

    }

    public static boolean isFactorial(int i){
        int n = i;
        int x = 1;
        for (int j = 1; j < n; j++) {
            x *=j;
            if(x ==i){
                return true;
            }

        }
        return false;
    }
}

