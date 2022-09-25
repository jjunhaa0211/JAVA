
// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

public class breathing {
    public static void main(String[] args) {
        people a = new people();
        a.breathe();
    }
}
class animal {
    void breathe() {
        System.out.println("숨쉬다.");
    }
}

class people extends animal {

}