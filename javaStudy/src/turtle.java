public class turtle {
    public static void main(String[] args) {
        Movetuttle tuttle = new Movetuttle();

        tuttle.work();
        // 출력 => 걷다
        tuttle.swim();
        // 출력 => 수영하다
    }
}

class Movetuttle {
    void work() {
        System.out.println("느릿느릿");
    }
    void swim() {
        System.out.println("첨벙첨벙");
    }
}
