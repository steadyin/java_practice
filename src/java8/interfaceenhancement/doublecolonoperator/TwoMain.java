package java8.interfaceenhancement.doublecolonoperator;

public class TwoMain {
    public static void main(String[] args) {
        ConsRefFuncInterface consRefFuncInterface1 = () -> new Employee();
        consRefFuncInterface1.getEmployee();

        //Construct Reference
        ConsRefFuncInterface consRefFuncInterface2 = Employee::new;
        consRefFuncInterface2.getEmployee();

    }
}
