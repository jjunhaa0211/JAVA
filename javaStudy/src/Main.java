public class Main {
    public static void main(String[] args){

        double rs2 = ge.sksnrl(10.2, 4.7);
        System.out.println(rs2);

        boolean rs3 = ge.isABiggerThanB(20, 10);
        System.out.println(rs3);
    }
}

class ge {
    static double sksnrl(double a, double b) {
        double c = a / b;
        return c;
    }

    static boolean isABiggerThanB(int a, int b) {
        if(a > b){
            return true;
        } else {
            return false;
        }
    }
}
