import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);


        System.out.println(diagonalDifference(list));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            rightDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(rightDiagonal - leftDiagonal);
    }


}
