package list;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    List<Integer> integers;

    public SumNumbers() {
        this.integers = new ArrayList<>();
    }

    public void addNumber(Integer number) {
        integers.add(number);
    }

    public Integer calculateSum() {
        if(integers.isEmpty()) {
            return null;
        }

        Integer sum = 0;
        for(Integer i : integers) {
            sum += i;
        }
        return sum;
    }

    public Integer findLargestNumber() {
        if(integers.isEmpty()) {
            return null;
        }

        Integer largestNumber = integers.get(0);
        for(Integer i : integers) {
            if(i > largestNumber) {
                largestNumber = i;
            }
        }
        return  largestNumber;
    }

    public Integer findSmallestNumber() {
        if(integers.isEmpty()) {
            return null;
        }

        Integer smallestNumber = integers.get(0);
        for(Integer i : integers) {
            if(i < smallestNumber) {
                smallestNumber = i;
            }
        }
        return  smallestNumber;
    }

    public List<Integer> showNumbers() {
        return integers;
    }

    public static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();
        sumNumbers.addNumber(2);
        sumNumbers.addNumber(48);
        sumNumbers.addNumber(27);
        sumNumbers.addNumber(1258);
        sumNumbers.addNumber(85);
        sumNumbers.addNumber(-9);

        System.out.println(sumNumbers.findLargestNumber());
        System.out.println(sumNumbers.findSmallestNumber());
        System.out.println(sumNumbers.calculateSum());
        System.out.println(sumNumbers.showNumbers());
    }

}
