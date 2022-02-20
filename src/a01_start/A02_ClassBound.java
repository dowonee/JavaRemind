package a01_start;

public class A02_ClassBound {

    public static void main(String[] args) {
        Calcu c1 = new Calcu(25, 30);
        System.out.println(c1.plus());
    }
}


class Calcu {
    // 필드 선언
    // 1. 이 클래스에서 다 사용할 수 있는 전역변수 : class의 중괄호에서 선언
    private int num01;
    private int num02;

    // 생성자 선언
    Calcu(int num03, int num04) {
        // int num01: 매개변수로 받는 데이터는 지역변수 이기에
        // 다른 중괄호 블럭에서 사용할 수 없다.
        // 그러나 this.num01 (전역변수) 에 할당에서 데이터를 활용할 수 있다.
        this.num01 = num03;
        this.num02 = num04;
    }

    int plus() {
        return num01 + num02; // 전역변수로 할당된 것은 사용 가능하다.
        // num03 * num04 는 지역변수이므로 다른 중괄호에서 사용불가
    }
}