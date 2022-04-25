package inflearn;

public class Recursive2 {

    public static void main(String[] args) {
        Recursive2 recursive2 = new Recursive2();
        recursive2.recursive(11);
    }

    private void recursive(int n) {
        if(n<=0) return;
        recursive(n/2);
        System.out.print(n%2);
    }
}
