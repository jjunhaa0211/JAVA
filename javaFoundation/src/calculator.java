import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식을 입력해주세여! : ");
        int x = sc.nextInt();
        String z = "";
        z = sc.next();
        int y = sc.nextInt();

        if(z.equals("+")){
            System.out.println(x + "+" + y + "=" +(x+y));
        } else if (z.equals("-")) {
            System.out.println(x + "-" + y + "=" +(x-y));
        } else if (z.equals("*")) {
            System.out.println(x + "*" + y + "=" +(x*y));
        } else if (z.equals("/")) {
            System.out.println(x + "/" + y + "=" +(x/y));
        } else {
            System.out.println("당신이 입력한 숫자는 없거나 지원하지 않습니다");
        }

    }
}
