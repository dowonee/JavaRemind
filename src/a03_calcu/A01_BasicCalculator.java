package a03_calcu;

import java.util.Scanner;

public class A01_BasicCalculator {

    public static void main(String[] args) {

        // ex1. 임의의 값 1~10을 나오게 하여 부호 연산자로 음수를 처리해 출력하세요.
        for (int i = 1; i <= 10; i++) {
            int ranNum1 = (int) (Math.random() * 10 + 1);
            System.out.println(i + "번째 값" + -ranNum1);
        }

        // ex2. 문자열 이어주는 + 를 이용하여 임의의 10자리 범위 두개의 값을 이어서 코드를 만들어 보세요
        // "" + 숫자형 ==> 숫자형문자열
        String num01 = "" + (int) (Math.random() * 90 + 10);
        String num02 = "" + (int) (Math.random() * 90 + 10);
        System.out.println((num01 + num02));

        // ex3. 대입 증감 및 감소 연산자를 이용해서 1~10 누적 증가된 총합을 출력하고,
        //      100~90까지 2씩 감소 누적된 값을 출력하세요.

        int sum1 = 0;
        int sum2 = 0;
        for (int x = 1; x <= 10; x++) {
            sum1 += x;
        }
        System.out.println("1~10 누적 총합 : " + sum1);

        for (int y = 100; y >= 90; y-=2) {
            sum2 += y;
        }
        System.out.println("100~90 2씩 감소누적값 : " + sum2);

        // ex4. himan 아닐 때를 먼저 체크해서, 등록된 사원이 아닙니다 출력
        //      그 외에는 등록된 사원입니다.

        Scanner sc = new Scanner(System.in);
        String ename = sc.nextLine();
        if (!ename.equals("himan")) {
            System.out.println("등록된 사원이 아닙니다.");
        } else {
            System.out.println("등록된 사원입니다.");
        }

        // ex.5 1~4 번 중, 정답을 입력하세요.. not(!) 활용해서 처리
        // 	3번이 아닐 때,  오답입니다. 출력 그외는(3인 경우) 정답입니다.
        System.out.print("정답을 입력하세요.: ");
        int answer = sc.nextInt();
        if (answer != 3) {
            System.out.println("오답입니다");
        } else {
            System.out.println("정답입니다.");
        }

        // ex.6 구매금액입력해서  10000~30000 VIP 고객입니다. 표기(&&)활용
        System.out.print("구매금액을 입력하세요.:");
        int buy = sc.nextInt();
        if (buy >= 10000 && buy <= 30000) {
            System.out.println("구매금액 = " + buy);
            System.out.println("VIP 고객입니다.");
        }
    }

}