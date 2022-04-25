package inflearn;

public class Pivonacci {
    public static void main(String[] args) {

        Pivonacci pivonacci = new Pivonacci();
        int n = 45;
        int[] array = new int[n];

        System.out.println(pivonacci.solution(n-1, array));
    }

    private int solution(int i, int[] arr) {
        if(arr[i]!=0)    return arr[i];

        if(i==0 || i==1)    return arr[i] = 1;
        else             return arr[i] = solution(i-2, arr) + solution(i-1, arr);
    }
}
