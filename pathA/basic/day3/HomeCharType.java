package basic.day3;

public class HomeCharType {


    public static void main(String[] args) {
        /*
        :::: [과제-2024/01/03 22시까지 제출] 문자열을 구성하는 문자의 종류 분석하기 ::::
        1) 문자열을 임의로 저장합니다. 예시 : "Hello* Java Hi* Linux~~~" 

        2) 1)번의 문자열을 구성하는 문자 하나하나가  '대문자' '소문자' '숫자' '기호' 중 어떤 종류의 문자인지 검사합니다.

        3) 2)번의 검사를 통해서 문자열을 구성하는 문자의 종류와 개수를 구하여 출력합니다.
        변수명 :     대문자의 갯수  upperCount  , 
                    소문자의 갯수  lowerCount  , 
                    숫자의 갯수    numberCount , 
                    기호의 갯수    symbolCount 

        출력 예시 :  
        ------------------------------------------------------------
        문자열 : Hello* Java Hi* Linux~~~
        문자 종류 : 대문자 4개, 소문자 12개, 숫자 0개, 기호 8개  
        */

        // 문자열을 저장할 변수 message 선언
        // 문자열 분석에 사용할 변수를 작성
        // 대문자 구분 조건식을 작성
        // 소문자 구분 조건식을 작성
        // 숫자 구분 조건식을 작성
        // 기호 구분 조건식을 작성 
        
        String message = "A Z a z 0 9 ";
        int upperCount, slowerCount, numberCount, symbolCount;
        int i = 0;
        
        while(i < message.length()){
            System.out.print( String.format("%s / %d\t", (char)message.charAt(i), (int)message.charAt(i)) );
            i = i+1;
        }

        System.out.println(message);


    }
}    