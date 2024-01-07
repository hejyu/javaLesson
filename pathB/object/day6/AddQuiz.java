package object.day6;

public class AddQuiz {

    private int data1;          // 랜덤 숫자 1
    private int data2;          // 랜덤 숫자 2
    private int userAnswer;     // 제출한 숫자

    
    public AddQuiz(int data1, int data2, int userAnswer) {
        this.data1 = data1;
        this.data2 = data2;
        this.userAnswer = userAnswer;
    }


    /**
     * 제출 숫자가 정답이면 참을 리턴하는 메소드
     * @param num
     * @return bol
     */
    public boolean isRight(int num){
        boolean bol = false;

        if (num == this.userAnswer) {
            bol = true;
        }
        
        return bol;
    }

    public int getData1() {
        return data1;
    }


    public int getData2() {
        return data2;
    }


    public int getUserAnswer() {
        return userAnswer;
    }


    
}
