package OOPS;

abstract class Course {
    abstract void course();

    void details(){
        System.out.println("Details");
    }
}

public class b_Tech extends Course {
    // @Override
    // void details() {
    //     // TODO Auto-generated method stub
    //     System.out.println("overrride");
    // }
    void course(){
        System.out.println("B-tech");
    }

    void branch(){
        System.out.println("CSE");
    }
}

class bca extends Course{
    void course(){
        System.out.println("BCA");
    }

    void branch(){
        System.out.println("System Designing");
    }
}