package basic.day4;

public class ProbStringReverse {
    public static void main(String[] args) {
        String msg = "Hello World";
        reverseString(msg);
    }

    // 문자열을 뒤집는 메소드
    private static void reverseString(String msg) {
        char[] arr = msg.toCharArray();

        for(int i = (arr.length - 1) ; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
