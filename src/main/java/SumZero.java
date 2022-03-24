import java.util.List;

public class SumZero {
    public Boolean FindIfSumZero(List<Integer> data) {

        //System.out.println(sumZero.FindIfSumZero(Arrays.asList(-4,2,3,4,6,8,11)));
        if (data.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = data.size() - 1;

        while(left < right) {
            int sum = data.get(left) + data.get(right);

            if (sum == 0) {
                return true;
            } else if (sum > 0) {
                --right;
            } else {
               --left;
            }
        }

        return false;
    }
}
