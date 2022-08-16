import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 계산기를 원하시나요?");
        System.out.println("1. 소수점 계산기");
        System.out.println("2. 정수형 계산기");
        int k = sc.nextInt();
        if(k == 1){
            while (true) {
                System.out.print("실수형식을 입력해주세여! :");
                double x = sc.nextDouble();
                String z1 = "";
                z1 = sc.next();
                double y = sc.nextDouble();

                if (z1.equals("+")) {
                    System.out.println(x + " + " + y + " = " + (x + y));
                } else if (z1.equals("-")) {
                    System.out.println(x + " - " + y + " = " + (x - y));
                } else if (z1.equals("*")) {
                    System.out.println(x + " * " + y + " = " + (x * y));
                } else if (z1.equals("/")) {
                    System.out.println(x + " / " + y + " = " + (x / y));
                } else {
                    System.out.println("당신이 입력한 숫자는 없거나 지원하지 않습니다");
                }
                stop();
            }
        } else if(k == 2) {
            while (true) {
                System.out.print("정수형식을 입력해주세여! : ");
                int x = sc.nextInt();
                String z2 = "";
                z2 = sc.next();
                int y = sc.nextInt();![](../../../../../../../var/folders/w7/2zvwfvps3jdb_3vnr2j36d3h0000gn/T/TemporaryItems/NSIRD_screencaptureui_N3LLm5/스크린샷 2022-08-05 오후 2.03.02.png)

                if (z2.equals("+")) {
                    System.out.println(x + " + " + y + " = " + (x + y));
                } else if (z2.equals("-")) {
                    System.out.println(x + " - " + y + " = " + (x - y));
                } else if (z2.equals("*")) {
                    System.out.println(x + " * " + y + " = " + (x * y));
                } else if (z2.equals("/")) {
                    System.out.println(x + " / " + y + " = " + (x / y));
                } else {
                    System.out.println("당신이 입력한 숫자는 없거나 지원하지 않습니다");
                }
                stop();
            }
        }
    }

    private static int stop() {
        System.out.println("'그만'을 외치면 시스템이 종료 됩니다");
        System.out.println("'계속'을 외치면 시스템이 종료 됩니다");
        Scanner sc = new Scanner(System.in);
        String z3 = "";
        z3 = sc.next();
        if(z3.equals("그만")) {
            System.out.println("시스템이 종료됩니다.");
            System.exit(0);
        } else if (z3.equals("계속")) {
            return 0;
        } else {
            System.out.println("정확하게 적어주세요!!");
            stop();
        }
        return 0;
    }
}