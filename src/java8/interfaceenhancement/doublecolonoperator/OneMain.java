package java8.interfaceenhancement.doublecolonoperator;

public class OneMain {
    public static void main(String[] args) {
        //Employee employee = new Employee();
//        LambdaOne lambdaOne = () ->
//                System.out.println("From lambda one");
//        lambdaOne.show();

        //다음과 같이 람다 함수를 호출할 수 있습니다.
        //더블 콜론 오퍼레이터는 람다 표현식을 대체할 수 있습니다.
        //염두해우더야 할 것은 다음과 같은 경우메나 대체할 수 있습니다.
        //비슷한 구문일 때 대체할 수 있습니다.
        //LambdaOne의 show는 어떤 파라미터도 취하지 않습니다.
        //Employee 클래스의 details 또한 아규먼트를 취하고 있지 않습니다.
        //Lamda Abstract Method 람다는 Employee의 details()메소드를 참조합니다.
        //Double Colon Operator로 람다 표현식을 대체할 수 있습니다.


        //그래서 Employee의 로직을 수행한 것입니다.

//        LambdaOne lambdaOne1 = employee::details;
//        lambdaOne1.show();

//        LambdaTwo lambdaTwo = employee::details2;
//        lambdaTwo.show2(55);
        //이것이 Lambda가 무엇이든간에 확인해야 하는 이유입니다.
        //메소드의 파라미터, 기존 클래스에 연결된 메소드의 매개변수
        //메소드는 해당 람다에서 참조할 수 있으므로 기본적으로 더 이상 정의를 제공할필요가 없게됩니다.

        //클래스의 메소드를 참조할 수 있습니다.
        //람다 메소드를 호출하면 실제로 직원 클래스의 메소드 로직을 수행합니다.

        //Static 메소드를 참더라도 Labmda의 추상 메소드는 Static으로 할 필요는 없습니다.

        LambdaStatic lambdaStatic = Employee :: detailsStatic;
        lambdaStatic.showStatic(3);

    }
}
