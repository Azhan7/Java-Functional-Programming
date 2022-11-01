package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //List.of is different than arraylist because it makes a list immutable
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Alex", Gender.MALE),
            new Person("Bob", Gender.MALE),
            new Person("Ayesha", Gender.FEMALE),
            new Person("Maria", Gender.FEMALE)
        );
        //Declarative approach to find number of females
        Predicate<Person> personPredicate = person ->  person.gender.equals(Gender.FEMALE);
        List<Person> declarativeFemales = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        System.out.println(declarativeFemales);

        //Imperative approach
        List<Person> iterativeFemales = new ArrayList<>();
        for(Person person: people){
            if(person.gender.equals(Gender.FEMALE)){
                iterativeFemales.add(person);
            }
        }
        System.out.println(iterativeFemales);
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
