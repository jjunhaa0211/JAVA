//class Weapon {
//    public static void main(String[] args) {
//        무기 a무기 = new 무기();
//        a무기.휘두르기();
//    }
//}
//
//class 무기 {
//    void 휘두르기() {
//        System.out.println("무기를 휘두른다");
//    }
//}
//class 칼 extends 무기 {
//    void 베기() {
//        System.out.println("칼로 베다");
//    }
//}

// 문제 : 아래가 실행되도록 해주세요.

//class Weapon {
//    public static void main(String[] args) {
//        무기 a칼 = new 칼();
//        a칼 = new 활();
//    }
//}
//
//class 무기 {
//    void 공격(){
//        System.out.println("공격하다");
//    }
//}
//
//class 칼 extends 무기 {
//    void 베기(){
//        System.out.println("베다");
//    }
//}
//
//class 활 extends 무기 {
//    void 쏘기(){
//        System.out.println("쏘기");
//    }
//}

//class Weapon {
//    public static void main(String[] args) {
//        무기 a무기 = new 칼();
//        a무기.공격();
//        // 출력 : 칼로 공격합니다.
//    }
//}
//
//class 무기 {
//    void 공격() {
//
//    }
//}
//
//class 칼 extends 무기{
//    void 공격() {
//        System.out.println("칼로 찌르다!!!");
//    }
//}
//
//class 활 extends 무기 {
//    void 공격() {
//        System.out.println("활로 쏘다!!!");
//    }
//}

class Weapon {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브러이언");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립이");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크");
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    void 공격(String a) {
        System.out.println(a + "(가) 창(으)로 공격합니다.");
    }
}


