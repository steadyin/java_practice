package java8.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isOdd = num -> num%2!=0;
        System.out.println(isOdd.test(4));

        Integer[] numbers = {2, 6, 9, 4, 8, 22, 19};
        Predicate<Integer> oddEvenPredicated = num -> num%2!=0;

        for(Integer num : numbers) {
            if(oddEvenPredicated.test(num)) {
                System.out.println("Odd num " + num);
            }

            if(oddEvenPredicated.negate().test(num)) {
                System.out.println("Even num " + num);
            }
        }

        //find all the odd numbers which are greater than 10
        Predicate<Integer> gt10Predicate = num -> num > 10;
        for(Integer num : numbers) {
            if(gt10Predicate.and(oddEvenPredicated).test(num))  {
                System.out.println("Odd num > 10 " + num);
            }
        }

        //Array of names will some empty string also in the array, remove all empty string


    }
}
