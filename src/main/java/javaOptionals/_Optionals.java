package javaOptionals;

import java.util.Optional;

//Java Optionals are essential tool to deal with null pointer exception.
public class _Optionals {
    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null)
                .isPresent());

    }
}
