//public class Plus {
//    public static void main(String[] args) {
//        계산기3.더한결과를_화면에_출력(10, 20);
//        // 출력 => 결과 : 30
//
//        계산기3.더한결과를_화면에_출력(50, 20);
//        // 출력 => 결과 : 70
//
//        계산기3.뺀결과를_화면에_출력(50, 20);
//        // 출력 => 결과 : 30
//
//        계산기3.뺀결과를_화면에_출력(5, 2);
//        // 출력 => 결과 : 3
//
//        계산기3.곱한결과를_화면에_출력(5, 2);
//        // 출력 => 결과 : 10
//
//
//    }
//}
//
//class 계산기3 {
//    static void 더한결과를_화면에_출력(int a, int b) {
//        System.out.println("a" + " + " + "b" + " = " + a+b);
//    }
//    static void 뺀결과를_화면에_출력(int a, int b) {
//        System.out.println(a - b);
//    }
//    static void 곱한결과를_화면에_출력(int a, int b) {
//        System.out.println("a" + " * " + "b" + " = " + a*b);
//    }
//}

class Plus {
    public static void main(String[] args) {
        int 결과;

        결과 = 계산기5.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기5.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기5.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기5.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기5.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21
    }
}

class 계산기5 {
    static int 합(int a, int b) {
        return a + b;
    }
    static int 차(int a, int b) {
        return a - b;
    }
    static int 곱(int a, int b) {
        return a * b;
    }
}