package inflearn;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.solution(5));

    }

    private int solution(int n) {
        if(n==1)    return n;
        else
            return n * solution(n-1);
    }
}
