package main.kotlin.com.spruhs;

import java.util.function.BiFunction;

public class HigherOrderJava {

    public static int operateOnNumbers(int a, int b, BiFunction<Integer, Integer, Integer> operation) {
        return operation.apply(a, b);
    }

    public static void main(String[] args) {
        int sum = operateOnNumbers(5, 3, (x, y) -> x + y);
        System.out.println(sum); // Ausgabe 8
    }
}
