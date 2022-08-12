public class manyClass {
    public static void main(String[] args) {
        controller1 aClass = new controller1();
        aClass.backgroundColor = "green";
        aClass.viewCont = 1;

        controller2 bClass = new controller2();
        bClass.collectionView = 2;
        bClass.viewCont = 4;

        controller3 cClass = new controller3();
        cClass.tableView = 1;
        cClass.viewCont = 2;

        controller4 dClass = new controller4();
        dClass.tabBarView = 5;
        dClass.viewCont = 6;

        controller5 eClass = new controller5();
        eClass.viewcontrollerView = 6;
        eClass.viewCont = 5;

    }
}

class controller1 {
    String backgroundColor;
    int viewCont;
}
class controller2 {
    int collectionView;
    int viewCont;
}
class controller3 {
    int tableView;
    int viewCont;
}
class controller4 {
    int tabBarView;
    int viewCont;
}
class controller5 {
    int viewcontrollerView;
    int viewCont;
}
