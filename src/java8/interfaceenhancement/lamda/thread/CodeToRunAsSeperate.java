package java8.interfaceenhancement.lamda.thread;

public class CodeToRunAsSeperate implements Runnable {

    @Override
    public void run() {
        for(Integer count=0; count<=5; count++) {
            System.out.println("Child thread counter value is : " + count);
        }
    }
}
