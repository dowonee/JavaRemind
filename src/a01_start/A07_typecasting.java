package a01_start;

public class A07_typecasting {

    /*
    # 데이터 유형의 변환
    1. 기본 데이터 유형
        작은 데이터 유형 ==> 큰 데이터 자동형변환 (promote)
        큰 데이터 유형 ==> 작은 데이터 유형 (casting)
    2. 상속관계에서 다형성하위 ==> 상위, 하위 객체로 사용될 때
        상위에서 하위객체로 사용될 때 (casting) ==> generic

        # generic
        1. 상위 객체로 할당할 때, 상위객체에서 하위 특정한 유형을 지정하여
        다시 하위에서 사용할 때 casting 없이 처리하는 것을 말한다.
     */
    public static void main(String[] args) {

        int num01 = 25;
        double num02 = num01; // promote가 일어남
        System.out.println("num02 = " + num02);

        double num03 = 243.242;
        int num04 = (int)num03;
        System.out.println("num04 = " + num04);

        int num05 = 32422;
        byte num06 = (byte) num05;
        System.out.println("byte형 데이터 = " + num06);


    }


}
