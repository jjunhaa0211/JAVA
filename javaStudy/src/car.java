import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        // 문제 : 자동차 설계도를 만들어주세요.
        System.out.print("몇번째 자동차가 몇번을 달릴까요? : ");
        Scanner sc = new Scanner(System.in);
        int carNum = sc.nextInt();
        int carRunning = sc.nextInt();
        int i = 1;
        int sum = 0;
        System.out.println("당신이 입력한 값은 : " + carNum + "번 차량이 " + carRunning + "번 돌아라");
        car1 Bureung1 = new car1();
        if (carNum == 1) {
            Bureung1.speed = 300;
            for (; i <= carRunning; i++) {
                System.out.print(i + "바퀴 ");
                Bureung1.run();
                sum = sum + 300;
            }
            System.out.println("이 차의 최고 속력은 : " + Bureung1.speed + "km 입니다");
            System.out.println("이만큼 달렸어요 : " + sum + "km");
        }
        car1 Bureung2 = new car1();
        if(carNum == 2){
            Bureung2.speed = 400;
            for (; i <= carRunning; i++) {
                System.out.print(i + "바퀴 ");
                Bureung2.run();
                sum = sum + 400;
            }
            System.out.println("이 차의 최고 속력은 : " + Bureung2.speed + "km 입니다");
            System.out.println("이만큼 달렸어요 : " + sum + "km");
        }
    }

    static class car1 {
        int speed;

        void run() {
            System.out.println("자동차 달린다");
        }
    }
}
