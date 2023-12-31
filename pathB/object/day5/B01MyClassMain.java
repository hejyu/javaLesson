package object.day5;

import java.util.Arrays;

public class B01MyClassMain {
    public static void main(String[] args) {
        //정의된 클래스 MyClass1으로 객체를 만듭니다. - 객체를 만들때는 new 연산 사용
        MyClass1 my1 = new MyClass1(); // 객체란 데이터 덩어리 new 연산으로 MyClass1 객체를 저장할 메모리 확보
                                       // MyClass1() 은 생성자 메소드. 무조건 클래스 이름과 같다.
                                       //               ㄴ 메모리에 저장공간을 확보하면서 동시에 실행.

        my1.field1 = "Hi, 모모";
        my1.field2 = 2;
        my1.field3 = new double[5];
        my1.field5 = 1;
        int j = my1.field3.length;
        for(int i=0; i<j; i++){
            my1.field3[i] = i;
        }
        System.out.println("my1.field1 : " + my1.field1); //String
        System.out.println("my1.field2 : " + my1.field2); //int
        System.out.println("my1.field3 : " + my1.field3); //double 배열
        System.out.println("my1.field3 : " + my1.field3.length); //double 배열
        System.out.println("my1.field3 : " + Arrays.toString(my1.field3)); //double 배열
        System.out.println("my1.field4 : " + my1.FIELD4);
        System.out.println("my1.field5 : " + my1.field5);

        MyClass1 my2 = new MyClass1();
        my2.field1="점심먹으러 갑시다.";
        my2.field2=12345;
        my2.field3=new double[]{34.12,23.99,6.78};
        System.out.println("my2 해시코드 (필드값 변경 후) : " + my2.hashCode());
        System.out.println(Arrays.toString(my2.field3));

        MyClass2 my3 = new MyClass2();
        
        //MyClass1 err = new MyClass2();

    }
}
