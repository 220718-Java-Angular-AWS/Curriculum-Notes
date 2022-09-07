import java.util.LinkedList;
import java.util.List;

public class Result {
    public static int formingMagicSquare(List<List<Integer>> s) {
        List<Square> magicSquareList = new LinkedList<>();
        magicSquareList.add(new Square(8,3,4,1,5,9,6,7,2));
        magicSquareList.add(new Square(4,9,2,3,5,7,8,1,6));
        magicSquareList.add(new Square(2,7,6,9,5,1,4,3,8));
        magicSquareList.add(new Square(6,1,8,7,5,3,2,9,4));
        magicSquareList.add(new Square(4,3,8,9,5,1,2,7,6));
        magicSquareList.add(new Square(2,9,4,7,5,3,6,1,8));
        magicSquareList.add(new Square(6,7,2,1,5,9,8,3,4));
        magicSquareList.add(new Square(8,1,6,3,5,7,4,9,2));

//        for(Square sq : magicSquareList) {
//            System.out.println(sq.testValid());
//        }

        int cost = 99;

        Square input = new Square(s);
        for(Square sq : magicSquareList) {
            int temp = sq.formMagicSquare(input);
            if(temp < cost) {
                cost = temp;
            }
        }



        return cost;
    }
}

