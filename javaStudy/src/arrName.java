public class arrName {
    public static void main(String[] args){
        int age1 = 10;
        int age2 = 11;
        int age3 = 12;

        int[] ages = new int[3];
        ages[0] = 10;
        ages[1] = 10;
        ages[2] = 10;

        String[] name = new String[3];
        name[0] = "철수";
        name[1] = "영희";
        name[2] = "영수";

        chulSoo a = new chulSoo();
        a.name = "철수";
        a.age = 22;
        a.stature = 180.5;

        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.stature);
    }
}

class chulSoo {
    String name;
    int age;
    double stature;
}
