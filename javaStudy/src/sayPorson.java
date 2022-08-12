// 문제 : 사람을 말하게 해주세요.

public class sayPorson {
    public static void main(String[] args) {
        person people = new person();
        people.Say();
    }
}

class person {
    // 사람은 `말하다` 라는 기능을 가지고 있습니다.
    void Say() {
        System.out.println("사람이 말합니다.");
    }
}