package object.day6;

import java.util.Scanner;

public class AddQuizMain {

    public static void main(String[] args) {
        
        // Scannere 사용, 문제 개수 입력받기 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문제를 생성할 개수 입력 >>> ");
        int i = 0;                      // 문제 번호
        int temp = 0;
        int num1 = 0;                   // 앞에 올 두자리 숫자
        int num2 = 0;                   // 뒤에 올 두자리 숫자
        String str = "";

        // 두 자리 랜덤 숫자 범위 셋팅
        int start = 11;
        int end = 99;
        
        //문제 개수 입력받기 
        int m_count = sc.nextInt();     // 풀 문제 수
        
        if(m_count == 0) {
            System.out.println("프로그램을 종료합니다");
            return;
        }

        String[] quizArr = new String[m_count];     //문제를 저장할 배열을 생성 
        int[] userArr = new int[m_count];           //학생 입력 답 저장한 배열을 생성    
        int[] answerArr = new int[m_count];         //문제 정답 배열 생성
        char[] markArr   = new char[m_count];       //채점 배열 생성
        int rightCount = 0;                         //맞은 개수
        

        System.out.println(String.format("덧셈. %2d개 문제 퀴즈 시작", m_count));
        AddQuiz[] quizs = new AddQuiz[m_count];     // 클래스 배열 

        try {
            while (i < m_count) {
                str = "";
                
                //문제 생성 
                for(int j = 0; j < 2 ; j++){
                    temp = getRandomNumber(start, end);
                    
                    if(j == 1) {
                        str += "+";
                        num2 = temp;
                    }else {
                        num1 = temp;
                    }
                    
                    str += temp;        
                }
                
                int answer = sum(num1, num2);
                answerArr[i] = answer;          //정답 배열 인덱스에 답 저장
                quizArr[i] = str + " = ";       //문제 배열 인덱스에 문제 저장
                
                System.out.print(String.format("%s", quizArr[i]));
                System.out.print("답을 입력하세요>>> ");
                
                int userAnswer = sc.nextInt();           // 학생의 답 입력받기  
                userArr[i] = userAnswer;
                
                quizs[i] = new AddQuiz(num1, num2, userAnswer);     // 커스텀 생성자 사용
                boolean bol = quizs[i].isRight(answer);

                if(bol)  markArr[i] = 'O';
                else     markArr[i] = 'X';


                i += 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

        System.out.println("::: 채점하고 있습니다:::");
        System.out.println(String.format("%20s\t %10s\t %10s\t %1s", "문제", "제출한 답", "정답", "채점"));
        
        for(int m = 0; m < m_count ; m++){
            System.out.println(String.format("%2d번. \t %14s\t %10d\t %10d\t %c\t", m, quizArr[m].substring(0, 5), userArr[m], answerArr[m], markArr[m]));
            
            if (markArr[m] == 'O') rightCount += 1;
        }

        System.out.println(String.format("::: 맞은 개수는 %d개 입니다:::", rightCount));
    }
    

    public static int getRandomNumber(int start, int end) {
        int temp = (int)(Math.random()*(end-start+1)) + start;

        return temp;
    }

    public static int sum(int num1, int num2) {
        return num1+num2;
    }


}
