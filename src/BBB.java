public class BBB {
    public static void main(String[] args) {
        int[] A = {1,3,1,4,2,3,5,4};
        int X =solution(5,A);
        System.out.println(X);
    }
    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        int result = -1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]==X){
                result = i;

            }

        }
        return result;
    }
}
