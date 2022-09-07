import java.util.LinkedList;
import java.util.List;

class Square {
    private int cost = 0;
    private List<List<Integer>> square;

    public Square(List<List<Integer>> s) {
        this.square = s;
    }

    public Square(int ...nums) {
        this.square = new LinkedList<List<Integer>>();
        for(int i = 0; i < 9; i++) {
            if(i % 3 == 0) {
                square.add(new LinkedList<Integer>());
            }
            square.get(square.size()-1).add(nums[i]);
        }
    }

    public List<List<Integer>> getSquare() {
        return square;
    }

    public int formMagicSquare(Square s) {
        cost += Math.abs(s.getSquare().get(0).get(0) - square.get(0).get(0));
        cost += Math.abs(s.getSquare().get(0).get(1) - square.get(0).get(1));
        cost += Math.abs(s.getSquare().get(0).get(2) - square.get(0).get(2));

        cost += Math.abs(s.getSquare().get(1).get(0) - square.get(1).get(0));
        cost += Math.abs(s.getSquare().get(1).get(1) - square.get(1).get(1));
        cost += Math.abs(s.getSquare().get(1).get(2) - square.get(1).get(2));

        cost += Math.abs(s.getSquare().get(2).get(0) - square.get(2).get(0));
        cost += Math.abs(s.getSquare().get(2).get(1) - square.get(2).get(1));
        cost += Math.abs(s.getSquare().get(2).get(2) - square.get(2).get(2));

        return cost;

    }

    public boolean testValid() {
        int sumA = 0, sumB = 0, sumC = 0;//horizontals:
        int sumX = 0, sumY = 0, sumZ = 0;//verticals
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < 3; i++){
            //horizontals:
            sumA += this.square.get(0).get(i);
            sumB += this.square.get(1).get(i);
            sumC += this.square.get(2).get(i);
            //verticals
            sumX += this.square.get(i).get(0);
            sumY += this.square.get(i).get(1);
            sumZ += this.square.get(i).get(2);
            //diagonals
            sum1 += this.square.get(i).get(i);
            sum2 += this.square.get(2-i).get(i);


        }
        if(sumA == 15
                && sumB == 15
                && sumC == 15
                && sumX == 15
                && sumY == 15
                && sumZ == 15
                && sum1 == 15
                && sum2 == 15) {
            return true;
        }
        return false;
    }

}
