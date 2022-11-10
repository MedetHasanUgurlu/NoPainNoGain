public class ArrayMultiple {
    public static void main(String[] args) {

//      Create a function that takes two numbers as arguments (num, length) and// returns an array of multiples of num until the array length reaches length.
//		Examples
//		arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
//		arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
//		arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]

        int[] a = arrayOfMultiple(7,5);
        for (int x:a) {
            System.out.println(x);
        }
    }
    static int[] arrayOfMultiple(int x,int y){
        int[] result = new int[y];
        for (int i = 0; i <= y-1; i++) {
            result[i] = x*(i+1);
        }
        return result;
    }

}
