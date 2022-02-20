package a01_start;

public class A05_LocalVariables {

    public static void main(String[] args) {

        /*
        모든 변수는 중괄호 블럭의 계층구조에 맞게 사용할 수 있다.(지역변수)
        1. 상위 중괄호 블럭에 선언한 변수는 하위에서 사용이 가능하지만
        2. 하위에 선언한 변수는 상위에서 사용을 할 수 없다.
        3. 지역변수이지만, 전역변수에 할당해서 활용을 할 수는 있다.
         */
    }
}

class Person {
    String name;
    Person(){
        System.out.println(name);
        String name01 = "안녕";
        System.out.println(name01);

    }

    void call(String kind) {
        // 매개변수도 해당 {}의 지역변수로 포함되어 계층구조에서만 사용할 수 있다.
        name = kind;

        if (true) {
            int age = 25;
            for (; ; ) {
                age = 30;
                if (true) {
                    // 계층 구조상 상위에 선언한 데이터는 하위에서 활용할 수 있다.
                    System.out.println(age);
                    System.out.println(name);
                }
            }
        }
    }
}
