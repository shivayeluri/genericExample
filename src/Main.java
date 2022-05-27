import printarray.GenericExample;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
        Float[] floatArray1 = {1.0f, 2.0f, 3.4f, 5.6f, 4.9f};
        Double[] doubleArray = {9.0, 8.6};

        new GenericExample().printArray(array1);
        new GenericExample().printArray(floatArray1);
        new GenericExample().printArray(doubleArray);
    }

}