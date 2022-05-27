package printarray;

import java.lang.reflect.Array;

public class GenericExample<E> {

    public GenericExample(E[] inputArray) {
        printArray(inputArray);
    }

    public  <E> void printArray(E[] array) {
        for (E value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
