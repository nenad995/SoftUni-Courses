package genericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int length, T defaultValue){
        return create(defaultValue.getClass(), length, defaultValue);
    }

    public static <T> T[] create(Class<?> tClass, int length, T item){
        T[] arr = (T[]) Array.newInstance(tClass, length);
        Arrays.fill(arr, item);

        return arr;
    }
}
