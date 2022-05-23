package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7]
        //Until Java 7 - Odd numbers

        List<Integer> oddNumbers = new ArrayList<>();
        for(Integer num : numbers) {
            if(num % 2 == 1)    {
                oddNumbers.add(num);
            }
        }
        System.out.println(oddNumbers);//[1, 3, 5, 7]

        //Java 8 - streams
        //Stream<Integer> stream = numbers.stream();

        //Stream을 호출한 다음 메서드가 필요한 이유는 무엇입니까?
        //기본적으로 우리가 원하는 것은 컬렉션에서 필터링 하는 것입니다.
        //num은 stream에서 하나씩 뽑아낸 인수입니다.
        //그리고 다시 collect()할 수 있습니다.
        oddNumbers = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNumbers);//[1, 3, 5, 7]
        System.out.println("Odd Numbers using Java-8 Stream: " + oddNumbers);


    }
}
