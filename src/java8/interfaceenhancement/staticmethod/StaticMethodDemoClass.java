package java8.interfaceenhancement.staticmethod;

public class StaticMethodDemoClass implements StaticMethodDemo {

    public static void show() { //static method do not get available in implementing class
        System.out.println("I am a normal method of this class StaticMethodDemoClass");
    }

    public static void main(String[] args) {
        StaticMethodDemoClass obj = new StaticMethodDemoClass();
        obj.show();
        StaticMethodDemo.show1(); //static method can be called by the name of the interface

        StaticMethodDemoClass.show();
        //obj.show1() //call not available by the instance of implementing class
        //StaticMethodDemoClass.show1() //call not available by the name of Implementing class
    }
}
