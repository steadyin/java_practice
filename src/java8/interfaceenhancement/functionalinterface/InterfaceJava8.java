package java8.interfaceenhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {

    public void show(); // 1 abstract method

    public default void details1()   {} //more than 1 default method

    public default void details2()   {} //more than 1 default method

    public static String enquire1() { //more than 1 static method
        return "Functional Interface";
    }

    public static String enquire2() { //more than 1 static method
        return "Functional Interface";
    }

//    public void details();
//    public String enquire();
}
