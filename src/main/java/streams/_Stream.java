package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Bob", Gender.MALE),
                new Person("Ayesha", Gender.FEMALE),
                new Person("Maria", Gender.FEMALE)
        );
        System.out.println(people.stream().filter(person -> person.gender.equals(Gender.FEMALE)));
        //This is the summary of what we have learnt
        //1. People.stream is an abstraction
        //2. .map function only does transformation (it takes an input and produces an output
        //3. forEach takes a consumer(which takes one input and returns nothing)
        people.stream()
                .map(person -> person.gender)
                .forEach(System.out::println);
        // .collect takes supplier and bi consumer.
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Find the length of each name.
        //mapToInt(name -> name.length()) can also be changed to mapToInt(String::length)
        people.stream()
                .map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        //The same code can also be written in this fashion
        System.out.println("Conventional Approach");
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = x -> System.out.println(x);

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);
    }
    static class Person {
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE
    }
}
