package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<BlackBoxInt> aClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> blackBoxConstructor = aClass.getDeclaredConstructor();
        blackBoxConstructor.setAccessible(true);
        BlackBoxInt blackBoxInt = blackBoxConstructor.newInstance();
        Field field = aClass.getDeclaredField("innerValue");
        field.setAccessible(true);

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!"END".equals(command)){
            String methodName = command.split("_")[0];
            int methodArgument = Integer.parseInt(command.split("_")[1]);

            Method method = aClass.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, methodArgument);

            System.out.println(field.get(blackBoxInt));

            command = scanner.nextLine();
        }

    }
}
