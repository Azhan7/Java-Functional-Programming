package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("06000000000"));

        System.out.println("Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("06000000000"));

        System.out.println("Combined Predicate");
        System.out.println(isPhoneNumberValidPredicate
                .and(containsNumberThree).test("06000000000"));
        System.out.println(isPhoneNumberValidPredicate
                .and(containsNumberThree).test("07030000000"));



    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumberThree = phoneNumber ->
            phoneNumber.contains("3");
}
