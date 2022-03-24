package Heap;

import java.util.LinkedList;
import java.util.List;

public class MaxBinaryHeap {
    private List<Integer> data = new LinkedList<>();

    public void Add(int value) {
        data.add(value);
        int index = data.size() - 1;
        if (index == 0) {
            return;
        }
        int parentIndex = (data.size()-1)/2;
        int parent = data.get(parentIndex);
        while( parent < data.get(index)) {
            data.set(parentIndex, data.get(index));
            data.set(index, parent);
            if (parentIndex == 0) {
                return;
            } else {
                index = parentIndex;
                parentIndex = (index - 1) / 2;
                parent = data.get(parentIndex);
            }
        }
    }

    public List<Integer> getHeap() {
        return data;
    }

    public int GetMaximum() {
        return data.get(0);
    }

    public int ExtractMax() {
        int returnVal = GetMaximum();

        int root = returnVal;
        int tail = data.get(data.size() - 1);
        return returnVal;
    }
}
