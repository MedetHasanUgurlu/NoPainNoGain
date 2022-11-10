public class CountLetterInWordSerach2D {
    public static void main(String[] args) {
//		Create a function that counts the number of times a particular letter shows up in the word search.
//
//		Examples
//		letterCounter([
//		  ["D", "E", "Y", "H", "A", "D"],
//		  ["C", "B", "Z", "Y", "J", "K"],
//		  ["D", "B", "C", "A", "M", "N"],
//		  ["F", "G", "G", "R", "S", "R"],
//		  ["V", "X", "H", "A", "S", "S"]
//		], "D") ➞ 3
//
//		// "D" shows up 3 times: twice in the first row, once in the third row.
//
//		letterCounter(arrays2D, "H") ➞ 2


        String[][] x = { {"D", "E", "Y", "H", "A", "D"},{"C", "B", "Z", "Y", "J", "K"},{"D", "B", "C", "A", "M", "N"},{"F", "G", "G", "R", "S", "R"},
                {"V", "X", "H", "A", "S", "S"} };
        System.out.println("Row:" + x.length);
        System.out.println("Column:" + x[0].length);
        System.out.println("Row:3 Column:5 element is "+x[5-1][6-1]);

        System.out.println("H count: "+ letterCounter(x,"D"));



    }
    static int letterCounter(String[][] array,String s){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if(array[i][j].equals(s)){
                    count++;
                }
            }

        }
        return count;

    }
}
