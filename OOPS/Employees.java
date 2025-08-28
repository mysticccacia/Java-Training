package OOPS;

public class Employees {
    private String name;
    private String id;
    private static int count;

    

    Employees(String name,String id){
        this.name =name;
        this.id = id;
        count++;
        System.out.println("Count:" + count);
    }

    void display(){
        System.out.println("Name:" + name);
        System.out.println("ID:" + id);
    }
}
