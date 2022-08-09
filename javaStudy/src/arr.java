public class arr {
    public static void main(String[ ] args){
//        int[] arr = new int[100];
//
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 0;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//
//        int[] arr2 = arr;
//
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//
//        int sum = arr[0] + arr[1] + arr[2] + arr[3];
//
//        System.out.println(sum);
//
//        int avg = sum / arr.length;
//
//        System.out.println(avg);
//        boolean[] arr1 = new boolean[3];
//
//        arr1[0] = true;
//        arr1[1] = true;
//        arr1[2] = false;
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);
//
//        double[] arr2 = new double[3];
//        arr2[0] = 3.14;
//        arr2[1] = 5.55;
//        arr2[2] = 10.0;
//
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//
        int[] arr3 = new int[10];
        int sum = 0;

        for(int i = 0; i < arr3.length; i++)
        {
            arr3[i] = (i + 1) * 10;
            System.out.println("배열"+ "["+i+"]" + " = " + arr3[i]);
            sum = sum + arr3[i];

        }
        System.out.println("합 : " + sum);
        System.out.println("평균" + " : " + sum / arr3.length);
    }
}