public class arrName {
    public static void main(String[] args){

//        int[] ages = new int[3];
//        ages[0] = 10;
//        ages[1] = 10;
//        ages[2] = 10;

//        String[] name = new String[3];
//        name[0] = "철수";
//        name[1] = "영희";
//        name[2] = "영수";

//        chulSoo a = new chulSoo();
//        a.name = "철수";
//        a.age = 22;
//        a.stature = 180.5;
//
//        System.out.println(a.name);
//        System.out.println(a.age);
//        System.out.println(a.stature);

//        ArrInt3 age2 = new ArrInt3();
//        var CoulSoo = age2.ChulSooAge = 10;
//        var Younghee = age2.YoungheeAge = 11;
//        var Youngsu = age2.YoungsuAge = 12;
//        age2.maritalStatus = false;
//
//        System.out.println(CoulSoo);
//        System.out.println(Younghee);
//        System.out.println(Youngsu);

        ChulSoo a = new ChulSoo();
        var ChulSooName = a.name = "철수";
        var ChulSooAge = a.age = 20;
        var ChulSooLove = a.love = false;

        System.out.println("이름 : " + ChulSooName);
        System.out.println("나이 : " + ChulSooAge);
        System.out.println("사랑 : " + ChulSooLove);
    }
}

class ChulSoo {
    int age;
    String name;
    boolean love;
}
//class ArrInt3 {
//    int ChulSooAge;
//    int YoungheeAge;
//    int YoungsuAge;
//    boolean maritalStatus;
//}

//class chulSoo {
//    String name;
//    int age;
//    double stature;
//}
