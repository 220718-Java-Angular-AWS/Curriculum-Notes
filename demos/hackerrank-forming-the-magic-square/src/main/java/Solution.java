import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();
        ArrayList<Integer> row3 = new ArrayList<>();
        Collections.addAll(row1, 4,8,2);
        Collections.addAll(row2, 4,5,7);
        Collections.addAll(row3, 6,1,6);
        List<List<Integer>> square = new ArrayList<>();
        square.add(row1);
        square.add(row2);
        square.add(row3);

        System.out.println("Result: " + Result.formingMagicSquare(square));
    }
}
