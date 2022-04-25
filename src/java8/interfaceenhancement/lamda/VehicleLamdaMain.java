package java8.interfaceenhancement.lamda;

public class VehicleLamdaMain {
    public static void main(String[] args) {
        //Vehicle vehicle = void details() {};
        Vehicle vehicle = () -> System.out.println("Vehicle details after implementation");
        vehicle.details();

//        Calculator calculator = (Integer a, Integer b)  -> a + b;
        Calculator calculator = (Integer a, Integer b)  -> { return a + b;};
        Integer result = calculator.add(5, 7);
        System.out.println(result);

        Calculator2 calculator2 = a -> a + a;
        System.out.println(calculator2.add(2));


        //1. Remove modifier
        //2. Remove return type
        //3. Remove method name
        //4. Add -> (arrow) sign
        //5. if code is one row, Remove {}
        MultiplyInterface multiplyInterface = new MultiplyInterface() {
            @Override
            public void multiply() {
                System.out.println("I am a lamda function");
            }
        };
//        MultiplyInterface multiplyInterface = () -> System.out.println("I m a lamda function");


    }

    public void multiply() {
        System.out.println("I m a normal function");
    }
}
