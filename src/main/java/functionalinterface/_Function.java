package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementByOne(0));
        System.out.println(incrementByOneFunction.apply(0));
        System.out.println(incrementByOneFunction.andThen(multiplyByTenFunction).apply(0));
        System.out.println(incrementByOneAndMultiplyByTenFunction.apply(0, 10));
    }
    //Bi Function => it takes 2 input and produces one output.
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByTenFunction =
            (numberToIncrement, numberToMultiply) -> (numberToIncrement + 1) * numberToMultiply;


    //The first Integer refers to the argument while the second Integer refers to the return type.
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;
    //Imperative Approach
    static int incrementByOne(int number){
        return number + 1;
    }

}
