package java8.interfaceenhancement.lamda.thread;

public class ThreadMain {
    public static void main(String[] args) {
//        Runnable runnable = new CodeToRunAsSeperate();
        Runnable runnable = () -> {
            for (Integer count = 0; count <= 5; count++) {
                System.out.println("Child thread counter value is : " + count);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        for (Integer count = 0; count <= 5; count++) {
            System.out.println("Main thread counter value is : " + count);
        }
    }
}
