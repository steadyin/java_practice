package java8.interfaceenhancement.defaultmethod;

public interface VehicleJava8 {
    default void details() { // by default get available to all implementing classes
        System.out.println("I am Java 8 deafult method");
    }

    default void mileage() {

    }
}
