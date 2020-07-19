package B22_StructuralDesignPatterns.BT2_Adapter;

import java.util.List;

public class CollectionUtils {
    public CollectionUtils() {
    }

    public int findMax(List<Integer> numbers) {
        if (numbers.size() == 0) {
            throw new RuntimeException("List is emplty");
        } else {
            int max = (Integer)numbers.get(0);

            for(int i = 1; i < numbers.size(); ++i) {
                if (max < (Integer)numbers.get(i)) {
                    max = (Integer)numbers.get(i);
                }
            }

            return max;
        }
    }
}
