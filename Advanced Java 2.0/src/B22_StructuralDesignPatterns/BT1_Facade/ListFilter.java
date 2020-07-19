package B22_StructuralDesignPatterns.BT1_Facade;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public List<Integer> filterOdd(List<Integer> numbers){
        List<Integer> newList = new ArrayList<>();
        for (Integer number: numbers) {
            if(number % 2 == 0){
                newList.add(number);
            }
        }
        return newList;
    }
}