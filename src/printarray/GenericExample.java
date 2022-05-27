package printarray;

public class GenericExample {

    public <E> void printArray(E[] array) {
        for (E value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
