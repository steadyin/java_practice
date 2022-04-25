package java8.interfaceenhancement.staticmethod;

public interface StaticMethodDemo {
    public static void show1() { //static method do not get available in implementing class
        System.out.println("I am a Java 8 Static Method");
    }

    public static void show2() { //static method do not get available in implementing class
        show1();
        System.out.println("I am a Java 8 Static Method 2");
    }

    public static void main(String[] args) {
    }
}
