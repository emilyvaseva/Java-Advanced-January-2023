package P07Generics.P02GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCreator {
    public static <T> T[] create(int length, T item) {
        return create(item.getClass(), length, item);

    }

    public static <T> T[] create(Class<?> clazz, int length, T item) {

        T[] array = (T[]) Array.newInstance(clazz, length);
        Arrays.fill(array, item);
        return array;
    }
}