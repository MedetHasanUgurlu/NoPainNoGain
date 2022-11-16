public class FindingMaxInput {


    public static void main(String[] args) {


        int[] ints = {1,2,3,4,58,1,88};
        System.out.println(max(ints));
    }



    public static int max(int[] input){
        int max = input[0];
        for (int i = 0; i <input.length; i++) {
            if (input[i] > max) {
                max = input[i];

            }



        }

        return  max;
    }
}





