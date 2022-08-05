import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random ramdom = new Random();
        Scanner sc = new Scanner(System.in);
        boolean isSuccess = false;

        while (true){
            int randonNum = ramdom.nextInt(1000) % 100 + 1;
            System.out.println("UPDOWN 게임을 시작합니다/n");
            System.out.println("컴퓨터가 생성한 난수 : " + randonNum);
            for(int i = 0; i < 7; i++)
            {
                System.out.print("1~100까지 숫자를 입력하세요:");
                int userNum = sc.nextInt();
                if (userNum > randonNum){
                    System.out.println("Down, 더 낮은 숫자입니다");
                }
                if(userNum < randonNum){
                    System.out.println("Up, 더 높은 숫자입니다");
                }
            }
        }

    }
}
