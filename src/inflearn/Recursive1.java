package inflearn;

public class Recursive1 {

    public static void main(String[] args) {
        Recursive1 recursive = new Recursive1();
        recursive.recursive(3);
    }

    private void recursive(int n) {
        if(n==0) return;
        recursive(n-1);
        System.out.print(n + " ");
    }
}
