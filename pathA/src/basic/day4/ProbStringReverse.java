package basic.day4;

public class ProbStringReverse {
    public static void main(String[] args) {
        String msg = "Hello World";

        reverseString(msg);
    
    }

    private static void reverseString(String msg) {
        char[] arr = msg.toCharArray();

        for(int i = (arr.length - 1) ; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
