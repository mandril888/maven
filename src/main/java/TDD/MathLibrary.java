package TDD;

import java.util.List;

public class MathLibrary {
    public int add(int x, int y) {
        return x + y;
    }

    public int sumList(List<Integer> arr) {
        int sum = 0;

        for (int item : arr) {
            sum += item;
        }
        return sum;
    }
}
