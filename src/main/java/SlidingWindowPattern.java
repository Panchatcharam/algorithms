import java.util.List;

public class SlidingWindowPattern {
    public long findMaximum(List<Integer> list, int count) {

        if (list.size() < count) {
            return -1;
        }

        //Arrays.asList(4,3,7,2,5,6,8,11), 2
        long initSum = list.stream().limit(count).reduce(0, Integer::sum);

        if (list.size() == count) {
            return initSum;
        }

        long tempSum = initSum;

        for (int index = count; index < list.size(); ++index) {
            tempSum = tempSum - list.get(index - count) + list.get(index);
            if (tempSum > initSum) {
                initSum = tempSum;
            }
        }

        return initSum;
    }
}
