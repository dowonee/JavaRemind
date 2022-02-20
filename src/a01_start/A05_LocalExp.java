package a01_start;

public class A05_LocalExp {

    public static void main(String[] args) {
        Product p1 = new Product("사과");
        p1.setPrice(3000);
        p1.setCnt(2);
        int returnData = p1.showInfo();
        System.out.println("리턴된 데이터:" + returnData);
    }
}

class Product {
    private String name;
    private int price;
    private int cnt;

    public Product(String name) {
        super();
        this.name = name;
    }

    // int price 는 입력받은 지역 변수
    // this.price는 지역변수와 필드값을 구분하기 위하여 this. 를 사용한 전역변수
    public void setPrice(int price) {
        this.price = price;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int showInfo() {
        System.out.println("구매한 물건명:" + name);
        System.out.println("가격:" + price);
        System.out.println("갯수:" + cnt);
        System.out.println("총비용:" + price * cnt);
        return price*cnt;
    }
}
