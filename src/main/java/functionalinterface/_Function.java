package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementByOne(0));
        System.out.println(incrementByOneFunction.apply(0));
    }
    //The first Integer refers to the argument while the second Integer refers to the return type.
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    //Imperative Approach
    static int incrementByOne(int number){
        return number + 1;
    }
}
