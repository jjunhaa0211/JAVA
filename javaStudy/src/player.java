//public class player {
//    public static void main(String[ ] args) {
//
//        player1 p = new player1();
//        p.name = "홍길동";
//        p.age = 20;
//        p.job = "도적";
//    }
//}
//
//class player1 {
//    int age;
//    String name;
//    String job;
//}

// 문제 : 아래가 실행되도록 해주세요.

class player {
    public static void main(String[] args) {
        사람1 a사람 = new 사람1();
//        팔 a왼팔 = new 팔();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이);
    }
}

class 사람1 extends 팔{
    public 팔 a왼팔;
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
}

class 팔{
    int 길이 =22;
}