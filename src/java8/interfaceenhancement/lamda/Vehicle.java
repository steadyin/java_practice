package java8.interfaceenhancement.lamda;

@FunctionalInterface
public interface Vehicle {
    void details();

    default void getMileage() {
        System.out.println("Showing mileage");
    }
}
