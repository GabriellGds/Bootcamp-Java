package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class orderingOfNumbers {
    private List<Integer> integers;

    public orderingOfNumbers() {
        this.integers = new ArrayList<>();
    }

    public void addNumber(Integer number) {
        this.integers.add(number);
    }

    public List<Integer> sortAscending() {
       if(integers.isEmpty()) {
           throw new RuntimeException("the list is empty");
       }

        List<Integer> ascendingNumbers = integers;
        Collections.sort(ascendingNumbers);
        return  ascendingNumbers;
    }
}
