package printarray;

public class GenericExample {

    public void printIntArray(Integer[] array) {
        for (Integer value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    public void printFloatArray(Float[] array) {
        for (Float value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    public void printDoubleArray(Double[] array) {
        for (Double value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
}
